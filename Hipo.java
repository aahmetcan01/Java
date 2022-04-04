import java.util.Scanner;

public class Hipo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("x sq + y sq =z sq");
        System.out.println("Please enter x: ");
        double x=scanner.nextInt();
        System.out.println("Please enter y: ");
        double y = scanner.nextInt();
        double z;
        z= Math.pow(x,2) +Math.pow(y,2);
        System.out.println("Hipo:" + Math.sqrt(z));
    }
}
