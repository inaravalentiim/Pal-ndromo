import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String input = scanner.nextLine();

        char[] word = input.toCharArray();
        Palindromo test = new Palindromo();
        
        if (test.isPalindrome(word)) {
            System.out.println("A palavra é um palíndromo.");
        } else {
            System.out.println("A palavra não é um palíndromo.");
        }
    }
}

