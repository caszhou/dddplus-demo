package org.example.cp.oms.domain.step.submitorder;

import javax.validation.constraints.NotNull;

import org.example.cp.oms.domain.model.OrderMain;
import org.example.cp.oms.domain.step.SubmitOrderStep;
import org.example.cp.oms.spec.Steps;
import org.example.cp.oms.spec.exception.OrderException;

import io.github.dddplus.annotation.Step;
import lombok.extern.slf4j.Slf4j;

@Step(value = "submitProductStep", name = "订单里产品校验", tags = Steps.Tags.Product)
@Slf4j
public class ProductStep extends SubmitOrderStep {
    @Override
    public void execute(@NotNull OrderMain model) throws OrderException {}

    @Override
    public String stepCode() {
        return Steps.SubmitOrder.ProductStep;
    }
}
