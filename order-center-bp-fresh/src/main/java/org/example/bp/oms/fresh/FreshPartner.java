package org.example.bp.oms.fresh;

import org.example.cp.oms.spec.model.IOrderMain;

import io.github.dddplus.annotation.Partner;
import io.github.dddplus.ext.IIdentityResolver;

@Partner(code = FreshPartner.CODE, name = "生鲜业务前台BP")
public class FreshPartner implements IIdentityResolver<IOrderMain> {
    public static final String CODE = "fresh";

    @Override
    public boolean match(IOrderMain model) {
        return model.getSource().toLowerCase().equals(CODE);
    }
}
