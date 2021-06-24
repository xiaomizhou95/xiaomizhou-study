package cn.xiaomizhou.design.goods;

import com.alibaba.fastjson.JSON;

/**
 * @Description 模拟实物商品服务
 * @Author Rice
 * @Date 2021/6/24 15:21
 * @Version V1.0
 */
public class GoodsService {

    public boolean deliverGoods(DeliverReq deliverReq) {
        System.out.println("模拟发放实物商品一个:" + JSON.toJSONString(deliverReq));
        return true;
    }
}
