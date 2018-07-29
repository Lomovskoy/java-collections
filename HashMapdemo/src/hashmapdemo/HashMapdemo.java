package hashmapdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Демонстрация коллекции HashMap
 * @author lomov
 */
public class HashMapdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Создать хеш карту
        HashMap<String, Double> hm = new HashMap<>();
        
        //Поместить элементы в карту
        hm.put("Джон Сноу", new Double(3434.34));
        hm.put("Дейнерис Таргариен", new Double(198.98));
        hm.put("Питер Бейлиш", new Double(72.34));
        hm.put("Ария Старк", new Double(38.47));
        hm.put("Серсея Ланистер", new Double(-196.56));
        
        //Получсить набор элементов
        Set<Map.Entry<String, Double>> set = hm.entrySet();
        
        //Отобразить набор
        for (Map.Entry<String, Double> entry : set) {
            System.out.print(entry.getKey() + ": ");
            System.out.println(entry.getValue());
        }
        System.out.println();
        
        //Сделать Джона Сноу королём севера
        double balance = hm.get("Джон Сноу");
        hm.put("Джон Сноу", balance + 1000);
        System.out.println("Теперь Джон Сноу король севера: " + hm.get("Джон Сноу"));
        
    }
    
}
