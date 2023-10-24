package top.stx.coupon.calculation.template.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import top.stx.coupon.calculation.template.AbstractRuleTemplate;
import top.stx.coupon.calculation.template.RuleTemplate;

@Slf4j
@Component
public class MoneyOffTemplate extends AbstractRuleTemplate implements RuleTemplate {
    @Override
    protected Long calculateNewPrice(Long totalAmount, Long shopAmount, Long quota) {
        Long benefitAmount=shopAmount < quota ? shopAmount : quota;
        return totalAmount - benefitAmount;
    }
}
