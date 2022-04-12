import java.util.Scanner;

public class HomeWork1 {
    public static void main(String [] args){
        System.out.print("2자리 정수 입력(10~99)>>");
        Scanner sc = new Scanner(System.in);

        int num;

        num = sc.nextInt();
        if(num > 100 || num < 10){
            System.out.println("2자리 정수가 아닙니다.");
        }
        else {
            if((num % 100) / 10 == (num % 10)){
                System.out.println("yes! 10의 자리와 1의 자리가 같습니다.");
            }
            else {
                System.out.println("no! 10의 자리와 1의 자리가 같지 않습니다.");
            }
        }
    }
}
