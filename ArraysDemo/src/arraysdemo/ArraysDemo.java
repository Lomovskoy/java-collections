package arraysdemo;

import java.util.Arrays;

/**
 * Демонстрация переменных Array
 * @author lomov
 */
public class ArraysDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Распределить и инициализировать массив
        int array[] = new int[10];
        for(int i = 0; i < 10; i++)
            array[i] = -3 * i;
        
        //Отобразить,сортировать и вновьотобразить массив
        System.out.println("Исходное содержимое: ");
        display(array);
        
        Arrays.sort(array);
        System.out.print("Отсортированный массив: ");
        display(array);
        
        //Наполнение и отображение массива
        Arrays.fill(array, 2, 6, -1);
        System.out.print("После fill(): ");
        display(array);
        
        //Сортировать и отобразить массив
        Arrays.sort(args);
        System.out.print("После повторной сортировки: ");
        display(array);
        
        //Бинарный поиск значений -9
        System.out.println("Значение -9 находится в позиции ");
        int index = Arrays.binarySearch(array, -9);
        System.out.println(index);
    }
    
    static void display(int array[]){
        for(int i: array)
            System.out.print(i + " ");
        System.out.println();
    }
    
}
