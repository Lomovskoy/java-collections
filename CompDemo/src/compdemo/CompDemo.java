package compdemo;

import java.util.TreeSet;

/**
 * Использование настраивомого компаратора
 * @author lomov
 */
public class CompDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Создать TreeSet
        TreeSet<String> ts = new TreeSet<>(new MyComp());
        //Добавить элементы в набор-дерева
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
        
        //Отобразить элементы
        for (String t : ts) 
            System.out.print(t + " ");
        System.out.println();
    }
    
}
