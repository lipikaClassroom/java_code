import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
//        print the number of prime number within the range
        Scanner range1 = new Scanner(System.in);
        System.out.println("Enter starting number:");
        int num1=range1.nextInt();
        Scanner range2 = new Scanner(System.in);
        System.out.println("Enter ending number:");
        int num2 = range2.nextInt();
        for(int i=num1;i<=num2;i++) {

            if(i==0 || i==1){
                continue;
            }
            int flag=1;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    flag=0;
                    break;
                }
            }
            if(flag==1){
                System.out.println(i);
            }
        }
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter a number to check prime or not:");
//        int num= input.nextInt();
//
//        for(int i=2;i<=num;i++){
//            if(num%i !=0){
//                System.out.println("Is a prime number");
//                break;
//            }
//        }

    }
}

