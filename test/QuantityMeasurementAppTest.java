import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuantityMeasurementAppTest {

    // 🔹 FEET TESTS

    @Test
    void testEquality_SameValue_Feet() {
        assertTrue(QuantityMeasurementApp.compareFeet(1.0, 1.0));
    }

    @Test
    void testEquality_DifferentValue_Feet() {
        assertFalse(QuantityMeasurementApp.compareFeet(1.0, 2.0));
    }

    // 🔹 INCHES TESTS

    @Test
    void testEquality_SameValue_Inches() {
        assertTrue(QuantityMeasurementApp.compareInches(1.0, 1.0));
    }

    @Test
    void testEquality_DifferentValue_Inches() {
        assertFalse(QuantityMeasurementApp.compareInches(1.0, 2.0));
    }

    // 🔹 NULL CHECK

    @Test
    void testEquality_NullComparison() {
        QuantityMeasurementApp.Feet f = new QuantityMeasurementApp.Feet(1.0);
        assertFalse(f.equals(null));
    }

    // 🔹 SAME REFERENCE

    @Test
    void testEquality_SameReference() {
        QuantityMeasurementApp.Feet f = new QuantityMeasurementApp.Feet(1.0);
        assertTrue(f.equals(f));
    }
}