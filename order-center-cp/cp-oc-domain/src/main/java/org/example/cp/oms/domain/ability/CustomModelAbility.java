package org.example.cp.oms.domain.ability;

import javax.validation.constraints.NotNull;

import org.example.cp.oms.domain.CoreDomain;
import org.example.cp.oms.spec.model.IOrderMain;

import io.github.dddplus.annotation.DomainAbility;
import io.github.dddplus.ext.IModelAttachmentExt;
import io.github.dddplus.runtime.BaseDomainAbility;

@DomainAbility(domain = CoreDomain.CODE)
public class CustomModelAbility extends BaseDomainAbility<IOrderMain, IModelAttachmentExt> {
    public void explain(@NotNull IOrderMain model) {
        firstExtension(model).explain(model.requestProfile(), model);
    }

    @Override
    public IModelAttachmentExt defaultExtension(IOrderMain model) {
        return null;
    }
}
