/*pracice prgm for inheritance*/
class Name{
    static void nameis() {
        System.out.println("The changed array is");
    }
}
class Main extends Name {
    public static void main(String[] args) {
        String[] name = {"Prabu", "Raj", "luxx"};
                for(int i=0;i<name.length;i++)
                    System.out.println(name[i]);
                Main myobj = new Main();
                myobj.nameis();
                name[1] = "Mithun";
                for(int j=0;j<name.length;j++)
                    System.out.println(name[j]);
        /*System.out.println(name[1]);
        System.out.println(myobj.oldname);*/
    }
}
