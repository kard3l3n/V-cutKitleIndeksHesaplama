package kitleindekshesaplama;
import java.util.Scanner;
import java.math.*;
public class KitleIndeksHesaplama {
    public static void main(String[] args) {
        /*
        Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
Lütfen kilonuzu giriniz : 105
Vücut Kitle İndeksiniz : 35.49215792320173
        */
        
        Scanner input=new Scanner(System.in);
        
        System.out.println("Lütfen boyunuzu (metre cinsinden) giriniz:");
        Double boy=input.nextDouble();
        
        System.out.println("Lütfen kilonuzu giriniz:");
        Double kilo=input.nextDouble();
        
        Double VucutKitleIndeksi=kilo/(boy*boy);
        System.out.print("Vücut Kitle İndeksiniz:"+VucutKitleIndeksi);
        
        
        
      
    }
    
}
