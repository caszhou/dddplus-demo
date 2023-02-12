package org.example.cp.oms.pattern;

import javax.validation.constraints.NotNull;

import org.example.cp.oms.spec.Patterns;
import org.example.cp.oms.spec.model.IOrderMain;

import io.github.dddplus.annotation.Pattern;
import io.github.dddplus.ext.IIdentityResolver;

@Pattern(code = HomeAppliancePattern.CODE, name = "家用电器行业模式")
public class HomeAppliancePattern implements IIdentityResolver<IOrderMain> {
    public static final String CODE = Patterns.HomeAppliance;

    @Override
    public boolean match(@NotNull IOrderMain model) {
        if (model.getCustomerNo() == null) {
            return false;
        }
        return model.getCustomerNo().equals(CODE);
    }
}
