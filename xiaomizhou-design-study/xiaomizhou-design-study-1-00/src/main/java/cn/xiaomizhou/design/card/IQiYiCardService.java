package cn.xiaomizhou.design.card;

/**
 * @Description 模拟爱奇艺会员卡服务
 * @Author Rice
 * @Date 2021/6/24 15:04
 * @Version V1.0
 */
public class IQiYiCardService {

    public void grantToken(String bindMobileNumber, String cardId) {
        System.out.println("模拟发放爱奇艺会员卡一张：" + bindMobileNumber + "，" + cardId);
    }
}
