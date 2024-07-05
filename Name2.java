class Majorname {
    public void raj()
    {
        System.out.println("All the names are listed below:");
    }
}
class name1 extends Majorname {
    public void raj() {
        System.out.println("Raj BE");
    }
}
class name2 extends Majorname {
    public void raj() {
        System.out.println("Mithun");
    }
}
class name3 extends Majorname {
    public void raj() {
        System.out.println("Prabu");
    }
}
public class Name2
{
    public static void main(String[] args) {
        Majorname obj = new Majorname();
        Majorname myname1 = new name1();
        Majorname myname2 = new name2();
        Majorname myname3 = new name3();
        obj.raj();
        myname1.raj();
        myname2.raj();
        myname3.raj();
    }
}
