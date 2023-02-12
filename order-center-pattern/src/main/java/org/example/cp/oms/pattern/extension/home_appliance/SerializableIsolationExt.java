package org.example.cp.oms.pattern.extension.home_appliance;

import java.util.concurrent.TimeUnit;

import javax.validation.constraints.NotNull;

import org.example.cp.oms.pattern.HomeAppliancePattern;
import org.example.cp.oms.spec.ext.ISerializableIsolationExt;
import org.example.cp.oms.spec.model.IOrderMain;
import org.example.cp.oms.spec.model.vo.LockEntry;

import io.github.dddplus.annotation.Extension;

@Extension(code = HomeAppliancePattern.CODE, value = "homeSerializableIsolationExt")
public class SerializableIsolationExt implements ISerializableIsolationExt {
    @Override
    public LockEntry createLockEntry(@NotNull IOrderMain model) {
        return new LockEntry(model.customerProvidedOrderNo(), 5, TimeUnit.MINUTES);
    }
}
