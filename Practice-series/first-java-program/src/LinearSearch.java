import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int []array=new int[5];
        for(int i=0;i<array.length;i++){
            array[i]=input.nextInt();
        }
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("Enter the number you want to search:");
        int num=input.nextInt();
//        linearSearch(array,num);
        System.out.println(linearSearch(array,num));
    }
    static int linearSearch(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(target==arr[i]){
                return i;
            }
        }
        return -1;
    }
}
