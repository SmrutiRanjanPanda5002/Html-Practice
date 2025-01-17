class obj1{
    public void main(){
        System.out.println(" It is obj1\n");
    }
}
class oj2 extends obj1{
    void main2()
    {
        System.out.println("It is obj2\n");
    }
}
class obj3 extends oj2
{
    void main3()
    {
        System.out.println("It si obj3\n");
    }
}
public class dynamic {
 public static void main(String[] args) {
     obj1 o1=new obj1();
     obj2=new obj2();

 }   
}
