package org.example.cp.oms.pattern;

import javax.validation.constraints.NotNull;

import org.example.cp.oms.spec.Patterns;
import org.example.cp.oms.spec.model.IOrderMain;

import io.github.dddplus.annotation.Pattern;
import io.github.dddplus.ext.IIdentityResolver;

@Pattern(code = HairPattern.CODE, name = "海尔业务模式")
public class HairPattern implements IIdentityResolver<IOrderMain> {
    public static final String CODE = Patterns.Hair;

    @Override
    public boolean match(@NotNull IOrderMain model) {
        if (model.getCustomerNo() == null) {
            return false;
        }
        return model.getCustomerNo().equals(CODE);
    }
}
