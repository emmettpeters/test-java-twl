import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        Scanner suckAnut = new Scanner(System.in);
        System.out.println("Enter a number you want to multiply 5 by: ");
        int userInput = Integer.parseInt(suckAnut.nextLine());

        String result = "5 times " + userInput + " equals " + (int)userInput * 5;
        System.out.println(result);
    }
}

