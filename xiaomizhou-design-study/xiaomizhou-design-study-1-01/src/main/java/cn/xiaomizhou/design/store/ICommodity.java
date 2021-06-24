package cn.xiaomizhou.design.store;

import java.util.Map;

public interface ICommodity {

    /**
     *
     * @param uid 用户ID
     * @param commodityId 奖品ID
     * @param bizId 业务ID
     * @param extMap 扩展字段
     */
    void sendCommodity(String uid, String commodityId, String bizId, Map<String, String> extMap);
}
