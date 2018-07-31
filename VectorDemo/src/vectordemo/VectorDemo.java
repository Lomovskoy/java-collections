package vectordemo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * Демонстрация различный операций с ветором
 * @author lomov
 */
public class VectorDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Начальный размер 3, инкремент 2
        Vector<Integer> v = new Vector<>(3, 2);
        System.out.println("Начальный размер ветрора: " + v.size());
        System.out.println("Начальная емкость: " + v.capacity());
        
        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);
        
        System.out.println("Ёмкость после 4х добавлений: " + v.capacity());
        
        v.addElement(5);
        System.out.println("Текущая емкость: " + v.capacity());
        
        v.addElement(6);
        v.addElement(7);
        System.out.println("Текущая емкость: " + v.capacity());
        
        v.addElement(9);
        v.addElement(10);
        System.out.println("Текущая емкость: " + v.capacity());
        
        v.addElement(11);
        v.addElement(12);
        System.out.println("Первый элемент: " + v.firstElement());
        System.out.println("Последний элемент: " + v.lastElement());
        
        if(v.contains(3))
            System.out.println("Ветор содержит 3");
        
        //Перебор элементов ветора
        Enumeration<Integer> vEnum = v.elements();
        System.out.println("\nЭлементы вектора: ");
        while (vEnum.hasMoreElements()) {            
            System.out.print(vEnum.nextElement() + " ");
        }
        System.out.println();
        
        System.out.println("-------------------------------------------------");
        
        //Использовать итератор для перебора содержимого
        Iterator<Integer> vIter = v.iterator();
        System.out.println("\nЭлементы вектора: ");
        while (vIter.hasNext()) {            
            System.out.print(vIter.next() + " ");
        }
        System.out.println();
        
        System.out.println("-------------------------------------------------");
        
        //Использование цикла for-each для перебора элементов
        System.out.println("\nЭлементы вектора: ");
        for (Integer i : v) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
}
