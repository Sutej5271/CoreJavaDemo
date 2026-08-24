import java.util.Arrays;

public class Strings {
    public static void main(String[] args){

        String s1 = " HeLlo   ";
        String s2 = "hello";
        String s3 = "HELLO WORLD I LOVE YOU .";
        String s4 = "420";

        System.out.println(s1.indexOf("L"));
        System.out.println(s1.indexOf("O"));
        System.out.println(s2.lastIndexOf("l"));
        System.out.println(s2.charAt(3));
        System.out.println(s2.substring(1,4));
        System.out.println(Arrays.toString(s3.split(" ")));
        System.out.println(s4);
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s2.contains("he"));
        System.out.println(s3.contains("He"));
        System.out.println(s3.startsWith("HELL"));
        System.out.println(s1.endsWith("llo"));
        System.out.println(s1.length());
        System.out.println(s1.trim());
        System.out.println(s1.trim().length());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());

    }
}
