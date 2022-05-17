import java.util.Scanner;

class S {
    String [] seat = new String[10];
    public S(){
        for(int i = 0; i < 10; i++){
            seat[i] = "---";
        }
    }
    protected void ReservationSeat(String name, int number){
        seat[number] = name;
    }
    protected void PrintSeat(){
        System.out.print("S>> ");
        for (String temp : seat) {
            System.out.print(temp + " ");
        }
        System.out.println();
    }
    protected boolean Cancel(String name){
        for(int i = 0; i < 10; i ++){
            if(seat[i].equals(name)){
                seat[i] = "---";
                return true;
            }
        }
        return false;
    }
}

class A {
    String [] seat = new String[10];
    public A(){
        for(int i = 0; i < 10; i++){
            seat[i] = "---";
        }
    }
    protected void ReservationSeat(String name, int number){
        seat[number] = name;
    }
    protected void PrintSeat(){
        System.out.print("A>> ");
        for (String temp : seat) {
            System.out.print(temp + " ");
        }
        System.out.println();
    }
    protected boolean Cancel(String name){
        for(int i = 0; i < 10; i ++){
            if(seat[i].equals(name)){
                seat[i] = "---";
                return true;
            }
        }
        return false;
    }
}

class B {
    String [] seat = new String[10];
    public B(){
        for(int i = 0; i < 10; i++){
            seat[i] = "---";
        }
    }
    protected void ReservationSeat(String name, int number){
        seat[number] = name;
    }
    protected void PrintSeat(){
        System.out.print("B>> ");
        for (String temp : seat) {
            System.out.print(temp + " ");
        }
        System.out.println();
    }
    protected boolean Cancel(String name){
        for(int i = 0; i < 10; i ++){
            if(seat[i].equals(name)){
                seat[i] = "---";
                return true;
            }
        }
        return false;
    }
}

public class HomeWork3_12 {
    public static void main(String[] args) {
        System.out.println("명품콘서트홀 예약 시스템입니다.");
        Scanner sc = new Scanner(System.in);
        boolean end = false;

        S s = new S();
        A a = new A();
        B b = new B();

        while(true){
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
            String name;
            int num;
            String command = sc.next();
            int NextCommand;
            switch (command){
                case "1":
                    System.out.print("좌석 구분 S(1), A(2), B(3)>>");
                    NextCommand = sc.nextInt();
                    if(NextCommand == 1){
                        s.PrintSeat();
                        System.out.print("이름>>");
                        name = sc.next();
                        System.out.print("번호>>");
                        num = sc.nextInt();
                        num = num - 1;
                        if(num < 0 && num > 10){
                            System.out.println("1~10중에 좌석번호를 선택하세요.");
                            break;
                        }
                        s.ReservationSeat(name,num);
                    }
                    else if(NextCommand == 2){
                        a.PrintSeat();
                        System.out.print("이름>>");
                        name = sc.next();
                        System.out.print("번호>>");
                        num = sc.nextInt();
                        num = num - 1;
                        if(num < 0 && num > 10){
                            System.out.println("1~10중에 좌석번호를 선택하세요.");
                            break;
                        }
                        a.ReservationSeat(name,num);

                    }
                    else if(NextCommand == 3){
                        b.PrintSeat();
                        System.out.print("이름>>");
                        name = sc.next();
                        System.out.print("번호>>");
                        num = sc.nextInt();
                        num = num - 1;
                        if(num < 0 && num > 10){
                            System.out.println("1~10중에 좌석번호를 선택하세요.");
                            break;
                        }
                        b.ReservationSeat(name,num);
                    }
                    else{
                        System.out.println("잘못된 입력입니다. 다시 입력하세요.");
                    }
                    break;
                case "2":
                    s.PrintSeat();
                    a.PrintSeat();
                    b.PrintSeat();
                    System.out.println("조회를 완료하였습니다.");
                    break;
                case "3":
                    System.out.print("좌석 구분 S(1), A(2), B(3)>>");
                    NextCommand = sc.nextInt();
                    if(NextCommand == 1) {
                        s.PrintSeat();
                        System.out.print("이름>>");
                        name = sc.next();
                        boolean CancelCheck = s.Cancel(name);
                        if(!CancelCheck){
                            System.out.println("잘못된 이름을 입력하셨습니다. 다시 입력하세요.");
                            break;
                        }
                    }
                    else if(NextCommand == 2) {
                        a.PrintSeat();
                        System.out.print("이름>>");
                        name = sc.next();
                        boolean CancelCheck = a.Cancel(name);
                        if(!CancelCheck){
                            System.out.println("잘못된 이름을 입력하셨습니다. 다시 입력하세요.");
                            break;
                        }

                    }
                    else if(NextCommand == 3) {
                        b.PrintSeat();
                        System.out.print("이름>>");
                        name = sc.next();
                        boolean CancelCheck = b.Cancel(name);
                        if(!CancelCheck){
                            System.out.println("잘못된 이름을 입력하셨습니다. 다시 입력하세요.");
                            break;
                        }
                    }
                    else {
                        System.out.println("잘못된 입력입니다. 다시 입력하세요.");
                    }
                    break;
                case "4":
                    end = true;
                    break;
                default:
                    System.out.println("1~4중에 값을 입력하세요.");
            }
            if (end){
                break;
            }
        }
        System.out.println("종료되었습니다.");
    }
}
