package org.example.cp.oms.domain.ability;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.example.cp.oms.domain.CoreDomain;
import org.example.cp.oms.domain.model.OrderMain;
import org.example.cp.oms.spec.ext.IReviseStepsExt;

import io.github.dddplus.annotation.DomainAbility;
import io.github.dddplus.runtime.BaseDomainAbility;

@DomainAbility(domain = CoreDomain.CODE)
public class ReviseStepsAbility extends BaseDomainAbility<OrderMain, IReviseStepsExt> {
    public List<String> revisedSteps(@NotNull OrderMain model) {
        // execute ext with timeout 300ms
        return firstExtension(model, 300).reviseSteps(model);
    }

    @Override
    public IReviseStepsExt defaultExtension(@NotNull OrderMain model) {
        return null;
    }
}
