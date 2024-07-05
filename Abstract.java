abstract class Vehicle {
    public abstract void vehicle();
        public void welcome(){
        System.out.println("The cars in the showroom are:");
    }
}
class Car extends Vehicle {
    public void vehicle() {
        String [][] cars = { {"Ford","Rolls Royce"}, {"Mercedes", "Suzuki"}};
        for(int i=0; i<cars.length; ++i){
            for(int j=0; j<cars[i].length;++j){
                System.out.println(cars[i][j]);
            }
        }
    }
}
public class Abstract{
    public static void main(String[] args) {
        Car carname = new Car();
        carname.welcome();
        carname.vehicle();
    }
}
