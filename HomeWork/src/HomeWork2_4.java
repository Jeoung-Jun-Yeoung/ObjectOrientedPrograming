import java.util.Scanner;

public class HomeWork2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("소문자 알파벳 하나를 입력하시오>>");
        String a = sc.next();
        char b = a.charAt(0);

        for(int i = b; i >= 97; i--){
            for(int j = 97; j <= i; j++){
                System.out.print((char)j);
            }
            System.out.println();
        }
    }
}
