package OOP.inheritance;

public class singleinher {
    public static void main(String[] args) {
        hr obj = new hr();
        obj.bonus();
        obj.salary();
    }
}

class employee{
    void salary(){
        System.out.println("GOof pay");
    }
}

class hr extends employee{
    void bonus(){
        System.out.println("No bonus");
    }
}
