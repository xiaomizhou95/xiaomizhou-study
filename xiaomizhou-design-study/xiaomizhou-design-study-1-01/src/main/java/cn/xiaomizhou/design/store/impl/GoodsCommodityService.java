package cn.xiaomizhou.design.store.impl;

import cn.xiaomizhou.design.goods.DeliverReq;
import cn.xiaomizhou.design.goods.GoodsService;
import cn.xiaomizhou.design.store.ICommodity;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @Description
 * @Author Rice
 * @Date 2021/6/24 15:50
 * @Version V1.0
 */
public class GoodsCommodityService implements ICommodity {

    private Logger logger = LoggerFactory.getLogger(GoodsCommodityService.class);

    private GoodsService goodsService = new GoodsService();

    @Override
    public void sendCommodity(String uid, String commodityId, String bizId, Map<String, String> extMap) {
        DeliverReq deliverReq = new DeliverReq();
        deliverReq.setUserName(queryUserName(uid));
        deliverReq.setUserPhone(queryUserPhone(uid));
        deliverReq.setSku(commodityId);
        deliverReq.setOrderId(bizId);
        deliverReq.setConsigneeUserName(extMap.get("consigneeUserName"));
        deliverReq.setConsigneeUserPhone(extMap.get("consigneeUserPhone"));
        deliverReq.setConsigneeUserAddress(extMap.get("consigneeUserAddress"));

        boolean isSuccess = goodsService.deliverGoods(deliverReq);

        logger.info("请求参数[实物商品] -> uid:{} commodityId:{} bizId:{} extMap:{}", uid, commodityId, bizId, JSON.toJSONString(extMap));
        logger.info("测试结果[实物商品]：{}", isSuccess);

        if (!isSuccess) {
            throw new RuntimeException("[实物商品]发放失败");
        }

    }

    private String queryUserPhone(String uid) {
        return "15232223333";
    }

    private String queryUserName(String uid) {
        return "茜茜";
    }
}
