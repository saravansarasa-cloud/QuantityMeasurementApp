public class QuantityMeasurementApp {

    // 🔹 ENUM for Units
    enum LengthUnit {
        FEET(1.0),
        INCH(1.0 / 12.0);

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

    // 🔹 MAIN METHOD
    public static void main(String[] args) {

        Quantity q1 = new Quantity(1.0, LengthUnit.FEET);
        Quantity q2 = new Quantity(12.0, LengthUnit.INCH);

        System.out.println("Comparing 1 foot and 12 inches:");
        System.out.println("Equal: " + q1.equals(q2));

        Quantity q3 = new Quantity(2.0, LengthUnit.FEET);
        System.out.println("Comparing 1 foot and 2 feet:");
        System.out.println("Equal: " + q1.equals(q3));
    }
}