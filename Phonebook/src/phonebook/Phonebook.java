package phonebook;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * Простая база данных телефонных номеров, 
 * использующая списки свойств
 * @author lomov
 */
public class Phonebook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Properties ht = new Properties();
        BufferedReader br = 
                new BufferedReader(new InputStreamReader(System.in));
        
        String name, number;
        FileInputStream fin = null;
        boolean changed = false;
        
        //Попытка открыть файл phonebook.bat
        try {
            fin = new FileInputStream("phonebook.bat");
        } catch (Exception e) {
            //Игнорировать
        }
        
        /**
         * Если телефонна книга уже существует, 
         * загрузить телефонные номера
         */
        try {
            if(fin != null){
                ht.load(fin);
                fin.close();
            }
        } catch (Exception e) {
            System.out.println("Ошибка чтения файла");
        }
        
        //Разрешить пользователю вносить новые имена и номера телефонов
        do{
            System.out.println("Введите имя " + " ('выход' для останова): ");
            name = br.readLine();
            if(name.equals("выход")) continue;
            System.out.println("Введите номер: ");
            number = br.readLine();
            ht.put(name, number);
            changed = true;
        }while (!name.equals("выход"));
        
        //Если телефоннаякнига изменилась - сохранить её
        if(changed){
            FileOutputStream fount = new FileOutputStream("phonebook.bat");
            ht.store(fount, "Телефонная книга");
            fount.close();
        }
        
        //Искать номер по имени
        do{
            System.out.println("Введите имя для поиска" + " ('выход' для останова): ");
            name = br.readLine();
            if(name.equals("выход")) continue;
            number = (String) ht.get(name);
            System.out.println(number);
        }while(!name.equals("выход"));
    }
    
}
