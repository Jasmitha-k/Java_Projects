import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First Number:");
        double num1=sc.nextDouble();
        System.out.println("Enter the Second Number:");
        double num2=sc.nextDouble();
        System.out.println("Enter the operation to be performed \n1.Addition \n2.Subtraction \n3.Multiplication");
        int operation=sc.nextInt();
        switch(operation){
            case 1:System.out.println(num1+num2);
            case 2:System.out.println(num1-num2);
            case 3:System.out.println(num1*num2);
            default:System.out.println("Invalid operation");
        }
        




    }
}