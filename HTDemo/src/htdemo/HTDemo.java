
package htdemo;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Демонстрация применения Hashtable
 * @author lomov
 */
public class HTDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hashtable<String, Double> balanse = new Hashtable<>();
        
        Enumeration<String> names;
        
        String str;
        double bal;
        
        balanse.put("Джон Сноу", new Double(3434.34));
        balanse.put("Дейнерис Таргариен", new Double(198.98));
        balanse.put("Питер Бейлиш", new Double(72.34));
        balanse.put("Ария Старк", new Double(38.47));
        balanse.put("Серсея Ланистер", new Double(-196.56));
        
        //Показать все счета в хеш таблице
        names = balanse.keys();
        while (names.hasMoreElements()) {            
            str = names.nextElement();
            System.out.println(str + ": " + balanse.get(str));
        }
        System.out.println();
        
        bal = balanse.get("Джон Сноу");
        balanse.put("Джон Сноу", bal + 1000);
        System.out.println("Теперь Джон Сноу король севера: " + balanse.get("Джон Сноу"));
    }
    
}
