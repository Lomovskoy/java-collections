package maillist;

import java.util.LinkedList;

/**
 * Простой пример работы со спискомпочтовых адресов
 * @author lomov
 */
public class MailList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<Address> m1 = new LinkedList<>();
        
        //Добавим элементы в список
        m1.add(new Address("Кирилл", "Домодедовская", "Москва", 
                "Московская область", "115582"));
        m1.add(new Address("Сергей", "Домодедовская", "Москва", 
                "Московская область", "115582"));
        m1.add(new Address("Михон", "Домодедовская", "Москва", 
                "Московская область", "115582"));
        
        //Отобразить список почтовых адресов
        for (Address address : m1) {
            System.out.println(address + "\n");
        }
        System.out.println();
    }
    
}
