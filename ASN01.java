/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asn01;


import java.io.*;


/**
 *
 * @author Keon
 */
public class ASN01 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args)throws IOException {
    
       FileReader fr = new FileReader ("C:/Users/cookie.txt");
       
       int content;
       while ((content = fr.read()) != -1) {
		// convert to char and display it
		System.out.print((char) content);
	}
   }
}
