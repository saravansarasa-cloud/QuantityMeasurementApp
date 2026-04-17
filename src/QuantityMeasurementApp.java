public class QuantityMeasurementApp {

    // 🔹 ENUM (UPDATED)
    enum LengthUnit {

        FEET(1.0),
        INCH(1.0 / 12.0),
        YARD(3.0),
        CM(0.393701 / 12.0);  // convert cm → inches → feet

        private final double toFeet;

        LengthUnit(double toFeet) {
            this.toFeet = toFeet;
        }

        public double convertToFeet(double value) {
            return value * toFeet;
        }
    }

    // 🔹 Quantity Class
    static class Quantity {

        private final double value;
        private final LengthUnit unit;

        public Quantity(double value, LengthUnit unit) {
            this.value = value;
            this.unit = unit;
        }

        public double toFeet() {
            return unit.convertToFeet(value);
        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj) return true;

            if (obj == null || getClass() != obj.getClass()) return false;

            Quantity other = (Quantity) obj;

            return Double.compare(this.toFeet(), other.toFeet()) == 0;
        }
    }

    // 🔹 MAIN
    public static void main(String[] args) {

        System.out.println("=== UC4: Extended Units ===");

        Quantity q1 = new Quantity(1.0, LengthUnit.YARD);
        Quantity q2 = new Quantity(3.0, LengthUnit.FEET);

        System.out.println("1 yard == 3 feet ? " + q1.equals(q2));

        Quantity q3 = new Quantity(1.0, LengthUnit.CM);
        Quantity q4 = new Quantity(0.393701, LengthUnit.INCH);

        System.out.println("1 cm == 0.393701 inch ? " + q3.equals(q4));
    }
}