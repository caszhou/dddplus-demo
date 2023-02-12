package org.example.cp.oms.domain.ability;

import javax.validation.constraints.NotNull;

import org.example.cp.oms.domain.CoreDomain;
import org.example.cp.oms.spec.ext.IPresortExt;
import org.example.cp.oms.spec.model.IOrderMain;

import io.github.dddplus.annotation.DomainAbility;
import io.github.dddplus.runtime.BaseDomainAbility;

@DomainAbility(domain = CoreDomain.CODE, name = "预分拣的能力")
public class PresortAbility extends BaseDomainAbility<IOrderMain, IPresortExt> {
    public void presort(@NotNull IOrderMain model) {
        firstExtension(model).presort(model);
    }

    @Override
    public IPresortExt defaultExtension(@NotNull IOrderMain model) {
        return null;
    }
}
