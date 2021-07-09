package cn.xiaomizhou.design.ceilling;

import cn.xiaomizhou.design.Matter;

import java.math.BigDecimal;

/**
 * @Description 二级顶
 * @Author Rice
 * @Date 2021/7/9 15:38
 * @Version V1.0
 */
public class LevelTwoCeiling implements Matter {
    @Override
    public String scene() {
        return "吊顶";
    }

    @Override
    public String brand() {
        return "装修公司自带";
    }

    @Override
    public String model() {
        return "二级顶";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(850);
    }

    @Override
    public String desc() {
        return "两个层次的吊顶，二级吊顶高度一般往下吊20cm,如果层高很高，则可以增加每级的厚度";
    }
}
