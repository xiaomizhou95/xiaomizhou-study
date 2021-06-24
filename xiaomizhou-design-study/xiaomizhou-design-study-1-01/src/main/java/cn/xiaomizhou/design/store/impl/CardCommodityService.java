package cn.xiaomizhou.design.store.impl;

import cn.xiaomizhou.design.card.IQiYiCardService;
import cn.xiaomizhou.design.store.ICommodity;
import com.alibaba.fastjson.JSON;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @Description
 * @Author Rice
 * @Date 2021/6/24 15:28
 * @Version V1.0
 */
public class CardCommodityService implements ICommodity {

    private Logger logger = LoggerFactory.getLogger(CardCommodityService.class);

    private IQiYiCardService iQiYiCardService = new IQiYiCardService();

    @Override
    public void sendCommodity(String uid, String commodityId, String bizId, Map<String, String> extMap) {

        String mobile = queryUserMobile(uid);

        iQiYiCardService.grantToken(mobile, commodityId);

        logger.info("请求参数[爱奇艺兑换卡] -> uid:{} commodityId:{} bizId:{} extMap:{}", uid, commodityId, bizId, JSON.toJSONString(extMap));
        logger.info("测试结果[爱奇艺兑换卡]：success");
    }

    private String queryUserMobile(String uid) {
        return "15232223333";
    }
}
