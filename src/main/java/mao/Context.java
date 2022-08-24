package mao;

import java.util.HashMap;
import java.util.Map;

/**
 * Project name(项目名称)：java设计模式_解释器模式
 * Package(包名): mao
 * Class(类名): Context
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/24
 * Time(创建时间)： 12:23
 * Version(版本): 1.0
 * Description(描述)： 环境类
 */

public class Context
{
    private final Map<Variable, Integer> map;

    public Context()
    {
        this.map = new HashMap<>();
    }

    public void assign(Variable var, Integer value)
    {
        map.put(var, value);
    }

    public int getValue(Variable var)
    {
        return map.get(var);
    }
}
