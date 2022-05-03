public class Add {
    public static void main(String[] args) {
        int rst = 0;
        for(int i = 0; i < args.length; i++){
            try {
                int temp = Integer.parseInt(args[i]);
                rst += temp;
            }
            catch (NumberFormatException e){
             continue;
            }
        }
        System.out.println(rst);
    }
}
