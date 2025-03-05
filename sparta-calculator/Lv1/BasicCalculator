package spartaPJ.calculator1;

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
            } else if (c != '+' && c != '-' && c != '*' && c != '/') {
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
            String endOrNot = sc.next();
            if (endOrNot.equals("exit")) {
                System.out.println("종료되었습니다.");
                break;
            }

        }
    }
}
