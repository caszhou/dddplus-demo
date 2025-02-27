package org.example.bp.oms.ka.extension;

import java.util.concurrent.TimeUnit;

import javax.validation.constraints.NotNull;

import org.example.bp.oms.ka.KaPartner;
import org.example.cp.oms.spec.ext.ISerializableIsolationExt;
import org.example.cp.oms.spec.model.IOrderMain;
import org.example.cp.oms.spec.model.vo.LockEntry;

import io.github.dddplus.annotation.Extension;
import lombok.extern.slf4j.Slf4j;

@Extension(code = KaPartner.CODE, value = "kaSerializableIsolationExt")
@Slf4j
public class SerializableIsolationExt implements ISerializableIsolationExt {
    @Override
    public LockEntry createLockEntry(@NotNull IOrderMain model) {
        log.info("KA的锁TTL大一些");
        return new LockEntry(model.customerProvidedOrderNo(), 11, TimeUnit.MINUTES);
    }
}
