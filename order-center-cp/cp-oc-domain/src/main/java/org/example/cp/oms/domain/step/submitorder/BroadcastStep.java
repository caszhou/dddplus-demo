package org.example.cp.oms.domain.step.submitorder;

import javax.annotation.Resource;
import javax.validation.constraints.NotNull;

import org.example.cp.oms.domain.facade.mq.IMessageProducer;
import org.example.cp.oms.domain.model.OrderMain;
import org.example.cp.oms.domain.step.SubmitOrderStep;
import org.example.cp.oms.spec.Steps;
import org.example.cp.oms.spec.exception.OrderException;

import io.github.dddplus.annotation.Step;

@Step(value = "submitMqStep")
public class BroadcastStep extends SubmitOrderStep {
    @Resource
    private IMessageProducer messageProducer;

    @Override
    public void execute(@NotNull OrderMain model) throws OrderException {
        messageProducer.produce(model);
    }

    @Override
    public String stepCode() {
        return Steps.SubmitOrder.BroadcastStep;
    }
}
