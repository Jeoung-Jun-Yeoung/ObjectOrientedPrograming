import java.util.Random;

public class HomeWork2_10 {
    public static void main(String[] args) {

        int [][] array = new int [4][4];


        Random random = new Random();

        random.setSeed(System.currentTimeMillis());
        for (int i = 0; i < 10; i++){
            int x = random.nextInt(4);
            int y = random.nextInt(4);
            if(array[x][y] != 0){
                while (array[x][y] != 0){
                    x = random.nextInt(4);
                    y = random.nextInt(4);
                }
            }
            int value = random.nextInt(10);
            while (value == 0){
                value = random.nextInt(10);
            }
            array[x][y] = value;
        }
        for(int [] col : array){
            for(int row : col){
                System.out.printf(row + " ");
            }
            System.out.println();
        }

    }
}
