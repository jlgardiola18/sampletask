package Chapter3;

public class StringLesson {
    public static void main(String[] args) {
        String name1 = "Fluffy";
        String name2 = new String("Fluffy");
        System.out.println(name1);
        name1 = "Tiny";
        name1 = "Fluffy";
        System.out.println(name1.length());
        System.out.println(name1.charAt(0));
        System.out.println(name1.charAt(2));
        System.out.println(name1.indexOf("f"));


        String s1 = "1";
        String s2 = s1.concat("2");
        s2.concat("3");
        System.out.println(s2);

        String string = "animals";
        System.out.println(string.substring(3));
        System.out.println(string.substring(string.indexOf('m')));
        System.out.println(string.substring(3, 4));
        System.out.println(string.substring(3,7));
        System.out.println(string.substring(3,3));
        System.out.println(string.toUpperCase());
        System.out.println(string);
        System.out.println("abc".equals("ABC"));
        System.out.println("ABC".equals("ABC"));
        System.out.println("abc".equalsIgnoreCase("ABC"));
        System.out.println(name1==name2);
        System.out.println(name1.equals(name2));
        System.out.println("abc".trim());
        System.out.println("\t a b c\n".trim());




    }
}
