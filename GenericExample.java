import java.util.ArrayList;

public class GenericExample {
    

    public static <E> void printArray(E[] array) {

        for(E element : array) {
            System.out.println(element + "");

        }
        System.out.println();
    }

    public static <T extends Comparable<T>> void biggerNum(T num1, T num2, T num3)  {

        T max = num1;
        if(num2.compareTo(max) > 0) {
            max = num2;
        }
        if(num3.compareTo(max) > 0) {
            max = num3;
        }
        System.out.println("The bigger number is: " + max);
    }

    public static void main(String[] args) {
        // printArray testi
        Integer[] intArray = {1, 2, 3, 4, 5};
        printArray(intArray);

        // biggerNum testi
        biggerNum(10, 25, 15);
    }

}