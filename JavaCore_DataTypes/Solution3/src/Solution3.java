public class Solution3 {
    public static void main(String[] args) {
        double c = 2.0;
        byte n = 50;
        long a = 200; //Пропущена ";"
        double result = (a/n) * c; // Использую автоматическое приведение типов, изменяя целевой тип с int на double
        System.out.println(result);
    }
}


