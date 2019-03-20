public class Solution3 {
    public static void main(String[] args) {
        int sectionStart = 5;
        int sectionEnd = 155;
        int intervalStart = 25;
        int intervalEnd = 100;
        int randomNumber = (int)(sectionStart + Math.random()*(sectionEnd-sectionStart+1));

        if (randomNumber >= intervalStart && randomNumber <= intervalEnd) {
            System.out.println ("Целое число " + randomNumber + " , cлучайно выбранное из отрезка [5;155] содержится в интервале (25;100)");
        }
        else {
            System.out.println ("Целое число " + randomNumber + " , cлучайно выбранное из отрезка [5;155] не содержится в интервале (25;100)");
        }
    }
}

