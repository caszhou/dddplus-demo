package org.example.cp.oms.domain.service;

import java.util.List;
import java.util.concurrent.locks.Lock;

import javax.annotation.Resource;
import javax.validation.constraints.NotNull;

import org.example.cp.oms.domain.CoreDomain;
import org.example.cp.oms.domain.ability.DecideStepsAbility;
import org.example.cp.oms.domain.ability.SerializableIsolationAbility;
import org.example.cp.oms.domain.model.OrderMain;
import org.example.cp.oms.domain.step.CancelOrderStepsExec;
import org.example.cp.oms.spec.Steps;
import org.example.cp.oms.spec.exception.OrderErrorReason;
import org.example.cp.oms.spec.exception.OrderException;

import io.github.dddplus.annotation.DomainService;
import io.github.dddplus.model.IDomainService;
import io.github.dddplus.runtime.DDD;
import lombok.extern.slf4j.Slf4j;

@DomainService(domain = CoreDomain.CODE)
@Slf4j
public class CancelOrder implements IDomainService {
    @Resource
    private CancelOrderStepsExec cancelOrderStepsExec;

    public void submit(@NotNull OrderMain orderModel) throws OrderException {
        Lock lock = DDD.findAbility(SerializableIsolationAbility.class).acquireLock(orderModel);
        if (SerializableIsolationAbility.useLock(lock) && !lock.tryLock()) {
            // 存在并发
            throw new OrderException(OrderErrorReason.SubmitOrder.OrderConcurrentNotAllowed);
        }
        List<String> steps =
            DDD.findAbility(DecideStepsAbility.class).decideSteps(orderModel, Steps.CancelOrder.Activity);
        cancelOrderStepsExec.execute(Steps.CancelOrder.Activity, steps, orderModel);
    }
}
