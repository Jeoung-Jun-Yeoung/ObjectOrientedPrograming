import java.util.Arrays;
import java.util.Scanner;

public class HomeWork2 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        int [] array = new int[3];
        System.out.print("정수 3개 입력>>");
        for(int i = 0; i < 3; i++){
            array[i] = sc.nextInt();
        }

        for(int i = 0; i < 3; i++){
            for(int j = i + 1; j < 3; j++){
                if(array[i] > array[j]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }

        System.out.println("중간 값은 "+array[1]);

    }
}
