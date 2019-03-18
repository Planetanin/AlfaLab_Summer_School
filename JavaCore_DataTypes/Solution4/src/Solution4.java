public class Solution4{
    public static void main(String[] arr) {
       int n = 27;
       int sumNumberOfNumber = 0;
        while (n != 0) {
            sumNumberOfNumber += (n % 10);
            n /= 10;
        }
        System.out.println(sumNumberOfNumber + " ");
    }
}
