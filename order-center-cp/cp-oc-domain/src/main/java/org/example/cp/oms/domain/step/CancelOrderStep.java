package org.example.cp.oms.domain.step;

import org.example.cp.oms.domain.model.OrderMain;
import org.example.cp.oms.spec.Steps;
import org.example.cp.oms.spec.exception.OrderException;

import io.github.dddplus.step.IDomainStep;

public abstract class CancelOrderStep implements IDomainStep<OrderMain, OrderException> {
    @Override
    public String activityCode() {
        return Steps.CancelOrder.Activity;
    }
}
