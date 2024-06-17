import java.util.Scanner;

public class CuboidVolume {
    private double length;
    private double width;
    private double height;

    public CuboidVolume(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double calculateVolume() {
        return length * width * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the cuboid: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the cuboid: ");
        double width = scanner.nextDouble();

        System.out.print("Enter the height of the cuboid: ");
        double height = scanner.nextDouble();

        CuboidVolume cuboid = new CuboidVolume(length, width, height);
        double volume = cuboid.calculateVolume();

        System.out.printf("The volume of the cuboid with length %.2f, width %.2f, and height %.2f is %.2f%n", length, width, height, volume);

        scanner.close();
    }
}
