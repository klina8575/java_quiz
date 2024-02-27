package ch12.quiz5;

public class StringBuilderExample {
    public static void main(String[] args) {
        String str = "";

        for (int i = 0; i <= 100 ; i++) {
            str += i;
        }

        System.out.println(str);
    }
}
