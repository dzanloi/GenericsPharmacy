import Arithmetic.Arithmetic;
import Map.MyMap;

public class Main {
    public static void main(String[] args) {
        Arithmetic<Integer, Float> arithmetic = new Arithmetic<>(10, 3.5f);
        System.out.println("Addition: " + arithmetic.add());
        System.out.println("Subtraction: " + arithmetic.subtract());
        System.out.println("Multiplication: " + arithmetic.multiply());
        System.out.println("Division: " + arithmetic.divide());
        System.out.println("Min: " + arithmetic.getMin());
        System.out.println("Max: " + arithmetic.getMax());

        MyMap<String, Integer> myMap = new MyMap<>();
        myMap.put("One", 1);
        myMap.put("Two", 2);
        myMap.put("Three", 3);

        System.out.println("Value for key 'Two': " + myMap.get("Two"));
        System.out.println("Value for key 'Four': " + myMap.get("Four"));

        myMap.put("Two", 22);
        System.out.println("Updated value for key 'Two': " + myMap.get("Two"));

        System.out.println("Removed value for key 'Three': " + myMap.remove("Three"));
        System.out.println("Value for key 'Three' after removal: " + myMap.get("Three"));
    }
}