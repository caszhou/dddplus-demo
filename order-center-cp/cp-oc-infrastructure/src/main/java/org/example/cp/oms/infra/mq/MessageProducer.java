package org.example.cp.oms.infra.mq;

import javax.validation.constraints.NotNull;

import org.example.cp.oms.domain.facade.mq.IMessageProducer;
import org.example.cp.oms.domain.model.OrderMain;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class MessageProducer implements IMessageProducer {
    @Override
    public void produce(@NotNull OrderMain orderModel) {
        log.info("已经发送给MQ：{}", orderModel);
    }
}
