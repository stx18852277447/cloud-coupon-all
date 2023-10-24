package top.stx.coupon.calculation.template.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import top.stx.coupon.calculation.template.AbstractRuleTemplate;
import top.stx.coupon.calculation.template.RuleTemplate;

import java.util.Random;

@Slf4j
@Component
public class RandomReductionTemplate extends AbstractRuleTemplate implements RuleTemplate {
    @Override
    protected Long calculateNewPrice(Long totalAmount, Long shopAmount, Long quota) {
        long maxBenefit=Math.min(shopAmount,quota);
        int reductionAmount=new Random().nextInt((int) maxBenefit);
        Long newCost=totalAmount-reductionAmount;
        log.debug("original price={}, new price={}",totalAmount,newCost);
        return newCost;
    }
}
