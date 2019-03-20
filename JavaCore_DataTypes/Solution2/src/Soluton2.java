public class Soluton2 {
    public static void main (String [] arr) {
        double n = 11.2;
        int rounding = (int)(n + 0.5); // Явное приведение типа double к int
        /*Это если без Math.round
        Если с Math.round, то :
        System.out.println((int)Math.round(n));
        */
        System.out.println(rounding);
    }
}
