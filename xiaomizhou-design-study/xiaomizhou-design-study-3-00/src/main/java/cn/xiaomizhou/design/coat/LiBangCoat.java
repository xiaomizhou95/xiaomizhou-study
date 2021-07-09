package cn.xiaomizhou.design.coat;

import cn.xiaomizhou.design.Matter;

import java.math.BigDecimal;

/**
 * @Description 立邦
 * @Author Rice
 * @Date 2021/7/9 15:43
 * @Version V1.0
 */
public class LiBangCoat implements Matter {
    @Override
    public String scene() {
        return "涂料";
    }

    @Override
    public String brand() {
        return "立邦";
    }

    @Override
    public String model() {
        return "默认级别";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(650);
    }

    @Override
    public String desc() {
        return "立邦油漆";
    }
}
