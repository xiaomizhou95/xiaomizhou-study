package cn.xiaomizhou.design;

import cn.xiaomizhou.design.store.ICommodity;
import cn.xiaomizhou.design.store.impl.CardCommodityService;
import cn.xiaomizhou.design.store.impl.CouponCommodityService;
import cn.xiaomizhou.design.store.impl.GoodsCommodityService;

/**
 * @Description 商店工厂类
 * @Author Rice
 * @Date 2021/6/24 15:39
 * @Version V1.0
 */
public class StoreFactory {

    /**
     * 奖品类型方式实例化
     * @param commodityType 1-爱奇艺 2-优惠券 3-实物商品
     * @return
     */
    public ICommodity getCommodityService(Integer commodityType) {
        if (null == commodityType) return null;

        if (1 == commodityType) return new CardCommodityService();

        if (2 == commodityType) return new CouponCommodityService();

        if (3 == commodityType) return new GoodsCommodityService();

        throw new RuntimeException("不存在的奖品服务类型");

    }

    public ICommodity getCommodityService(Class<? extends ICommodity> clazz) throws InstantiationException, IllegalAccessException {
        if (null == clazz) return null;

        return clazz.newInstance();
    }


}
