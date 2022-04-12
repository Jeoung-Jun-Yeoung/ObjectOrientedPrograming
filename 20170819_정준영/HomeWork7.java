import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("첫번째 원의 중심과 반지름 입력>>");

        double a_center_1 = sc.nextDouble();
        double a_center_2 = sc.nextDouble();
        double radius_1 = sc.nextDouble();

        System.out.printf("두번째 원의 중심과 반지름 입력>>");

        double b_center_1 = sc.nextDouble();
        double b_center_2 = sc.nextDouble();
        double radius_2 = sc.nextDouble();

        double dis = Math.sqrt((a_center_1 - b_center_1) * (a_center_1 - b_center_1) + (a_center_2 - b_center_2) * (a_center_2 - b_center_2));

        if(radius_1 + radius_2 > dis ){
            System.out.printf("두 원은 서로 겹칩니다.");
        }
        else {
            System.out.printf("두 원은 서로 안겹칩니다.");
        }
    }
}
