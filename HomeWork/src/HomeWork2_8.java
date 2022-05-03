import java.util.Random;
import java.util.Scanner;

public class HomeWork2_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("정수 몇개?");
        int n = sc.nextInt();

        int [] array = new int[n];

        Random random = new Random();
        random.setSeed(System.currentTimeMillis());

        for (int i = 0; i < n; i++){
            int check = random.nextInt(100);
            for(int j = 0; j < i; j++){
                if(check == array[j]){
                    check = random.nextInt(100);
                    j = 0;
                }
            }
            array[i] = check;
            if(i % 10 == 0 && i != 0){
                System.out.println();
            }
            System.out.print(array[i] + " ");
        }
    }
}
