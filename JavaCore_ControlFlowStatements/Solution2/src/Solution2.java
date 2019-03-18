public class Solution2 {
    public static void main(String args[]) {
        String origString = new String("Рассерженный Родион Романович раскричался: «Рано радовались, размокший ремень рюкзака разорвался");
        String lowCaseString = new String(origString.toLowerCase());
        char [] stringToChar = lowCaseString.toCharArray();

        for(int i=0; i<stringToChar.length; i++){
            if(stringToChar[i]=='р'){
                stringToChar[i]='*';
            }
            }

        System.out.println("Оригинальное предложение выглядит так: " + origString);
        System.out.println("Предложение после замены символов циклом: " + String.valueOf(stringToChar));
        }
    }

