import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    void add() {
        Calculator calc = new Calculator();
        calc.setNumbers(10, 20);
        assertEquals(30, calc.add(),"덧셈 오류");
    }

    @Test
    void subtract() {
        Calculator calc = new Calculator();
        calc.setNumbers(20, 10);
        assertEquals(10, calc.subtract(),"뺄셈 오류");
    }

    @Test
    void multiply() {
        Calculator calc = new Calculator();
        calc.setNumbers(20, 10);
        assertEquals(200, calc.multiply(),"곱셈 오류");
    }

    @Test
    void divide() {
        Calculator calc = new Calculator();
        calc.setNumbers(20, 10);
        assertEquals(2, calc.divide(), "나눗셈 오류");
    }
}

// assertEquals