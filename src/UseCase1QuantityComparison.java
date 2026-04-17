class Quantity {
    double value;
    String unit;

    public Quantity(double value, String unit) {
        this.value = value;
        this.unit = unit;
    }

    public boolean equals(Quantity other) {
        return this.value == other.value && this.unit.equals(other.unit);
    }
}

public class UseCase1QuantityComparison {

    public static void main(String[] args) {

        System.out.println("=== Quantity Measurement App ===");

        Quantity q1 = new Quantity(5, "meter");
        Quantity q2 = new Quantity(5, "meter");

        if (q1.equals(q2)) {
            System.out.println("Equal ✅");
        } else {
            System.out.println("Not Equal ❌");
        }
    }
}