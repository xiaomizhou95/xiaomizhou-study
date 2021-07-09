package cn.xiaomizhou.design.tile;

import cn.xiaomizhou.design.Matter;

import java.math.BigDecimal;

/**
 * @Description
 * @Author Rice
 * @Date 2021/7/9 15:50
 * @Version V1.0
 */
public class MarcoPoloTile implements Matter {
    @Override
    public String scene() {
        return "地砖";
    }

    @Override
    public String brand() {
        return "马可波罗";
    }

    @Override
    public String model() {
        return "默认";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(140);
    }

    @Override
    public String desc() {
        return "马可波罗地砖";
    }
}
