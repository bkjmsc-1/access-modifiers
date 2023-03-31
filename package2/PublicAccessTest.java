package package2;
import package1.*;

public class PublicAccessTest {
    public void PublicMethodTest(){
        System.out.println("This is available anywhere!");
    }   

    public static void main(String[] args){
        PublicAccessTest publicTestObject = new PublicAccessTest();
        publicTestObject.PublicMethodTest();
        PublicAccess publicAccessObject = new PublicAccess();
        publicAccessObject.helloPublic();
    }

}
