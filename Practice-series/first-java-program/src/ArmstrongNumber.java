import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=input.nextInt();
        boolean a = isArmstrong(number);
        System.out.println(a);
    }
    static boolean isArmstrong(int n){

        int originalNum=n;
        int sum=0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            sum=sum+rem*rem*rem;
        }
        if(sum==originalNum) {
            return true;
        } else{
            return false;
        }
    }
}
