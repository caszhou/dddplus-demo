package org.example.cp.oms.pattern.extension.hair;

import java.util.ArrayList;
import java.util.List;

import org.example.cp.oms.pattern.HairPattern;
import org.example.cp.oms.spec.Steps;
import org.example.cp.oms.spec.ext.IReviseStepsExt;
import org.example.cp.oms.spec.model.IOrderMain;

import io.github.dddplus.annotation.Extension;

@Extension(code = HairPattern.CODE, value = "hairReviseStepsExt")
public class ReviseStepsExt implements IReviseStepsExt {
    @Override
    public List<String> reviseSteps(IOrderMain model) {
        if (Steps.SubmitOrder.Activity.equals(model.currentActivity())) {
            if (model.currentStep().equals(Steps.SubmitOrder.BasicStep)) {
                List<String> subsequentSteps = new ArrayList<>();
                return subsequentSteps; // 没有后续步骤了：跳过PersistStep
            }
        }
        List<String> result = new ArrayList<>();
        return result;
    }
}
