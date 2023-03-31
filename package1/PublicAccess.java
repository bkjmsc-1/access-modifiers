package package1;

public class PublicAccess {
    public void helloPublic(){
        System.out.println("Hello public. I can be accessed anywhere. But if it belongs to a different package, you must import that package.");
    }
}
