package top.stx.coupon.customer.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import top.stx.coupon.customer.dao.entity.Coupon;

public interface CouponDao extends JpaRepository<Coupon,Long> {
    long countByUserIdAndTemplateId(Long userId,Long templateId);
}
