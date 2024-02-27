package ch05;

public class Quiz9 {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        //합과 평균을 구하기
        int sum = 0;
        int count = 0; //배열 원소의 갯수

        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                sum += array[i][j]; //배열 원소를 하나씩 가져와서 누적합산
                count++; //배열 원소의 갯수만큼 카운트
            }
        }

        double avg = (double) sum / count;

        System.out.println("합계: " + sum);
        System.out.println("평균: " + avg);


    }
}
