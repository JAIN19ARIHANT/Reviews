import java.util.Scanner;

class ReverseWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            reverse(words, i);
        }

        String result  = String.join(" ", words);
        System.out.println(result);
    }

    static void reverse(String[] words, int i) {
        String str = words[i];
        String reversed = "";
        for (int j = str.length() - 1; j >= 0; j--) {
            reversed += str.charAt(j);
        }
        words[i] = reversed;
    }

}