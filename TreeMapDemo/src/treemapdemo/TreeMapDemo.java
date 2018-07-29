package treemapdemo;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Демонстрация коллекции TreeMap
 * @author lomov
 */
public class TreeMapDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Создатькарту дерева
        TreeMap<String, Double> tm = new TreeMap<>();
        
        //Поместить элементы в карту
        tm.put("Джон Сноу", new Double(3434.34));
        tm.put("Дейнерис Таргариен", new Double(198.98));
        tm.put("Питер Бейлиш", new Double(72.34));
        tm.put("Ария Старк", new Double(38.47));
        tm.put("Серсея Ланистер", new Double(-196.56));
        
        //Получсить набор элементов
        Set<Map.Entry<String, Double>> set = tm.entrySet();
        
        //Отобразить набор
        for (Map.Entry<String, Double> entry : set) {
            System.out.print(entry.getKey() + ": ");
            System.out.println(entry.getValue());
        }
        System.out.println();
        
        //Сделать Джона Сноу королём севера
        double balance = tm.get("Джон Сноу");
        tm.put("Джон Сноу", balance + 1000);
        System.out.println("Теперь Джон Сноу король севера: " + tm.get("Джон Сноу"));
    }
    
}
