package mao;

/**
 * Project name(项目名称)：java设计模式_解释器模式
 * Package(包名): mao
 * Class(类名): Value
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/24
 * Time(创建时间)： 12:18
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Value extends AbstractExpression
{
    private final int value;

    public Value(int value)
    {
        this.value = value;
    }

    @Override
    public int interpret(Context context)
    {
        return value;
    }

    @Override
    public String toString()
    {
        return String.valueOf(value);
    }
}
