import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your weight");
        int weight=scanner.nextInt();
        System.out.print("Please enter your height");
        double height=scanner.nextDouble();
        double BMI=weight/ (height*height);
        System.out.println("Your Body Mass Index is: "+BMI);
        if (BMI<25 && BMI>18 ) {
            System.out.println("Your Body Mass Index is normally");
        }
        else
            System.out.println("Your Body Mass Index is not normally");
    }
}
