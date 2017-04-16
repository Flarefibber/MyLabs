import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Z2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] n = new Integer[5];
        int size = n.length;
        for (int i = 0; i < size; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            n[i] = sc.nextInt();
        }
        System.out.print("Initial array: ");
        for (int j = 0; j < size; j++) {
            System.out.print(n[j]);
            if (j < (size - 1)) System.out.print(", ");
        }
        Arrays.sort(n,
                new Comparator<Integer>() {
                    public int compare(Integer o1, Integer o2) {
                        return o1 - o2;
                    }
                }
        );
        System.out.print("\nSorted array: ");
        for (int j = 0; j < size; j++) {
            System.out.print(n[j]);
            if (j < (size - 1)) System.out.print(", ");
        }


    }
}
