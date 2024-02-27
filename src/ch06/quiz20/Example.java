package ch06.quiz20;

public class Example {

    //모든 문자열이 숫자로만 이루어져 있는지 확인하는 메소드
    static boolean isNumber(String str) {
        if(str == null || str.equals("")) return false;

        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);

            //자동타입 변환이 일어나면서 유니코드로 비교한다
            //유니코드는 0~9사이의 숫자만 존재한다
            if (ch < '0' || ch > '9') return false; //메소드 종료
        }

        return true; //for문을 무사히 빠져나왔다는건 str값이 모두 숫자
    }

    public static void main(String[] args) {
        String str = "213";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));
        str = "1234o";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));
    }

}
