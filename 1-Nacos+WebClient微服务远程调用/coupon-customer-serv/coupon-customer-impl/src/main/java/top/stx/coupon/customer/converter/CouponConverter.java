package top.stx.coupon.customer.converter;

import top.stx.coupon.customer.dao.entity.Coupon;
import top.stx.coupon.template.api.beans.CouponInfo;

public class CouponConverter {
    public static CouponInfo convertToCoupon(Coupon coupon){
        return CouponInfo.builder()
                .id(coupon.getId())
                .status(coupon.getStatus().getCode())
                .shopId(coupon.getShopId())
                .userId(coupon.getUserId())
                .template(coupon.getTemplateInfo())
                .build();
    }
}
