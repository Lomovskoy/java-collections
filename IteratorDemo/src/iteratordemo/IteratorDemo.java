package iteratordemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Демонстраия применения итераторов
 * @author lomov
 */
public class IteratorDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Создаём массив список
        ArrayList<String> al = new ArrayList<>();
        
        //Добавим элементы
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        
        //Используем итератор для отображения содержимого списка
        System.out.print("Исходное содержимое: ");
        Iterator<String> i = al.iterator();
        
        while (i.hasNext()) {
            String el = i.next();
            System.out.print(el + " ");
        }
        System.out.println();
        
        //Модернизировать текущий обьект отерации
        ListIterator<String> li = al.listIterator();
        while (li.hasNext()) {
            String el = li.next();
            li.set(el + "+");
        }
        
        System.out.print("Модифицированное содержимое: ");
        i = al.iterator();
        while (i.hasNext()) {
            String el = i.next();
            System.out.print(el + " ");
        }
        System.out.println();
        
        
        //Отражаем список в обратном порядке
        System.out.print("Модифицированный список в обратно порядке: ");
        while (li.hasPrevious()) {
            String el = li.previous();
            System.out.print(el + " ");
        }
        System.out.println();
    }
    
}
