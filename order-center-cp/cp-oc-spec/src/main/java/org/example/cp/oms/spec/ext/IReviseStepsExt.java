package org.example.cp.oms.spec.ext;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.example.cp.oms.spec.model.IOrderMain;

import io.github.dddplus.ext.IDomainExtension;

public interface IReviseStepsExt extends IDomainExtension {
    List<String> reviseSteps(@NotNull IOrderMain model);
}
