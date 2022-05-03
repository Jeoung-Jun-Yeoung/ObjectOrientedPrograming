import java.util.Scanner;

public class HomeWork2_6 {
    public static void main(String[] args) {
        int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};

        Scanner sc = new Scanner(System.in);

        System.out.printf("금액을 입력하시오>>");
        int value = sc.nextInt();

        for(int i = 0; i < unit.length; i++){
            if(value/unit[i] == 0){
                continue;
            }
            System.out.println(unit[i]+"원 짜리 : "+(value/unit[i])+"개");
            value = value % unit[i];
        }

    }
}
