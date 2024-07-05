/*This is a practice program for encapsulation using get and set method*/
class Kumar {
    public static void main(String[] args) {
        Rajdheepan prabu = new Rajdheepan();
        prabu.setPasswd(2003);
        System.out.println("The password is" + " " + prabu.getPasswd());
    }
}
class Rajdheepan {
    private int passwd;
    public int getPasswd() {
        return passwd;
    }
    void setPasswd(int Passwd){
        this.passwd = Passwd;
    }
}
