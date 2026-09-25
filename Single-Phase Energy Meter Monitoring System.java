import java.util.Scanner;

public class EnergyMeter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Voltage (V): ");
        double voltage = sc.nextDouble();

        System.out.print("Enter Current (A): ");
        double current = sc.nextDouble();

        System.out.print("Enter Usage Time (hours): ");
        double hours = sc.nextDouble();

        System.out.print("Enter Electricity Rate (Rs/kWh): ");
        double rate = sc.nextDouble();

        // Calculate power
        double power = voltage * current;

        // Convert watts to kilowatts
        double powerKW = power / 1000;

        // Calculate energy
        double energy = powerKW * hours;

        // Calculate electricity cost
        double cost = energy * rate;

        System.out.println("\n--- Single-Phase Energy Meter ---");
        System.out.println("Voltage       : " + voltage + " V");
        System.out.println("Current       : " + current + " A");
        System.out.println("Power         : " + power + " W");
        System.out.println("Energy Used   : " + energy + " kWh");
        System.out.println("Estimated Bill: Rs " + cost);

        sc.close();
    }
}
