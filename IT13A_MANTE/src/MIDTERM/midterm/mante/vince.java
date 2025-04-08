
package mante;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class vince {
     public static void main(String[] args) throws FileNotFoundException {
        File myObj = new File("D:\\T-shirt-Parent-Consent.docx");
        Scanner myReader = new Scanner(myObj);
        int shift = 3;

        System.out.println("Original and Encrypted Text:");
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine(); 
            String encrypted = encryptMessage(data, shift); 
            System.out.println("Original : " + data);
            System.out.println("Encrypted: " + encrypted);
            System.out.println();
        }
        myReader.close();
    }

    public static String encryptMessage(String message, int key) {
        char[] chars = message.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] += key;
        }
        return new String(chars);
    }
}

