import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("1~99 사이의 정수를 입력하시오>>");

        int check = 0;

        int num = sc.nextInt();

        if(num < 10 || num > 100){
            System.out.println("1~99 사이의 정수가 아닙니다.");
            System.exit(0);
        }
        for(int i = 0; i < 2; i++){
            if((num % 10) == 3 || (num % 10) == 6 || (num % 10) == 9){
                check++;
            }
            num = num / 10;
        }
        if(check == 1){
            System.out.printf("박수짝");
        }
        else if(check == 2){
            System.out.printf("박수짝짝");
        }
        else {
            System.out.printf("정수에 369가 포함되어 있지 않습니다.");
        }

    }
}
