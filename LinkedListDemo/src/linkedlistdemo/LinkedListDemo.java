package linkedlistdemo;

import java.util.LinkedList;

/**
 * Демонстрация применения LinkedList
 * @author lomov
 */
public class LinkedListDemo {

    /**
     * @param args аргумент команднойст строки
     */
    public static void main(String[] args) {
        // Создать связанный список
        LinkedList<String> linkList = new LinkedList<>();
        
        //Добавить эолементы в список
        linkList.add("F");
        linkList.add("B");
        linkList.add("D");
        linkList.add("E");
        linkList.add("C");
        linkList.add("Z");
        linkList.add("A");
        linkList.add(1,"A2");
        
        System.out.println("Исходное содержимое коллекции: " + linkList);
        
        //Удалить элементы из связанного списка
        linkList.remove("F");
        linkList.remove(2);
        System.out.println("Содержимое списка после удаления: " + linkList);
        
        //Удалить первый и последний элементы
        linkList.removeFirst();
        linkList.removeLast();
        
        System.out.println("После удаления первого и последнего элемента: " + linkList);
        
        //Полуи присвоить значение
        String val = linkList.get(2);
        linkList.set(2, val + " изменён");
        
        System.out.println("После изменения " + linkList);
        
    }
    
}
