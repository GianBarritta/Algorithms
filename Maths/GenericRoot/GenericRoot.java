package GenericRoot;

/*
 * Algorithm explanation:
 * https://shorturl.at/jrMN7
 */
public class GenericRoot {

    public static void main(String[] args) {
        int number1 = 1234;
        int number2 = 12345;
        int result1 = genericRoot(number1);
        int result2 = genericRoot(number2);
        System.out.println("Generic root of " + number1 + " is: " + result1);
        System.out.println("Generic root of " + number2 + " is: " + result2);
    }

    private static int genericRoot(int n) {
        int root = 0;
        while (n > 0 || root > 9) {
            if (n == 0) {
                n = root;
                root = 0;
            }
            root += n % 10;
            n /= 10;
        }
        return root;
    }
}
