package htdemo2;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

/**
 * Применение итераторов в Hashtable
 * @author lomov
 */
public class HTDemo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hashtable<String, Double> balanse = new Hashtable<>();
        
        String str;
        double bal;
        
        balanse.put("Джон Сноу", new Double(3434.34));
        balanse.put("Дейнерис Таргариен", new Double(198.98));
        balanse.put("Питер Бейлиш", new Double(72.34));
        balanse.put("Ария Старк", new Double(38.47));
        balanse.put("Серсея Ланистер", new Double(-196.56));
        
        //Отобразитьвсе счета в хеш таблице.
        //для начала получить ключи в виде набора
        Set<String> set = balanse.keySet();
        
        //Подлучить идентификатор
        Iterator<String> itr = set.iterator();
        
        while (itr.hasNext()) {            
            str = itr.next();
            System.out.println(str + ": " + balanse.get(str));
        }
        
        System.out.println();
        
        bal = balanse.get("Джон Сноу");
        balanse.put("Джон Сноу", bal + 1000);
        System.out.println("Теперь Джон Сноу король севера: " + balanse.get("Джон Сноу"));
    }
    
}
