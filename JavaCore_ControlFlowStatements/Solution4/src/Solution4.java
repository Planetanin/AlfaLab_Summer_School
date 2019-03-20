import java.util.Arrays;
import java.lang.String;
public class Solution4 {
    public static void main(String args[]){
        String origString = new String("Я у мамы программист №1 из Йошкар-Олы: нажимаю на клавиши, попиваю чаёк! Ёрзаю по креслу)");
        String stringWithoutSpaceAndSymbols = new String(origString.replaceAll("[^a-zA-Zа-яА-ЯёЁ]","").toLowerCase());
        char[] stringToChar = stringWithoutSpaceAndSymbols.toCharArray();
        int arrayLength = stringToChar.length;
        char [] uniqChar = new char[arrayLength];
        int temp = 0;
        Arrays.sort(stringToChar);
        for ( int i = 0; i != arrayLength; i++, arrayLength = temp )
        {
            for ( int j = temp = i + 1; j != arrayLength; j++ )
            {
                if ( stringToChar[j] != stringToChar[i] )
                {
                    if ( temp != j ) stringToChar[temp] = stringToChar[j];
                    temp++;
                }
            }
        }
        if ( arrayLength != stringToChar.length ) {
            for (int i = 0; i < arrayLength; i++) {
                uniqChar[i] = stringToChar[i];
            }
        }
        System.out.println("Исходное предложение - <<" + origString + ">> - содержит " + temp + " уникальных букв: ");
        for ( char outputChar : uniqChar ) {
            System.out.print(outputChar + " "); // Да, с буквой "ё" получился косяк, не разобрался как исправить
        }
    }
    }




