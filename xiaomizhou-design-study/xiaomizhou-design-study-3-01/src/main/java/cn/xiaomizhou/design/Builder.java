package cn.xiaomizhou.design;

import cn.xiaomizhou.design.ceilling.LevelOneCeiling;
import cn.xiaomizhou.design.ceilling.LevelTwoCeiling;
import cn.xiaomizhou.design.coat.DuluxCoat;
import cn.xiaomizhou.design.coat.LiBangCoat;
import cn.xiaomizhou.design.floor.ShengXiangFloor;
import cn.xiaomizhou.design.tile.DongPengTile;
import cn.xiaomizhou.design.tile.MarcoPoloTile;

/**
 * @Description
 * @Author Rice
 * @Date 2021/7/9 16:28
 * @Version V1.0
 */
public class Builder {

    public IMenu levelOne(Double area) {
        return new DecorationPackageMenu(area, "豪华欧式")
                .appendCeiling(new LevelTwoCeiling())
                .appendCoat(new DuluxCoat())
                .appendFloor(new ShengXiangFloor());
    }

    public IMenu levelTwo(Double area) {
        return new DecorationPackageMenu(area, "轻奢田园")
                .appendCeiling(new LevelTwoCeiling())
                .appendCoat(new LiBangCoat())
                .appendTile(new MarcoPoloTile());
    }

    public IMenu levelThree(Double area) {
        return new DecorationPackageMenu(area, "现代简约")
                .appendCeiling(new LevelOneCeiling())
                .appendCoat(new LiBangCoat())
                .appendTile(new DongPengTile());
    }
}
