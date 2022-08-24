package mao;

/**
 * Project name(项目名称)：java设计模式_解释器模式
 * Package(包名): mao
 * Class(类名): Variable
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/24
 * Time(创建时间)： 12:22
 * Version(版本): 1.0
 * Description(描述)： 终结符表达式角色 变量表达式
 */

public class Variable extends AbstractExpression
{
    private final String name;

    public Variable(String name)
    {
        this.name = name;
    }

    @Override
    public int interpret(Context context)
    {
        return context.getValue(this);
    }

    @Override
    public String toString()
    {
        return name;
    }
}
