public class Solution1 {
    public static void main(String args[]) {
        String origString = new String("Рано радовались, размокший ремень рюкзака разорвался");
        String lowCaseString = new String(origString.toLowerCase());

        System.out.println("Оригинальное предложение выглядит так: " + origString);
        System.out.println("Предложение после заменыы символов: " + lowCaseString.replace('р', '*'));
    }
}





