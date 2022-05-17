class Rectangle{
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public int square(){
        int rst = this.width * this.height;
        return rst;
    }
    public void show(){
        System.out.printf("(%d,%d)에서 크기가 %dx%d인 사각형", this.x,this.y,this.width,this.height);
        System.out.println();
    }
    public boolean contains(Rectangle r) {
        if (x < r.x && y < r.y) {
            if ((width + x) > (r.x + r.width) && (height + y) > (r.y + r.height)) {
                return true;
            }
        }
        return false;
    }
        // this.x this.y this.width this.height r.x r.y r.width r.height

}


public class HomeWork3_4 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(2,2,8,7);
        Rectangle s = new Rectangle(5,5,6,6);
        Rectangle t = new Rectangle(1,1,10,10);

        r.show();
        System.out.println("s의 면적은 "+ s.square());
        if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
        if(t.contains(s)) System.out.println("t는 s를 포함합니다.");

    }
}
