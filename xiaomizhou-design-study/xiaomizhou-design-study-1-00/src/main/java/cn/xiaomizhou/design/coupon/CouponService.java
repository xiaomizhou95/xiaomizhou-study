package cn.xiaomizhou.design.coupon;

/**
 * @Description 模拟发放优惠券
 * @Author Rice
 * @Date 2021/6/24 15:12
 * @Version V1.0
 */
public class CouponService {

    public CouponResult sendCoupon(String uid, String couponNumber, String uuid) {
        System.out.println("模拟发放优惠券一张:" + uid + "，" + couponNumber + "，" + uuid);
        return new CouponResult("0000", "发放成功");
    }
}
