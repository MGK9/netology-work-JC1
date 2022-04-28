package StreamAPIprod.Calculator;

import java.util.function.*;

public class Calculator {

    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
//    BinaryOperator<Integer> devide = (x, y) -> x / y;
//    Ошибка возникает при попытке делить значение на ноль
//    Т.к делить на ноль нельзя, можно заменить ответ нулем чтобы не выбрасывало ошибку
//    Можно было бы конечно сделать многострочный блок, сменить
//    Integer на String и вернуть в качестве ответа описание об ошибке но мне лень
//    (и так сойдет я надеюсь) или есть еще варианты исправления о которых я не додумался?
    BinaryOperator<Integer> devide = (x, y) -> (y == 0) ? 0 : (x / y);

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;
}