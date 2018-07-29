package foreachdemo;

import java.util.ArrayList;

/**
 * Применение цыкла for-each для перебора элементов коллекции
 * @author lomov
 */
public class ForEachDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Создать массив список
        ArrayList<Integer> vals = new ArrayList<>();
        
        //Добавить значения
        vals.add(1);
        vals.add(2);
        vals.add(3);
        vals.add(4);
        vals.add(5);
        
        //Используем цикл для отображения значсений
        System.out.print("Исходное содержимое: ");
        for(int v: vals)
            System.out.print(v + " ");
        
        System.out.println();
        
        //Суммирование значений в цикле
        int sum = 0;
        for (Integer val : vals) 
            sum += val;
        
        System.out.println("Сумма значений: " + sum);
    }
    
}
