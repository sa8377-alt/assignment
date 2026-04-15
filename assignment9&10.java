#1 find all occurance
import java.util.Scanner;

class StringAnalyzer {

    // Method to find all indexes of a character
    public static int[] findAllIndexes(String text, char ch) {

        int count = 0;

        // Count occurrences
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ch) {
                count++;
            }
        }

        // Store indexes
        int[] indexes = new int[count];
        int j = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ch) {
                indexes[j++] = i;
            }
        }

        return indexes;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        int[] indexes = findAllIndexes(text, ch);

        System.out.println("Indexes of '" + ch + "': ");
        for (int i = 0; i < indexes.length; i++) {
            System.out.print(indexes[i] + " ");
        }
    }
}
#2
import java.util.Scanner;

class CompareStrings {

    public static boolean compare(String s1, String s2) {

        if (s1.length() != s2.length()) return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        boolean result1 = compare(s1, s2);
        boolean result2 = s1.equals(s2);

        System.out.println("charAt() result: " + result1);
        System.out.println("equals() result: " + result2);
    }
}
#3
import java.util.Scanner;

class SubstringProgram {

    public static String getSubstring(String text, int start, int end) {

        String result = "";

        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }

        return result;
    }

    public static boolean compare(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String sub1 = getSubstring(text, start, end);
        String sub2 = text.substring(start, end);

        System.out.println(compare(sub1, sub2));
    }
}
#4
import java.util.Scanner;

class CharArrayProgram {

    public static char[] getChars(String text) {

        char[] arr = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }

        return arr;
    }

    public static boolean compare(char[] a, char[] b) {

        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        char[] arr1 = getChars(text);
        char[] arr2 = text.toCharArray();

        System.out.println(compare(arr1, arr2));
    }
}
#5
class NullPointerDemo {

    public static void generate() {
        String text = null;
        System.out.println(text.length()); // Exception
    }

    public static void handle() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Handled NullPointerException");
        }
    }

    public static void main(String[] args) {
        // generate();
        handle();
    }
}
#6
class StringIndexDemo {

    public static void handle(String text) {
        try {
            System.out.println(text.charAt(100));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled Exception");
        }
    }

    public static void main(String[] args) {
        handle("Hello");
    }
}
#7
class IllegalArgumentDemo {

    public static void handle(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (Exception e) {
            System.out.println("Handled Exception");
        }
    }

    public static void main(String[] args) {
        handle("Hello");
    }
}
#8
class NumberFormatDemo {

    public static void handle(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        }
    }

    public static void main(String[] args) {
        handle("abc");
    }
}
#9
class ArrayIndexDemo {

    public static void handle() {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled Exception");
        }
    }

    public static void main(String[] args) {
        handle();
    }
}
#10
import java.util.Scanner;

class UpperCaseProgram {

    public static String toUpper(String text) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }

            result += ch;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String res1 = toUpper(text);
        String res2 = text.toUpperCase();

        System.out.println(res1.equals(res2));
    }
}