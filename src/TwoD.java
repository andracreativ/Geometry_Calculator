import java.util.Scanner;

public class TwoD {

    Scanner UserInput = new Scanner(System.in);
    int asw;
    int Input;
    
    void main(){

        System.out.println("1. Square\n2. Rectanggle\n3. Trianggle (Equilateral)");
        System.out.print("Choose : ");
        while (true) {
            vinput();
            if(Input == 1){
                Square();
                break;
            }else if(Input == 2){
                Rectangle();
                break;
            }else if(Input == 3){
                TriangleEL();
                break;
            }else{
                System.err.println("Error, Please enter what is in the options");
                System.out.print("Please enter new input : ");
            }
        }
    }

    private void vinput(){
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
    }

    private void Square(){
        System.out.println("1. Area\n2. Parimeter");
        System.out.print("Choose : ");
        while (true) {
            vinput();
            if(Input == 1){
                System.out.println("2D/Square/Area");
                System.out.print("Side : ");
                vinput();
                asw = Input * Input;
                System.out.println("Answer : " + asw);
                break;
            }else if(Input == 2){
                System.out.println("2D/Square/Parimeter");
                System.out.print("Side : ");
                vinput();
                asw = Input * 4;
                System.out.println("Answer : " + asw);
                break;
            }else{
                System.err.println("Error, Please enter what is in the options");
                System.out.print("Please enter new input : ");
            }
        }
    }

    private void Rectangle(){
        System.out.println("1. Area\n2. Parimeter");
        while (true) {
            System.out.print("Choose : ");
            vinput();
            if(Input == 1){
                System.out.println("2D/Rectangle/Area");
                System.out.print("Leght : ");
                vinput();
                int Leght = Input;
                System.out.print("Widht : ");
                vinput();
                int Widht = Input;
                asw = Leght * Widht;
                System.out.println("Answer : " + asw);
                break;
            }else if(Input == 2){
                System.out.println("2D/Rectangle/Parimeter");
                System.out.print("Leght : ");
                vinput();
                int Leght = Input;
                System.out.print("Widht : ");
                vinput();
                int Widht = Input;
                asw = (Leght + Widht) * 2;
                System.out.println("Answer : " + asw);
                break;
            }else{
                System.err.println("Error, Please enter what is in the options");
                System.out.print("Please enter new input : ");
            }
        }
    }

    private void TriangleEL(){
    System.out.println("1. Area\n2. Parimeter");
        while (true) {
            System.out.print("Choose : ");
            vinput();
            if(Input == 1){
                System.out.println("2D/Trianggle (Equilateral)/Area");
                System.out.print("Side : ");
                vinput();
                asw = (Input * Input) / 2;
                System.out.println("Answer : " + asw + " !!!The answer maybe has been rounded!!! ");
                break;
            }else if(Input == 2){
                System.out.println("2D/Rectangle/Parimeter");
                System.out.print("Side : ");
                vinput();
                asw = Input * 3;
                System.out.println("Answer : " + asw);
                break;
            }else{
                System.err.println("Error, Please enter what is in the options");
                System.out.print("Please enter new input : ");
            }
        }
    }
}