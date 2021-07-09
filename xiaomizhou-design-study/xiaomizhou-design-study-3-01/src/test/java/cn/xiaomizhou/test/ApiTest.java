package cn.xiaomizhou.test;

import cn.xiaomizhou.design.Builder;
import cn.xiaomizhou.design.IMenu;
import org.junit.Test;

/**
 * @Description
 * @Author Rice
 * @Date 2021/7/9 16:33
 * @Version V1.0
 */
public class ApiTest {

    @Test
    public void test() {
        Builder builder = new Builder();
        IMenu levelOne = builder.levelOne(132.52D);
        System.out.println(levelOne.getDetail());

        System.out.println(builder.levelTwo(98.35D).getDetail());

        System.out.println(builder.levelThree(88.88D).getDetail());
    }
}
