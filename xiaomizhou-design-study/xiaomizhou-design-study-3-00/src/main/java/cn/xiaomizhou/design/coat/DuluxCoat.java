package cn.xiaomizhou.design.coat;

import cn.xiaomizhou.design.Matter;

import java.math.BigDecimal;

/**
 * @Description 多乐士涂料
 * @Author Rice
 * @Date 2021/7/9 15:40
 * @Version V1.0
 */
public class DuluxCoat implements Matter {
    @Override
    public String scene() {
        return "涂料";
    }

    @Override
    public String brand() {
        return "多乐士(Dulux)";
    }

    @Override
    public String model() {
        return "第二代";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(719);
    }

    @Override
    public String desc() {
        return "多乐士是名牌";
    }
}
