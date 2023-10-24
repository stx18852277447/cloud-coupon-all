package top.stx.coupon.calculation.template;

import top.stx.coupon.calculation.api.beans.ShoppingCart;

public interface RuleTemplate {
    ShoppingCart calculate(ShoppingCart settlement);
}
