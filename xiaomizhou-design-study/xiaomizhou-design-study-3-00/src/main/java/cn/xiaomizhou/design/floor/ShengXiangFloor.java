package cn.xiaomizhou.design.floor;

import cn.xiaomizhou.design.Matter;

import java.math.BigDecimal;

/**
 * @Description 圣象
 * @Author Rice
 * @Date 2021/7/9 15:46
 * @Version V1.0
 */
public class ShengXiangFloor implements Matter {
    @Override
    public String scene() {
        return "地板";
    }

    @Override
    public String brand() {
        return "圣像";
    }

    @Override
    public String model() {
        return "一级";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(318);
    }

    @Override
    public String desc() {
        return "圣象地板";
    }
}
