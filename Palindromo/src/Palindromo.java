import java.util.Scanner;

public class Palindromo{
    public boolean isPalindrome(char word[]) {
        return isPalindromeHelper(word, 0, word.length - 1);
    }

    private boolean isPalindromeHelper(char word[], int start, int end) {
        if (start >= end) {
            // Caso base: a palavra tem um ou zero caracteres
            return true;
        }

        if (word[start] != word[end]) {
            // Os caracteres no início e no final não são iguais, portanto não é um palíndromo
            return false;
        }

        // Verifica os caracteres subsequentes
        return isPalindromeHelper(word, start + 1, end - 1);
    }

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

