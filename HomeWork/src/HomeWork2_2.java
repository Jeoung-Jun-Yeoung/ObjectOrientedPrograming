public class HomeWork2_2 {
    public static void main(String[] args) {
        int [][] n = {{1}, {1,2,3},{1},{1,2,3,4},{1,2}};
        for (int[] temp : n){
            for(int a : temp){
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}
