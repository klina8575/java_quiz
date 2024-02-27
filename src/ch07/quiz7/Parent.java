package ch07.quiz7;

public class Parent {
    public String nation;

    public Parent() {
        // 2. Parent(String nation) 생성자 실행
        this("대한민국");

        //3.
        System.out.println("Parent() call");
    }

    public Parent(String nation) {
        this.nation = nation;
        System.out.println("Parent(String nation) call");
    }

}
