package cn.xiaomizhou.design;

import java.math.BigDecimal;

/**
 * @Description
 * @Author Rice
 * @Date 2021/7/9 15:31
 * @Version V1.0
 */
public interface Matter {

    String scene(); //场景：地板、地砖、涂料、吊顶

    String brand(); //品牌

    String model(); //型号

    BigDecimal price(); //价格

    String desc(); //描述
}
