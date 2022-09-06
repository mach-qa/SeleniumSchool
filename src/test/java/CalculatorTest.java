import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.assertThat;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalculatorTest {

    @Test
    @DisplayName("adding 200 and 70")
    @Tag("regression")
    @Tag("Calculator")
    @Order(3)
    void add1() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.add(200, 70);
        int expectedResult = 270;

        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    @DisplayName("adding 10 and 1")
    @Tag("regression")
    @Tag("Calculator")
    @Order(2)
    void add2() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.add(10, 1);
        int expectedResult = 11;

        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    @DisplayName("adding 4 and 7")
    @Tag("Calculator")
    @Order(1)
    void add3() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.add(4, 7);
        int expectedResult = 232;

        assertThat(actualResult).isEqualTo(expectedResult);
    }

}
