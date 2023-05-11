import java.util.Scanner;

public class StringConcatenation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        String concatenatedString = firstString.concat(secondString).concat(firstString).concat(secondString);
        boolean isAlternating = true;
        for (int i = 0; i < concatenatedString.length() - 1; i++) {
            if (concatenatedString.charAt(i) == concatenatedString.charAt(i+1)) {
                isAlternating = false;
                break;
            }
        }

        if (isAlternating) {
            System.out.println("The resulting string is alternating.");
        } else {
            System.out.println("The resulting string is not alternating.");
        }
    }
}
