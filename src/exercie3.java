import java.util.Scanner;

public class exercie3 {
    public static void main(String[] args) {
        printInOrder();
    }
    public static void printInOrder(){ //ex3
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter first number");
        int firstNum= sc.nextInt();//collect the first value
        System.out.println("please enter second number");
        int secondNum= sc.nextInt();//collect second
        System.out.println("please enter third number");
        int thirdNum= sc.nextInt();//collect third
        if (firstNum>secondNum && secondNum>thirdNum){//op1
            System.out.println(firstNum+", "+secondNum+", "+thirdNum);
        }
        if (secondNum>firstNum && firstNum>thirdNum){//op2
            System.out.println(secondNum+", "+firstNum+", "+thirdNum);
        }
        if (thirdNum>firstNum && firstNum>secondNum){//op3
            System.out.println(thirdNum+", "+firstNum+", "+secondNum);
        }
        if (firstNum>thirdNum && thirdNum>secondNum){//op4
            System.out.println(firstNum+", "+thirdNum+", "+secondNum);
        }
        if (secondNum>thirdNum && thirdNum>firstNum){//op5
            System.out.println(secondNum+", "+thirdNum+", "+firstNum);
        }
        if (thirdNum>secondNum && secondNum>firstNum){//op6
            System.out.println(thirdNum+", "+secondNum+", "+firstNum);
        }
    }
}
