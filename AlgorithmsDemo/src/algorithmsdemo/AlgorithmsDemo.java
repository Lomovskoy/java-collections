package algorithmsdemo;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * Демонстрация применения разных алгоритмов
 * @author lomov
 */
public class AlgorithmsDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Создать неинициализированный связанный список
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(-8);
        ll.add(20);
        ll.add(-20);
        ll.add(8);
        
        //Создать компаратор обратного порядка
        Comparator<Integer> r = Collections.reverseOrder();
        
        //Сортировать список этим корпоратором
        Collections.sort(ll, r);
        
        System.out.print("Список отсартирован в обратно порядке: ");
        
        for (Integer i : ll) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        //Тассовать список
        Collections.shuffle(ll);
        
        //Отобразить перемешанный список
        System.out.print("Список перемешен: ");
        
        for (Integer i : ll) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        System.out.println("Минимум: " + Collections.min(ll));
        System.out.println("Минимум: " + Collections.max(ll));
    }
    
}
