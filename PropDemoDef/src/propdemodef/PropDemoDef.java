package propdemodef;

import java.util.Properties;
import java.util.Set;

/**
 * Использование списка свойств по умолчанию.
 * @author lomov
 */
public class PropDemoDef {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Properties defList = new Properties();
        defList.put("Флорида", "Телеси");
        defList.put("Висконсен", "Меддисон"); 
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
        
        //Тепеперь Флолрида будет найдена в списке по умолчанию.
        String str = capitals.getProperty("Флорида", "не найдена");
        System.out.println("Столица Флориды" + str + ".");
    }
    
}
