package top.stx.coupon.calculation.controller.service;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import top.stx.coupon.calculation.api.beans.ShoppingCart;
import top.stx.coupon.calculation.api.beans.SimulationOrder;
import top.stx.coupon.calculation.api.beans.SimulationResponse;

public interface CouponCalculationService {
    ShoppingCart calculateOrderPrice(@RequestBody ShoppingCart cart);
    SimulationResponse simulateOrder(@RequestBody SimulationOrder cart);
}
