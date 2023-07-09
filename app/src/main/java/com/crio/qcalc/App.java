
package com.crio.qcalc;
import java.lang.*;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
       System.out.println(new App().getGreeting());
        StandardCalculator calc = new StandardCalculator();
        
        calc.add(4,5);
        calc.printResult();
        calc.subtract(7,4);
        calc.printResult();
        calc.clearResult();
        calc.printResult();
        calc.multiply(3,4);
        calc.printResult();
        calc.divide(10,2);
        calc.printResult();
    }
}
