package org.example.bp.oms.ka.extension;

import java.util.List;

import org.example.bp.oms.ka.KaPartner;
import org.example.cp.oms.spec.ext.IReviseStepsExt;
import org.example.cp.oms.spec.model.IOrderMain;

import io.github.dddplus.annotation.Extension;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Extension(code = KaPartner.CODE, value = "kaReviseStepsExt")
public class ReviseStepsExt implements IReviseStepsExt {
    @Override
    public List<String> reviseSteps(IOrderMain model) {
        log.info("KA will not revise subsequent steps");
        return null;
    }
}
