package StreamAPIprod.Calculator;

public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(2, 2);
        calc.println.accept(a);

        int b = calc.minus.apply(100,60);
        calc.println.accept(b);

        int c = calc.multiply.apply(8,7);
        calc.println.accept(c);

//      Надо добавить проверку деления на ноль
//      значение интовое поэтому результатом будет целое число
        try {
            int d = calc.devide.apply(b,a);
            calc.println.accept(d);

            d = calc.devide.apply(a,0);
            calc.println.accept(d);
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя");
        }

        int e = calc.devide.apply(5,0);
        calc.println.accept(e);

        int pow = calc.pow.apply(-12);
        calc.println.accept(pow);

        int absPlus = calc.abs.apply(5);
        calc.println.accept(absPlus);

        int absMinus = calc.abs.apply(-148);
        calc.println.accept(absMinus);

        boolean positive = calc.isPositive.test(100);
        System.out.println(positive);

        boolean notPositive = calc.isPositive.test(-100);
        System.out.println(notPositive);
    }
}