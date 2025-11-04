import java.util.Scanner;

public class Paragraph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a paragraph:");
        String paragraph = sc.nextLine();

        int capitalCount = 0;
        int smallCount = 0;

        String capitalLetters = "";
        String smallLetters = "";

        for (int i = 0; i < paragraph.length(); i++) {
            char ch = paragraph.charAt(i);

            if (Character.isUpperCase(ch)) {
                capitalCount++;
                capitalLetters += ch + ", ";
            } else if (Character.isLowerCase(ch)) {
                smallCount++;
                smallLetters += ch + ", ";
            }
        }

        // Remove the trailing comma and space from both strings
        if (!capitalLetters.isEmpty()) {
            capitalLetters = capitalLetters.substring(0, capitalLetters.length() - 2);
        }
        if (!smallLetters.isEmpty()) {
            smallLetters = smallLetters.substring(0, smallLetters.length() - 2);
        }

        System.out.println("\nTotal capital letters: " + capitalCount + " and they are " + capitalLetters);
        System.out.println("Total small letters: " + smallCount + " and they are " + smallLetters);

        sc.close();
    }
}
