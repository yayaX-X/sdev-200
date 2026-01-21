public class Exercise06_09 {
    // Convert from feet to meters
    public static double footToMeter(double foot) {
        return foot * 0.305;
    }

    // Convert from meters to feet
    public static double meterToFoot(double meter) {
        return meter * 3.279;
    }

    public static void main(String[] args) {
        // Table headers
        System.out.printf("%-15s%-15s%-15s%-15s%n", "Feet", "Meters", "Meters", "Feet");
        System.out.println("-----------------------------------------------------");
        double meterValue = 20.0;
        // Print the table
        for (int foot = 1; foot <= 10; foot++) {
            System.out.printf(
                    "%-15d%-15.3f%-15.1f%-15.3f%n",
                    foot,
                    footToMeter(foot),
                    meterValue,
                    meterToFoot(meterValue));
            meterValue += 5;
        }
    }
}
