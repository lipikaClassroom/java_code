import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
//        1D array implementation
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter the array element:");
//        int []array= new int[5];
//        for(int i=0;i<array.length;i++){
//            array[i]=input.nextInt();
//        }
//        for(int j=0;j<array.length;j++){
//            System.out.print(array[j]);
//        }
//        System.out.println();

//        2D array implementation

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array elements:");

        int [][]array = new int[3][3];
        for(int row=0;row< array.length;row++){
            for (int col = 0; col < array[row].length; col++) {
                array[row][col]=sc.nextInt();
            }
        }
//        for(int row=0;row< array.length;row++){
//            for (int col = 0; col < array[row].length; col++) {
//                System.out.print(array[row][col] + ' ');
//            }
//            System.out.println();
//        }
//        for (int row = 0; row < array.length; row++) {
//            System.out.println(Arrays.toString(array[row]));
//        }
        for (int[] a:array){
            System.out.println(Arrays.toString(a));
        }
    }
}
