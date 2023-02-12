package org.example.bp.oms.isv.extension;

import java.util.concurrent.TimeUnit;

import javax.validation.constraints.NotNull;

import org.example.bp.oms.isv.IsvPartner;
import org.example.cp.oms.spec.ext.ISerializableIsolationExt;
import org.example.cp.oms.spec.model.IOrderMain;
import org.example.cp.oms.spec.model.vo.LockEntry;

import io.github.dddplus.annotation.Extension;

@Extension(code = IsvPartner.CODE, value = "isvSerializableIsolationExt", name = "ISV场景的订单锁机制")
public class SerializableIsolationExt implements ISerializableIsolationExt {
    @Override
    public LockEntry createLockEntry(@NotNull IOrderMain model) {
        return new LockEntry(model.customerProvidedOrderNo(), 50, TimeUnit.MINUTES);
    }
}
