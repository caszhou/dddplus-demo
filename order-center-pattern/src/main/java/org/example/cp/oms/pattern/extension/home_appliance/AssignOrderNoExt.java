package org.example.cp.oms.pattern.extension.home_appliance;

import javax.validation.constraints.NotNull;

import org.example.cp.oms.pattern.HomeAppliancePattern;
import org.example.cp.oms.spec.ext.IAssignOrderNoExt;
import org.example.cp.oms.spec.model.IOrderMain;

import io.github.dddplus.annotation.Extension;

@Extension(code = HomeAppliancePattern.CODE, value = "homeAssignOrderNoExt")
public class AssignOrderNoExt implements IAssignOrderNoExt {
    public static final String HOME_ORDER_NO = "SO9987012";

    @Override
    public void assignOrderNo(@NotNull IOrderMain model) {
        model.assignOrderNo(this, HOME_ORDER_NO);
    }
}
