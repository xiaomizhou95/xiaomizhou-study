package cn.xiaomizhou.design.coupon;

/**
 * @Description
 * @Author Rice
 * @Date 2021/6/24 15:09
 * @Version V1.0
 */
public class CouponResult {

    private String code;
    private String info;

    public CouponResult(String code, String info) {
        this.code = code;
        this.info = info;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
