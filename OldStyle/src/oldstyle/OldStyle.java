package oldstyle;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Пример использования коллекция до введения обощений
 * @author lomov
 */
public class OldStyle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        //lines хранит строки, но могут быть сохраненны объекты любого типа
        //В коде старого типа, нет возможности защитить тип сохраняемых обьектов.
        list.add("один");
        list.add("два");
        list.add("три");
        list.add("четыре");        
        
        Iterator itr = list.iterator();
        
        while(itr.hasNext()){
            //Что бы извлечь элемент, требуется явное приведение типов
            //потому, что коллекции хранят только обьекты
            String str = (String) itr.next();//здесь необхолдимо 
            //явное преобразование
            System.out.println(str + " имеет длинну " + str.length() + 
                    " символов.");
        }
    }
    
}
