import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("연산>>");

        int num_1 = sc.nextInt();
        String op = sc.next();
        int num_2 = sc.nextInt();

        if(op.equals("+")){
            System.out.printf(num_1+""+op+""+num_2+"의 계산 결과는 %d",(num_1+num_2));

        }
        else if(op.equals("-")){
            System.out.printf(num_1+""+op+""+num_2+"의 계산 결과는 %d",(num_1-num_2));

        }
        else if(op.equals("*")){
            System.out.printf(num_1+""+op+""+num_2+"의 계산 결과는 %d",(num_1*num_2));

        }
        else if(op.equals("/")){
            if(num_2 == 0){
                System.out.println("0으로 나눌 수 없습니다.");
            }
            else {
                System.out.printf(num_1+""+op+""+num_2+"의 계산 결과는 %d",(num_1/num_2));
            }


        }
        else{
            System.out.println("허용되지 않은 연산자입니다.");
        }



    }
}
