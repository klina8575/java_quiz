package ch03;

import java.util.Scanner;

public class Quiz9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력: ");
        int num = scanner.nextInt();

        //조건 3개 이상-> 삼항연산자 중첩
        System.out.println(num > 0 ? "양수": (num < 0 ? "음수": "0" ));

    }
}
