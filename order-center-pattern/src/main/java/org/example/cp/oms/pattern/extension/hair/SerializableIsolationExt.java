package org.example.cp.oms.pattern.extension.hair;

import java.util.concurrent.TimeUnit;

import javax.validation.constraints.NotNull;

import org.example.cp.oms.pattern.HairPattern;
import org.example.cp.oms.spec.ext.ISerializableIsolationExt;
import org.example.cp.oms.spec.model.IOrderMain;
import org.example.cp.oms.spec.model.vo.LockEntry;

import io.github.dddplus.annotation.Extension;

@Extension(code = HairPattern.CODE, value = "hairSerializableIsolationExt")
public class SerializableIsolationExt implements ISerializableIsolationExt {
    @Override
    public LockEntry createLockEntry(@NotNull IOrderMain model) {
        return new LockEntry(model.customerProvidedOrderNo(), 1, TimeUnit.HOURS);
    }
}
