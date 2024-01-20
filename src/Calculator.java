import java.util.function.*;

public class Calculator {

    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = Integer::sum;
    BinaryOperator<Integer> minus = (x,y) -> x - y;
    BinaryOperator<Integer> multiply = (x,y) -> x * y;
    BinaryOperator<Integer> devide = (x,y) -> {  // так как y=0 выводится ошибка "деление на ноль", необходимо
        // обработать данное исключение
        if (y != 0) return x / y;
        System.out.println("Деление на 0!");
        return 0;
    };
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;
}
