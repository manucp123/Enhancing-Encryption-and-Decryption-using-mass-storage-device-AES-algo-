/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;
import java.io.File;
/**
 *
 * @author MADHURENDRA PURBAY
 */
public class CryptoUtilsTest {
    public static void  encryption_Dec() {
    String key =Encryption.a;
        File inputFile = new File("E:\\pro.jpg");
        File encryptedFile = new File("document.jpg");
        File decryptedFile = new File("document1.jpg");
         
        try {
            CryptoUtils.encrypt(key, inputFile, encryptedFile);
            CryptoUtils.decrypt(key, encryptedFile, decryptedFile);
        } catch (CryptoException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
