import java.util.Scanner;

class Dictionary{
    private static String [] kor = {"사랑","아기","돈","미래","희망"};
    private static String [] eng = {"love","baby","money","future","hope"};

    public Dictionary(){

    }
    public static String kor2Eng(String word){
        boolean flag = false;
        int index = 0;
        for (int i = 0; i < kor.length; i++){
            if(kor[i].equals(word)){
                flag = true;
                index = i;
                break;
            }
        }
        if(flag){
            return eng[index];
            // private 멤버 변수도 리턴이 가능. 접근이 안될뿐이다.
        }
        else{
            return "없습니다.";
        }
    }

}

public class DicApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Dictionary dic = new Dictionary();

        System.out.println("한영 단어 검색 프로그램입니다.");
        while (true){
            System.out.print("한글 단어?");
            String word = sc.next();
            if(word.equals("그만")){
                break;
            }
            String rst = dic.kor2Eng(word);
            if(rst.equals("없습니다.")){
                System.out.println(word+"는 저의 사전에 "+rst);
            }
            else {
                System.out.println(word + "은 " + rst);
            }
        }
    }




}
