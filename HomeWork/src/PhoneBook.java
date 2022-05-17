import java.util.Scanner;

class Phone{
    String name;
    String tel;

    public Phone(String name, String tel){
        this.name = name;
        this.tel = tel;
    }

}

public class PhoneBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("인원수>>");
        int num = sc.nextInt();
        String name;
        String tel;

        Phone [] array = new Phone [num];

        for (int i = 0; i < num; i++){
            System.out.printf("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
            name = sc.next();
            tel = sc.next();
            array[i] = new Phone(name,tel);
        }
        System.out.println("저장되었습니다...");

        while (true){
            boolean flag = false;
            System.out.printf("검색할 이름>>");
            String SearchName = sc.next();
            if(SearchName.equals("그만")){
                break;
            }
            for(int i = 0; i < num; i++){
                if(SearchName.equals(array[i].name)){
                    flag = true;
                    System.out.printf("%s의 번호는 %s 입니다.",array[i].name,array[i].tel);
                    System.out.println();
                }
            }
            if(!flag){
                System.out.printf("%s 이 없습니다.",SearchName);
                System.out.println();
            }
        }
    }
}
