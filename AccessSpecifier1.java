import package1.ProtectedAccess;

class DefaultAccess{
    void display(){
        System.out.println("This is the default access modifier. It has access within the same package.");
    }
}

public class AccessSpecifier1{
public static void main(String[] args){
    DefaultAccess defaultAccessObject = new DefaultAccess();
    defaultAccessObject.display();
    PrivateAccess privateAccessObject = new PrivateAccess();

    ProtectedAccess protectedAccessObject = new ProtectedAccess();
    protectedAccessObject.classProtectedMethod();

    // The following code will not allow access because the method uses a private access modifier. Private access modifiers only have access in the class and subclasse.
    // privateAccessObject.display();
    privateAccessObject.callPrivateMethod();
    }
}

class PrivateAccess{
    private void display(){
        System.out.println("This method is private. It has access within this class and subclasses only. You can use getters to get access to it and setters to modify it.");
    }
    public void callPrivateMethod(){
        display();
    }
}
