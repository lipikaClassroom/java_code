import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreateArrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> arrayList=new ArrayList<>();
        arrayList.add(sc.nextInt());
        arrayList.add(sc.nextInt());
        arrayList.add(sc.nextInt());
        System.out.println(arrayList);
        System.out.println(arrayList.get(1));
    }
}
