package exp08multithread;

import java.util.*;
class WordThread implements Runnable {
    private final String text;
    WordThread(String text) { this.text = text; }
    public void run() {
        String[] words = text.trim().split("\\s+");
        System.out.println("Words in the paragraph:");
        for (String w : words) {
            System.out.println(w);
            try { Thread.sleep(2000); } catch (InterruptedException e) { System.out.println(e); }
        }
        System.out.println("- End of Words -");
    }}
class VowelThread implements Runnable {
    private final String text;
    VowelThread(String text) { this.text = text; }
    public void run() {
        System.out.println("Vowels in the paragraph:");
        for (char c : text.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) != -1) {
                System.out.println(c);
                try { Thread.sleep(2000); } catch (InterruptedException e) { System.out.println(e); }
            } }
 


        System.out.println("- End of Vowels -");
    }
}
public class Vowel { 
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a paragraph:");
        String text = sc.nextLine();
        Thread wordThread = new Thread(new WordThread(text));
        Thread vowelThread = new Thread(new VowelThread(text));
        wordThread.start();
        wordThread.join();     
        vowelThread.start();
    }
}
