import java.util.Scanner;

public class TwoD {

    Scanner UserInput = new Scanner(System.in);
    int asw;
    int Input;
    
    void main(){

        System.out.println("1. Square\n2. Rectanggle\n3. Trianggle (Equilateral)\n4. Circle");
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
            }else if(Input == 4){
                Circle();
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
        System.out.println("1. Area\n2. Parimeter\n3. Diagonal");
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
            }else if (Input == 3) {
                System.out.println("2D/Square/Diagonal");
                System.out.print("Side : ");
                vinput();
                int power = (Input * Input * 2);
                asw = (int) Math.round(Math.sqrt(power));
                System.out.println("Answer : " + asw + " !!!The answer maybe has been rounded!!!");
                break;
            }else{
                System.err.println("Error, Please enter what is in the options");
                System.out.print("Please enter new input : ");
            }
        }
    }

    private void Rectangle(){
        System.out.println("1. Area\n2. Parimeter\n3. Diagonal");
        System.out.print("Choose : ");
        while (true) {
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
            }else if (Input == 3) {
                System.out.println("2D/Rectangle/Diagonal");
                System.out.print("Leght : ");
                vinput();
                int Leght = Input;
                System.out.print("Widht : ");
                vinput();
                int Widht = Input;
                int power = (Leght * Leght) + (Widht * Widht);
                asw = (int) Math.round(Math.sqrt(power));
                System.out.println("Answer : " + asw + " !!!The answer maybe has been rounded!!!");
                break;
            }else{
                System.err.println("Error, Please enter what is in the options");
                System.out.print("Please enter new input : ");
            }
        }
    }

    private void TriangleEL(){
    System.out.println("1. Area\n2. Parimeter\n3. Height");
    System.out.print("Choose : ");
        while (true) {
            vinput();
            if(Input == 1){
                System.out.println("2D/Trianggle (Equilateral)/Area");
                System.out.print("Side : ");
                vinput();
                asw = (Input * Input) / 2;
                System.out.println("Answer : " + asw + " !!!The answer maybe has been rounded!!!");
                break;
            }else if(Input == 2){
                System.out.println("2D/Rectangle/Parimeter");
                System.out.print("Side : ");
                vinput();
                asw = Input * 3;
                System.out.println("Answer : " + asw);
                break;
            }else if(Input == 3){
                System.out.println("2D/Trianggle (Equilateral)/Height");
                System.out.print("Side : ");
                vinput();
                asw = (int) Math.round(Math.sqrt(3) / 2 * Input);
                System.out.println("Answer : " + asw + " !!!The answer maybe has been rounded!!!");
                break;
            }else{
                System.err.println("Error, Please enter what is in the options");
                System.out.print("Please enter new input : ");
            }
        }
    }

    private void Circle(){
    float pi = 3.1415927f;
    System.out.println("1. Area\n2. Circumference");
    System.out.print("Choose : ");
        while (true) {
            vinput();
            if(Input == 1){
                System.out.println("2D/Circle/Circumference");
                System.out.print("Radius : ");
                vinput();
                asw = (int) Math.round(pi * Input * Input);
                System.out.println("Answer : " + asw + " !!!The answer maybe has been rounded (In this program Pi = " + pi + ")!!!");
                break;
            }else if(Input == 2){
                System.out.println("2D/Circle/Circumference");
                System.out.print("Radius : ");
                vinput();
                asw = (int) Math.round(pi * Input * 2);
                System.out.println("Answer : " + asw + " !!!The answer maybe has been rounded (In this program Pi = " + pi + ")!!!");
                break;
            }else{
                System.err.println("Error, Please enter what is in the options");
                System.out.print("Please enter new input : ");
            }
        }
    }     
}