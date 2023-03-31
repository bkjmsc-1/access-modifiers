package package1;

public class ProtectedAccess {
    protected void protectedMethod(){
        System.out.println("This content is protected. It is available within the package but not outside of it.");
        System.out.println("You can access this protected method outside the package by importing this package into another package.");
        System.out.println("Then, you make a class that extends this class.");
        System.out.println("After that, you can make an object of the class that extendes this class and call the protected method that way.");
    }
    public void classProtectedMethod(){
        System.out.println("Public methods can be accessed anywhere. Below calls the protected method via this public method");
        protectedMethod();

    }
}
