/*Scott Jenks
 * 1/10/2023
 * Module 3 Integer Class Assignment
 */
public class Integer {
    public static void main(String[] args) {
        // Create an array of test values
        int[] scott = { 1, 1, 4 };

        // Test isEven(int), isOdd(int), and isPrime(int)
        System.out.println("\nTest if values are even using isEven(int):");
        for (int i = 0; i < scott.length; i++) {
            System.out.println(scott[i] + " " + Integer.isEven(scott[i]));
        }

        System.out.println("\nTest if values are odd using isOdd(int):");
        for (int i = 0; i < scott.length; i++) {
            System.out.println(scott[i] + " " + Integer.isOdd(scott[i]));
        }

        System.out.println("\nTest if values are prime using isPrime(int):");
        for (int i = 0; i < scott.length; i++) {
            System.out.println(scott[i] + " " + Integer.isPrime(scott[i]));
        }

        // Test MyInteger(), isEven(), isOdd(), isPrime() and getValue()
        System.out.println("\nTest if values are even using isEven():");
        for (int i = 0; i < scott.length; i++) {
            // Create a MyInteger
            Integer value = new Integer(scott[i]);
            System.out.println(value.getScott() + " " + value.isEven());
        }

        System.out.println("\nTest if values are odd using isOdd():");
        for (int i = 0; i < scott.length; i++) {
            // Create a MyInteger
            Integer value = new Integer(scott[i]);
            System.out.println(value.getScott() + " " + value.isOdd());
        }

        System.out.println("\nTest if values are prime using isPrime():");
        for (int i = 0; i < scott.length; i++) {
            // Create a MyInteger
            Integer value = new Integer(scott[i]);
            System.out.println(value.getScott() + " " + value.isPrime());
        }

        // Test isEven(MyInteger), isOdd(MyInteger), isPrime(MyInteger)
        System.out.println("\nTest if values are even using isEven(MyInteger):");
        for (int i = 0; i < scott.length; i++) {
            // Create a MyInteger
            Integer value = new Integer(scott[i]);
            System.out.println(value.getScott() + " " + Integer.isEven(value));
        }

        System.out.println("\nTest if values are odd using isOdd(MyInteger):");
        for (int i = 0; i < scott.length; i++) {
            // Create a MyInteger
            Integer value = new Integer(scott[i]);
            System.out.println(value.getScott() + " " + Integer.isOdd(value));
        }

        System.out.println("\nTest if values are prime using isPrime(MyInteger):");
        for (int i = 0; i < scott.length; i++) {
            // Create a MyInteger
            Integer value = new Integer(scott[i]);
            System.out.println(value.getScott() + " " + Integer.isPrime(value));
        }

        // Test equals(int) and equals(MyInteger)
        int[] scott2 = { 1, 5, 8 };
        Integer value = new Integer(5);
        System.out.println("\nTest if " + value.getScott() +
                " is equal to the specified value:");
        for (int i = 0; i < scott2.length; i++) {
            System.out.println(scott2[i] + " " + value.equals(scott2[i]));
        }

        System.out.println("\nTest if " + value.getScott() +
                " is equal to the specified value:");
        for (int i = 0; i < scott2.length; i++) {
            Integer myInteger = new Integer(scott2[i]);
            System.out.println(scott2[i] + " " + value.equals(myInteger));
        }
    }

    private int scott;

    Integer(int scott) {
        this.scott = scott;
    }

    // Return scott
    public int getScott() {
        return scott;
    }

    public void setScott(int scott) {
        this.scott = scott;
    }

    public boolean isEven() {
        return isEven(scott);
    }

    public boolean isOdd() {
        return isOdd(scott);
    }

    public boolean isPrime() {
        return isPrime(scott);
    }

    public static boolean isEven(int scott) {
        return scott % 2 == 0;
    }

    public static boolean isOdd(int scott) {
        return scott % 2 != 0;
    }

    public static boolean isPrime(int scott) {
        for (int i = 2; i <= scott / 2; i++) {
            if (scott % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isEven(Integer i) {
        return i.isEven();
    }

    public static boolean isOdd(Integer i) {
        return i.isOdd();
    }

    public static boolean isPrime(Integer i) {
        return i.isPrime();
    }

    public boolean equals(int scott) {
        return this.scott == scott;
    }

    public boolean equals(Integer i) {
        return i.scott == this.scott;
    }

}
