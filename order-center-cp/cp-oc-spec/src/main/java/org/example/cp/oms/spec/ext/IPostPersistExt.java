package org.example.cp.oms.spec.ext;

import javax.validation.constraints.NotNull;

import org.example.cp.oms.spec.model.IOrderMain;

import io.github.dddplus.ext.IDomainExtension;

/**
 * 落库后的处理扩展点.
 */
public interface IPostPersistExt extends IDomainExtension {
    void afterPersist(@NotNull IOrderMain model);
}
