import java.util.Scanner;

public class HomeWork2_14 {
    public static void main(String[] args) {

        String course [] = {"Java","C++","HTML5","컴퓨터구조","안드로이드"};
        int score [] = {95,88,76,62,55};
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("과목이름>>");
            String input = sc.next();
            if(input.equals("그만")){
                break;
            }
            else{
                boolean check = false;
                for(int i = 0; i < course.length; i++){
                    if(input.equals(course[i])){
                        System.out.println(course[i] + "의 점수는 "+ score[i]);
                        check = true;
                        break;
                    }
                }
                if(!check){
                    System.out.println("없는과목입니다.");
                }
            }
        }


    }
}
