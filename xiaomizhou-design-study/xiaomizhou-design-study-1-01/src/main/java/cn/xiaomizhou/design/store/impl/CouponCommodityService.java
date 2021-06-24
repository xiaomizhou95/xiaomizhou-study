package cn.xiaomizhou.design.store.impl;

import cn.xiaomizhou.design.coupon.CouponResult;
import cn.xiaomizhou.design.coupon.CouponService;
import cn.xiaomizhou.design.store.ICommodity;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @Description
 * @Author Rice
 * @Date 2021/6/24 15:41
 * @Version V1.0
 */
public class CouponCommodityService implements ICommodity {

    private Logger logger = LoggerFactory.getLogger(CouponCommodityService.class);

    private CouponService couponService = new CouponService();

    @Override
    public void sendCommodity(String uid, String commodityId, String bizId, Map<String, String> extMap) {
        CouponResult couponResult = couponService.sendCoupon(uid, commodityId, bizId);

        logger.info("请求参数[优惠券] -> uid:{} commodityId:{} bizId:{} extMap:{}", uid, commodityId, bizId, JSON.toJSONString(extMap));
        logger.info("测试结果[优惠券]：{}", JSON.toJSONString(couponResult));

        if (!"0000".equals(couponResult.getCode())) {
            throw new RuntimeException(couponResult.getInfo());
        }
    }
}
