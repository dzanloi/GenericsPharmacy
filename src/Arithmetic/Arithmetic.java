package Arithmetic;

import java.util.ArrayList;

public class Arithmetic<num1 extends Number, num2 extends Number> {
    ArrayList<Number> arrayList;
    Number number1;
    Number number2;

    public Arithmetic(num1 number1, num2 number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    //add
    public Number add() {
        return number1.doubleValue() + number2.doubleValue();
    }


    //sub
    public Number subtract() {
        return number1.doubleValue() - number2.doubleValue();
    }


    //mult
    public Number multiply() {
        return number1.doubleValue() * number2.doubleValue();
    }


    //div
    public Number divide() {
        if (number2.doubleValue() == 0) {
            throw new ArithmeticException("Cannot divide by 0");
        }
        return number1.doubleValue() / number2.doubleValue();
    }


    //getmin
    public Number getMin() {
        return (number1.doubleValue() < number2.doubleValue()) ? number1 : number2;
    }


    //getmax
    public Number getMax() {
        return (number1.doubleValue() > number2.doubleValue()) ? number1 : number2;
    }
}
