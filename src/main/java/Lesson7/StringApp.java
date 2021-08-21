package Lesson7;

import java.util.Arrays;
import java.util.Locale;

public class StringApp {
    public static void main(String[] args) {
        String string = "Java";
        String string2 = new String("Java");
        String string3 = new String(new char[]{'J', 'A', 'V', 'A'});

        String string4 = "Java";

        System.out.println(string == string4);
        System.out.println(string.equals(string2));

        System.out.println(string.length());
        System.out.println(string.charAt(0));
        System.out.println(Arrays.toString(string.toCharArray()));
        System.out.println(string.equalsIgnoreCase(string3));

        System.out.println(string.concat(string2));
        System.out.println(string.toUpperCase());

        //
        System.out.println(string); //Java

        string = string.toUpperCase();

        String s = String.valueOf(100);
        System.out.println(s);

        String s2 = 1 + 2 + "A";
        String s3 = "A" + 1 + 2;
        System.out.println(s2 + " " + s3);

        StringBuilder sb = new StringBuilder(100);
        sb.ensureCapacity(200);
        StringBuffer stringBuffer = new StringBuffer();

        sb.append("s1");
        sb.append("s2");

        sb.append("a1").append(10).append("a2").append(true);


        // sb.reverse();
        System.out.println(sb);

        String stringFromSB = sb.toString();


    }
}
