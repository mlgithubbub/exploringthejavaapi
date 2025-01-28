package java_io;

import java.io.File;

public class file {

    public static void main(String[] args) {
        File myFile = new File("Documents");
        myFile.mkdir();
        System.out.println(myFile.exists());
        System.out.println(myFile.toString());
        System.out.println(myFile.getAbsolutePath());
        myFile.delete();
    }
}
