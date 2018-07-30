package treemapdemo2;

import java.util.Comparator;

/**
 * Сравнивает послдние 2 слова в полной строке
 * @author lomov
 */
public class TCom implements Comparator<String>{

    @Override
    public int compare(String a, String b) {
        int i, j, k;
        String aStr, bStr;
        aStr = a;
        bStr = b;
        
        //Найти индекс символа в строке, с которойначинается фамилия
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        k = aStr.substring(i).compareTo(bStr.substring(j));
        if(k == 0) //
            return aStr.compareTo(bStr);
        else
            return k;
    }
    
}
