package com.devops;

        import org.junit.jupiter.api.Test;
        import org.springframework.boot.test.context.SpringBootTest;

        import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CalculatorTests {


    @Test
    public void testSuma() {
        int resultado = Calculator.suma(2,3);
        int esperado = 5;
        assertEquals(esperado, resultado);
    }

    @Test
    public void testResta() {
        int resultado = Calculator.resta(3,2);
        int esperado = 1;
        assertEquals(esperado, resultado);
    }

}
