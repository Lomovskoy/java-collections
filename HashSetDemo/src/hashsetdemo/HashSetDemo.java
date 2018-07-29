package hashsetdemo;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * Демонстрацияприменения HashSet и LinkedHashSet
 * @author lomov
 */
public class HashSetDemo {

    /**
     * @param args аргумент командной строки
     */
    public static void main(String[] args) {
        // Создать хешь набор
        HashSet<String> hs = new HashSet<>();
        
        //Добавить элементы в хеш набор
        hs.add("B");
        hs.add("A");
        hs.add("D");
        hs.add("E");
        hs.add("C");
        hs.add("F");
        
        System.out.println(hs);
        
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        
        //Добавить элементы в хеш набор
        lhs.add("B");
        lhs.add("A");
        lhs.add("D");
        lhs.add("E");
        lhs.add("C");
        lhs.add("F");
        
        System.out.println(lhs);
        
    }
    
}
