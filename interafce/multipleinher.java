package OOP.interafce;

public class multipleinher {
    public static void main(String[] args) {
        C obj = new C();
        // obj.End();
        obj.Start();
    }
}
interface A{
    public void Start();
}
interface B{
    public void Start();
}
class C implements A,B{
    public void Start(){
        System.out.println("Error Occured");
    }
    public void End(){
        System.out.println("End is near");
    }
}
