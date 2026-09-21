import static org.junit.jupiter.api.Assertions.*;

class TaskTwoTest {

    @org.junit.jupiter.api.Test
    void calculateZero() {
        double expected = -1.0;
        double actual = TaskTwo.calculate(0);
        assertEquals(expected, actual, 1e-9);
    }
}