package compdemo;

import java.util.Comparator;

/**
 * Обратный компаратор для трок
 * @author lomov
 */
public class MyComp implements Comparator<String>{

    @Override
    public int compare(String a, String b){
        String aStr, bStr;
        aStr = a;
        bStr = b;
        //Обратное сравнение
        return bStr.compareTo(aStr);
    }
    
}
