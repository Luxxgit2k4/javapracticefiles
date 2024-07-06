interface Mugesh {
    public void firstmethod();
}
interface Mugesh2 {
    public void secondmethod();
}
interface Mugesh3{
    public void thirdmethod();
}
class Potta implements Mugesh,Mugesh2,Mugesh3 {
    @Override
    public void firstmethod() {
        System.out.println("HI");
    }
    public void secondmethod() {
        System.out.println("HELLO");
    }
    public void thirdmethod() {
        System.out.println("THANKYOu");
    }
}
class Interface {
    public static void main(String[] args) {
        Potta obj = new Potta();
        obj.firstmethod();
        obj.secondmethod();
        obj.thirdmethod();
    }
}
