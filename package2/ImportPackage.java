package package2;

import package1.*;

public class ImportPackage extends ProtectedAccess {
   public static void main(String[] args){

    ImportPackage protectedAccessObjectImport = new ImportPackage();
    protectedAccessObjectImport.protectedMethod();

   }
   
   
}
