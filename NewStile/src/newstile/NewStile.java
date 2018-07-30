package newstile;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Современная обощённая версия
 * @author lomov
 */
public class NewStile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Теперь list содержил ссылки типа String
        ArrayList<String> list = new ArrayList<>();
        list.add("один");
        list.add("два");
        list.add("три");
        list.add("четыре");
        
        //Отметиим что итератор то де обощённый
        Iterator<String> itr = list.iterator();
        
        //Следующий оператор теперь вызовет ошибку временикомпиляции
        //Iterator itr = list.iterator();
        
        while (itr.hasNext()) {            
            String str = itr.next();//Приведение не требуется
            //Iterator i = itr.next();//не скомпилируется
            System.out.println(str + " имеет длинну " + str.length() + 
                    " символов.");
        }
    }
    
}
