import java.util.Scanner;

public class App {
    static Scanner UserInput = new Scanner(System.in);
    static int Input;
    public static void main(String[] args) throws Exception {
        boolean w = true;
        while (w == true) {
            
            System.out.println("1. 2D\n2. 3D");
            System.out.print("Choose : ");

            while (true) {

                while (true) {
                    try{
                    Input = UserInput.nextInt();
                    break;
                    }catch(Exception e){
                    System.err.println("Error, Please enter what is in the options");
                    System.out.print("Please enter new input : ");
                    UserInput.next();
                    }
                }

                if(Input == 1){
                    System.out.println("two dimension");
                    TwoD twod = new TwoD();
                    twod.main();
                    break;
                }else if(Input == 2){
                    System.out.println("Coming Soon");
                    break;
                }else{
                    System.err.println("Error, Please enter what is in the options");
                    System.out.print("Please enter new input : ");
                }
            }

            System.out.println("Do you want to count again? (true/false)");

            while (true) {
                try{
                    w = UserInput.nextBoolean();
                    break;
                }catch(Exception e){
                    System.err.println("Error, Please enter what is in the options");
                    UserInput.next();
                }
            }
        }
    }
}