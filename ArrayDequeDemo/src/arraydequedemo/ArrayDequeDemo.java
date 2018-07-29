package arraydequedemo;

import java.util.ArrayDeque;

/**
 * Демонстрация применения ArrayDequeDemo
 * @author lomov
 */
public class ArrayDequeDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Создать двустороннюю лочередь
        ArrayDeque<String> adq = new ArrayDeque<>();
        
        //Использовать ArrayDeque в виде стека
        adq.push("A");
        adq.push("B");
        adq.push("D");
        adq.push("E");
        adq.push("F");
        
        System.out.print("Выталкиваем из стека: ");
        
        while (adq.peek() != null) {            
            System.out.print(adq.pop() + " ");
        }
        System.out.println();
    }
    
}
