package stackdemo;

import java.util.Stack;

/**
 * Демонстрация прменения класса Стек
 * @author lomov
 */
public class StackDemo {

    static void showPush(Stack<Integer> st, int a){
        st.push(a);
        System.out.println("push(" + a + ")");
        System.out.println("Стек: " + st);
    }
    
    static void showPop(Stack<Integer> st){
        System.out.print("pop -> ");
        Integer a = st.pop();
        System.out.println(a);
        System.out.println("стек: " + st);
    }
    public static void main(String[] args) {
        
        Stack<Integer> st = new Stack<>();
        
        System.out.println("cтек: " + st);
        
        showPush(st, 42);
        showPush(st, 66);
        showPush(st, 99);
        showPop(st);
        showPop(st);
        showPop(st);
        
        try {
            showPop(st);
        } catch (Exception e) {
            System.out.println("Стек пуст");
        }
    }
    
}
