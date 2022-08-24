package mao;

/**
 * Project name(项目名称)：java设计模式_解释器模式
 * Package(包名): mao
 * Class(类名): Test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/24
 * Time(创建时间)： 12:26
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test
{
    public static void main(String[] args)
    {
        Context context = new Context();
        //变量
        Variable a = new Variable("a");
        Variable b = new Variable("b");
        Variable c = new Variable("c");
        Variable d = new Variable("d");
        Variable e = new Variable("e");

        context.assign(a, 1);
        context.assign(b, 2);
        context.assign(c, 3);
        context.assign(d, 4);
        context.assign(e, 5);

        //(a + ((b + (c - d)) - e))
        //(1 + ((2 + (3 - 4)) - 5))
        AbstractExpression abstractExpression = new Plus(a, new Minus(new Plus(b, new Minus(c, d)), e));
        int result = abstractExpression.interpret(context);
        System.out.println(abstractExpression);
        System.out.println(result);

        //(4 + (6 - 3))
        AbstractExpression abstractExpression1 = new Plus(new Value(4), new Minus(new Value(6), new Value(3)));
        System.out.println(abstractExpression1);
        int interpret = abstractExpression1.interpret(new Context());
        System.out.println(interpret);

    }
}
