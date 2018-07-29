package treesetdemo;

import java.util.TreeSet;

/**
 * Демонстрация ThreeSetDemo
 * @author lomov
 */
public class TreeSetDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Создаём ThreeSetDemo
        TreeSet<String> ts = new TreeSet<String>();
        
        //Добавиим элементы
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
        
        System.out.println(ts);
        
        System.out.println(ts.subSet("C", "F"));
    }
    
}
