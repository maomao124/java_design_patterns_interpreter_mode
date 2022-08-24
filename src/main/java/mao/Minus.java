package mao;

/**
 * Project name(项目名称)：java设计模式_解释器模式
 * Package(包名): mao
 * Class(类名): Minus
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/24
 * Time(创建时间)： 12:21
 * Version(版本): 1.0
 * Description(描述)： 非终结符表达式角色 减法表达式
 */

public class Minus extends AbstractExpression
{
    private final AbstractExpression left;
    private final AbstractExpression right;

    public Minus(AbstractExpression left, AbstractExpression right)
    {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context)
    {
        return left.interpret(context) - right.interpret(context);
    }

    @Override
    public String toString()
    {
        return "(" + left.toString() + " - " + right.toString() + ")";
    }
}
