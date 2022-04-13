import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
             String t_nickname="ahmetcan";
             String t_password="havhav1907";
          int entering=3;
        System.out.println("*****************");
        System.out.println("Welcome to Login Screen");
        System.out.println("*****************");

        while (true){
            System.out.print("Please enter your nickname: ");
            String nickname=scanner.nextLine();
            System.out.print("Please enter your password: ");
            String password=scanner.nextLine();
            if (nickname.equals(t_nickname) && password.equals(t_password) ){
                System.out.println("Welcome " + nickname);
                break;
            }
            else if (nickname.equals(t_nickname) && !password.equals(t_password)){
                System.out.println("Your password is wrong");
                entering-=1;

            }
            else if (!nickname.equals(t_nickname)&& password.equals(t_password)){
                System.out.println("Your nickname is wrong");
                entering-=1;
            }
           else {System.out.println("Your info are wrong");
                   entering-=1;
           }
           if (entering==0){
               System.out.println("BLOCKED");
               break;
           }

            }

              }

        }
