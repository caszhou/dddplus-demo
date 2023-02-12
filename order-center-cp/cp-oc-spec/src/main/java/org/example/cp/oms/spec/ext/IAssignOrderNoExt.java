package org.example.cp.oms.spec.ext;

import javax.validation.constraints.NotNull;

import org.example.cp.oms.spec.model.IOrderMain;

import io.github.dddplus.ext.IDomainExtension;

/**
 * 生成、分配订单号扩展点.
 */
public interface IAssignOrderNoExt extends IDomainExtension {
    void assignOrderNo(@NotNull IOrderMain model);
}
