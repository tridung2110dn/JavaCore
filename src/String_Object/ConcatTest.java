package String_Object;

public class ConcatTest {

    public static String concatWithString() {
        String t ="Java";
        for (int i = 0; i<10000; i++) {
            t = t + "tpoint";
        }
        return t;
    }

    public static String concatWithStringBuffer() {
        StringBuffer sb = new StringBuffer("Java");
        for (int i=0; i<10000; i++) {
            sb.append("Tpoint");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        concatWithString();
        System.out.println(System.currentTimeMillis() - startTime);

        startTime = System.currentTimeMillis();
        concatWithStringBuffer();
        System.out.println(System.currentTimeMillis() - startTime);
    }
}
