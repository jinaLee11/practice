package sparta.calculator;

import java.util.Scanner;

public class BasicCal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("======== 계산기 =========");
            System.out.print("첫번째 양의 정수 입력 : ");
            int a = sc.nextInt();
            System.out.print("두번째 양의 정수 입력 : ");
            int b = sc.nextInt();
            System.out.print("두 수를 어떻게 할까요? (+,-,*,/) : ");
            char c = sc.next().charAt(0);

            if (b == 0 && c == '/') {
                System.out.println("나눗셈 연산에서 분모 자리에 0이 올 수 없습니다.");
                continue;
            } else if (a < 0 || b < 0) {
                System.out.println("양의 정수를 입력해주세요.");
                continue;
            } else if (c != '+' && c != '-' && c != '*' & c != '/') {
                System.out.println("+, -, *, / 중 하나만 입력해주세요.");
                continue;
            } else if (c == '+') {
                System.out.println(a+" + "+b+" = "+(a+b));
            } else if (c == '-') {
                System.out.println(a+" - "+b+" = "+(a-b));
            } else if (c == '*') {
                System.out.println(a+" * "+b+" = "+(a*b));
            } else {
                System.out.println(a+" / "+b+" = "+(a/b));
            }

            System.out.print("다시하기 -> 아무글자나 입력 / 그만하기 -> exit : ");
            String endornot = sc.next();
            if (endornot.equals("exit")) {
                System.out.println("종료되었습니다.");
                System.exit(0);
            }

        }


            // 지저분한 코드 연산자로 정리, else자리에 뭘 넣을지
            // 조건문 탈출시 ?
            // continue는 안쪽 for 문으로 이동하고 break은 밖에 있는 for 문으로 이동합니다.
            // break / Loop가 다 끝나지 않아도 반복문 탈출
            //return / 반복문을 포함한 함수(method) 탈출
            //continue / 반복문 내 작업문 탈출




    }
}
