import java.util.Scanner;

public class UniquePerfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word or sentence: ");
        String input = sc.nextLine();
        input = input.replace(" ", "").toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (input.indexOf(ch) != input.lastIndexOf(ch)) {
                System.out.println("NOT PERFECT");
                sc.close();
                return; 
            }
        }

        System.out.println("PERFECT");
        sc.close();
    }
}



