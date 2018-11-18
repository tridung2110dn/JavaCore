package String_Object;

public class StringPool {

    public static void main(String[] args) {

        // String Literal & String Object
        /*
        - When create a String object using new() operator, it always creates a new object in heap memory
        - When create a String object using String literal, e.g "DinDin", it may return an existing object from the String
        pool, if it already exists. Otherwise, create a new String object and put it in the string pool for future re-use.
         */

        String first = "DinDin";
        String second = "DinDin";

        first = first.concat("in");
        System.out.println(first);
        System.out.println(second);

        String third = new String("DinDin"); // "DinDin" is a literal => will store in String pool


    }
}
