/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deshi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author austichr
 */
public class Deshi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("pp.txt.txt"));
      while(scan.hasNext()){
        String str = scan.nextLine();
        {
        ArrayList v = new ArrayList();
        ArrayList c = new ArrayList();
        boolean notAcc;
        boolean isVowel;
        for(int x = 0; x<=str.length()-1; x++){
            if(str.charAt(x) == 'a' || str.charAt(x) == 'e' || str.charAt(x) == 'i'
                || str.charAt(x) == 'o' || str.charAt(x) == 'u'){
            isVowel = true;
            }
            else isVowel = false;
        }
    for(int x = 0; x<=str.length()-1; x++){
        if(str.charAt(x) == 'a' || str.charAt(x) == 'e' || str.charAt(x) == 'i'
                || str.charAt(x) == 'o' || str.charAt(x) == 'u'){
            v.add(str.charAt(x));
        }
        else c.add(str.charAt(x));
    }
    for(int x = 0; x<=str.length()-1; x++){
        if(str.charAt(x)&& str.charAt(x)+1 && str.charAt(x)+2&& str.charAt(x)+3){
            
        }
    }
    if (notAcc = true){
        System.out.println(str + "is not acceptable.");
    }
    else if(v.size()>7){
        System.out.println(str + "is not acceptable.");
    }
    else System.out.println(str + "is acceptable.");
    }
}
}
}
//Check .contains methods, check regex, make methods
