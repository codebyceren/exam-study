import java.util.EmptyStackException;

public class Stack<E> {

    private final int size;
    private int top;
    private E[] elements;

    public Stack() {
        this(10);
    }

    public Stack(int s) {
        // HATA DÜZELTİLDİ: s > 0 olmalı ki gönderilen boyut (örn: 3) geçerli olsun
        size = s > 0 ? s : 10;
        top = -1;
        elements = (E[]) new Object[size];
    }

    public void push(E pushValue) {
        if (top == size - 1) {
            throw new IllegalStateException("Stack is full");
        }
        // HATA DÜZELTİLDİ: top++ yerine ++top kullanılmalı (önce artır, sonra indekse ata)
        elements[++top] = pushValue;
    }

    public E pop() {
        if (top == -1) {
            throw new EmptyStackException();
        }
        return elements[top--];
    }

    public static void main(String[] args) {
       Stack<Integer> intStack = new Stack<>(3);

       
       intStack.push(10);
       intStack.push(20);
       intStack.push(30);

       System.out.println("Pop : " + intStack.pop());
       System.out.println("Pop : " + intStack.pop());

       intStack.push(40);
       System.out.println("Pop : " + intStack.pop());
       System.out.println("Pop : " + intStack.pop());
   }
}