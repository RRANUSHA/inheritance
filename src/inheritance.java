class Base{
    int x;
    public int getX(){
        return x;

    }
    public void setX(int num){
        System.out.println("i am setting x in base");
        x=num;
    }
}

class Derived extends Base{
    int y;
    public int getY(){
        return y;

    }
    public void setY(int num){
        System.out.println("i am setting y in derived ");
        y=num;

    }}
public class inheritance {
    public static void main(String[] args) {
        Base b=new Base();// creating object of base class
        b.setX(6);
        Derived d=new Derived();
        d.setY(77);
        System.out.println(d.getY());
        System.out.println(b.getX());
    }
}
