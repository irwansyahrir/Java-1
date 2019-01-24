package java.com.conversions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecimalToAnyBaseTest {

    @Test
    public void testDecimalToAnyBase() {
        DecimalToAnyBase decimalToAnyBase = new DecimalToAnyBase();
        assertEquals("Incorrect Conversion", "100", decimalToAnyBase.convertToAnyBase(4, 2));
        assertEquals("Incorrect Conversion", "11", decimalToAnyBase.convertToAnyBase(4, 3));
    }
}
