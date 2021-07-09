package cn.xiaomizhou.design.tile;

import cn.xiaomizhou.design.Matter;

import java.math.BigDecimal;

/**
 * @Description 东鹏
 * @Author Rice
 * @Date 2021/7/9 15:48
 * @Version V1.0
 */
public class DongPengTile implements Matter {
    @Override
    public String scene() {
        return "地砖";
    }

    @Override
    public String brand() {
        return "东鹏地砖";
    }

    @Override
    public String model() {
        return "10001";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(102);
    }

    @Override
    public String desc() {
        return "东鹏地砖牛逼";
    }
}
