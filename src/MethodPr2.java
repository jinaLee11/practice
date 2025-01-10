// 영한T 메소드 문제풀이 2번
// balance 잔고, amount 총 액수, deposit 입금, withdraw 출금

import java.util.Scanner;


public class MethodPr2 {
    public static void main(String[] args) {



    int balance = 0; //잔고 변수 선언
    Scanner sc = new Scanner(System.in);

    while (true) {
        System.out.println( "----------------------------------------" );
        System.out.println( "1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
        System.out.println( "----------------------------------------" );
        System.out.print("선택 : ");

        int choice = sc.nextInt();
        int amount;

        switch (choice){
            case 1:
                System.out.print("입금액을 입력하세요 :");
                amount = sc.nextInt();
                balance = deposit(balance, amount);
                break;

            case 2:
                System.out.print("입금액을 입력하세요 :");
                amount = sc.nextInt();
                balance = withdraw(balance, amount);

            case 3:
                System.out.println("현재 잔액은 : " + balance +"원");
                break; // switch문 빠져나감 >> while문으로
            case 4:
                System.out.println("시스템을 종료합니다.");
                return; // 메소드(main) 나감
            default:
                System.out.println("잘못 입력하셨습니다. 다시 선택해주세요.");
        }
      }
    }

    public static int deposit(int balance, int amount){ //입금처리 메소드
        balance += amount;
        System.out.println(amount +"원을 입금하였습니다. 현재 잔액 : "+ balance +"원");
        return balance;
    }

    public static int withdraw(int balance, int amount){ //입금처리 메소드
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금했습니다. 현재잔액 : "+balance+ "원");
        } else {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }


}
