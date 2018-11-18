package String_Object;

public class String_Buffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Din");
        sb.append("Dep trai");
        System.out.println(sb);

        StringBuffer sb1 = new StringBuffer();
        System.out.println(sb1.capacity());
        sb1.append("Din");
        System.out.println(sb1.capacity());
    }
}
