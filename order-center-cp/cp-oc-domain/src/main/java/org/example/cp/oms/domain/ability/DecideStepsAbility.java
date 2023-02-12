package org.example.cp.oms.domain.ability;

import org.example.cp.oms.domain.CoreDomain;
import org.example.cp.oms.spec.DomainAbilities;
import org.example.cp.oms.spec.model.IOrderMain;

import io.github.dddplus.annotation.DomainAbility;
import io.github.dddplus.runtime.BaseDecideStepsAbility;

@DomainAbility(domain = CoreDomain.CODE, name = "动态决定领域步骤的能力", tags = DomainAbilities.decideSteps)
public class DecideStepsAbility extends BaseDecideStepsAbility<IOrderMain> {}
