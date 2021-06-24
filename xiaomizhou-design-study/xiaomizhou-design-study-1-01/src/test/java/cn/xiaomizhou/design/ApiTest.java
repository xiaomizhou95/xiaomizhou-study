package cn.xiaomizhou.design;

import cn.xiaomizhou.design.store.ICommodity;
import cn.xiaomizhou.design.store.impl.CouponCommodityService;
import org.junit.Test;

/**
 * @Description
 * @Author Rice
 * @Date 2021/6/24 16:06
 * @Version V1.0
 */
public class ApiTest {

    @Test
    public void test01() throws InstantiationException, IllegalAccessException {
        StoreFactory storeFactory = new StoreFactory();

        //commodityType 1-爱奇艺 2-优惠券 3-实物商品
        ICommodity commodityService = storeFactory.getCommodityService(1);
        commodityService.sendCommodity("1", "T1", null, null);

        ICommodity commodityService1 = storeFactory.getCommodityService(CouponCommodityService.class);
        commodityService1.sendCommodity("2", "T2", "B2", null);
    }
}
