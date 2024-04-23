//check if given string is palindrom or not
public class string {
    public static void printLatter(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
    public static boolean ispalindrom(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        String name = "noonn";
        System.out.println(ispalindrom(name));
    }
}
