import java.util.Scanner;

public class exercie2 {
    public static void main(String[] args) {

        evenOrOddSum();
    }
    public static void evenOrOddSum(){ //ex2
        System.out.println("please enter first number");
        Scanner sc=new Scanner(System.in);
        int firstNum= sc.nextInt();//collect first number
        System.out.println("please enter second number");
        int secondNum=sc.nextInt();//collect second number
        int sum=firstNum+secondNum;//calculate sum
        if (sum%2==0){//if even
            System.out.println("even");
        }
        else {//if odd
            System.out.println("odd");
        }
    }
}
