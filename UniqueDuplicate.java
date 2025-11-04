package def;
import java.util.Scanner;

public class UniqueDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " digits:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        System.out.print("Unique digits: ");

        for (int i = 0; i < size; i++) {
            int num = arr[i];
            int dup = 0;

            for (int j = 0; j < size; j++) {
                if (arr[j] == num) {
                   dup++;
                }
            }

            if (dup == 1) {
                System.out.print(num + " ");
                count++;
            }
        }

        System.out.println("\nCount: " + count);

    }
}


