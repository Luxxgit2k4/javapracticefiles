class Raj {
int x= 5;
class Dheepan {
    int y = 7;
}
}
class Innerclass{
    public static void main(String[] args) {
        Raj num = new Raj();
        Raj.Dheepan num2 = num.new Dheepan();
        System.out.println(num.x + num2.y);
    }

}
