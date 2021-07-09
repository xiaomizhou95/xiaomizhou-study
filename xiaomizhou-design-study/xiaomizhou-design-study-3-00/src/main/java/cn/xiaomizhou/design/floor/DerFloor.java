package cn.xiaomizhou.design.floor;

import cn.xiaomizhou.design.Matter;

import java.math.BigDecimal;

/**
 * @Description 德尔
 * @Author Rice
 * @Date 2021/7/9 15:44
 * @Version V1.0
 */
public class DerFloor implements Matter {
    @Override
    public String scene() {
        return "地板";
    }

    @Override
    public String brand() {
        return "德尔(Der)";
    }

    @Override
    public String model() {
        return "A+";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(119);
    }

    @Override
    public String desc() {
        return "德尔地板";
    }
}
