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
        al.add(1, "A2");
        System.out.println("Размер коллекции после добавления: " + al.size());
        
        //Отобразить массив список
        System.out.println("Содержимое коллекции:" + al);
        
        //Удалить элементы
        al.remove("F");
        al.remove(2);
        
        System.out.println("Размер коллекции после удавления: " + al.size());
        
        //Отобразить массив список
        System.out.println("Содержимое коллекции:" + al);
    }
    
}
