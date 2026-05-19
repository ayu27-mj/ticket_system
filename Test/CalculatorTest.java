import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void case1() {
        Calculator calc = new Calculator();
        String expected="無料";
        String actual=calc.ticket_system(0);
        assertEquals(expected,actual);
    }

    @Test
    void case2() {
        Calculator calc = new Calculator();
        String expected="無料";
        String actual=calc.ticket_system(3);
        assertEquals(expected,actual);
    }

    @Test
    void case3() {
        Calculator calc = new Calculator();
        String expected="無料";
        String actual=calc.ticket_system(5);
        assertEquals(expected,actual);
    }

    @Test
    void case4() {
        Calculator calc = new Calculator();
        String expected="500円";
        String actual=calc.ticket_system(6);
        assertEquals(expected,actual);
    }

    @Test
    void case5() {
        Calculator calc = new Calculator();
        String expected="500円";
        String actual=calc.ticket_system(10);
        assertEquals(expected,actual);
    }

    @Test
    void case6() {
        Calculator calc = new Calculator();
        String expected="500円";
        String actual=calc.ticket_system(12);
        assertEquals(expected,actual);
    }

    @Test
    void case7() {
        Calculator calc = new Calculator();
        String expected="1000円";
        String actual=calc.ticket_system(13);
        assertEquals(expected,actual);
    }

    @Test
    void case8() {
        Calculator calc = new Calculator();
        String expected="1000円";
        String actual=calc.ticket_system(15);
        assertEquals(expected,actual);
    }

    @Test
    void case9() {
        Calculator calc = new Calculator();
        String expected="1000円";
        String actual=calc.ticket_system(17);
        assertEquals(expected,actual);
    }

    @Test
    void case10() {
        Calculator calc = new Calculator();
        String expected="1500円";
        String actual=calc.ticket_system(18);
        assertEquals(expected,actual);
    }

    @Test
    void case11() {
        Calculator calc = new Calculator();
        String expected="1500円";
        String actual=calc.ticket_system(20);
        assertEquals(expected,actual);
    }
}