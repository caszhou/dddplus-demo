package org.example.cp.oms.spec.ext;

import javax.validation.constraints.NotNull;

import org.example.cp.oms.spec.model.IOrderMain;

import io.github.dddplus.ext.IDomainExtension;

/**
 * 预分拣扩展点.
 * <p>
 * <p>
 * 根据配送地址获取配送站点信息，进而获取波次配置
 * </p>
 */
public interface IPresortExt extends IDomainExtension {
    void presort(@NotNull IOrderMain model);
}
