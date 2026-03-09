package default_method;

import java.util.Scanner;

public class Children implements ParentA,ParentB {


    @Override
    public void learning() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào hành động: ");
        String handle = sc.nextLine();
        if(handle.equals("study")) {
            ParentA.super.learning();
        }
        if(handle.equals("protect")) {
            ParentB.super.learning();
        }
    }


}
