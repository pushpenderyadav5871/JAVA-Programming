

class shape{
    public static void area(){
        System.out.println("Display Area");
    }
}
class triangle extends shape{
    public  void area(int s,int h){
        System.out.println(s*h);
    }
} 
class equilateraltriangle extends triangle{
    public  void area(int a){
        System.out.println(a*a);
    }
}
public class inheritance {
    public static void main(String agrs[]){
        triangle t1 =new triangle();
        int s=5;
        int h=4;
        t1.area(s, h);
        int a = 3;
       equilateraltriangle t2 = new equilateraltriangle();
       t2.area(a);

    }
    
}
