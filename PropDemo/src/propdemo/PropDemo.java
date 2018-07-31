package propdemo;

import java.util.Properties;
import java.util.Set;

/**
 * Демонстрация класса Proprties
 * @author lomov
 */
public class PropDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Properties capitals = new Properties();
        capitals.put("Иллинойс", "Спрингфилд");
        capitals.put("Миссури", "Джеферсон сити");
        capitals.put("Вашингтон", "Оллимпия");
        capitals.put("Калифорния", "Сакраменто");
        capitals.put("Индиана", "Индианаполис");
        
        //Получить набор ключей
        Set<?> states = capitals.keySet();
        
        //Показать штаты и столицы
        for (Object name : states) {
            System.out.println("Столица штата " + name + " - " + capitals.getProperty((String)name) + ".");
        }
        System.out.println();
        
        //Поиск штата, не содержащегося в списке - с указанием умолчания
        String str = capitals.getProperty("Флорида", "не найдена");
        System.out.println("Столица Флориды" + str + ".");
    }
    
}
