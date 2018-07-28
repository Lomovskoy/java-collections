package arraylisttoarray;

import java.util.ArrayList;

/**
 * Преобразование в массив 
 * @author lomov
 */
public class ArrayListToArray {

    /**
     * @param args аргумент командной строки
     */
    public static void main(String[] args) {
        // Создать массив список
        ArrayList<Integer> al = new ArrayList<Integer>();
        
        //Добавляем элеменны в коллекцию.
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        System.out.println("Содержимое коллекции после добавления: " + al);
        
        //Получить массив
        Integer ia[] = new Integer[al.size()];
        ia = al.toArray(ia);
        
        int sum = 0;
        
        //
        for (int i : ia) {
            sum += i;
        }
        
        System.out.println("Сума: " + sum);
    }
    
}
