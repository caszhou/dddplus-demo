package org.example.cp.oms.spec.ext;

import javax.validation.constraints.NotNull;

import org.example.cp.oms.spec.model.IOrderMain;

import io.github.dddplus.ext.IDomainExtension;

/**
 * 敏感词信息获取.
 */
public interface ISensitiveWordsExt extends IDomainExtension {
    String[] extract(@NotNull IOrderMain model);
}
