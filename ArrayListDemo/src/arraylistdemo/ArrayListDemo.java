package arraylistdemo;

import java.util.ArrayList;

/**
 * Демонстрация использования ArrayList
 * @author lomov
 */
public class ArrayListDemo {

    /**
     * @param args с командной строки
     */
    public static void main(String[] args) {
        // Создать массив список
        ArrayList<String> al = new ArrayList<String>();
        System.out.println("Начальный размер коллекции: " + al.size());
        
        //Добавляем элеменны в коллекцию.
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "C");
        System.out.println("Начальный размер коллекции: " + al.size());
    }
    
}
