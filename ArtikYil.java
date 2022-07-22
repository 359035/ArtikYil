/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package artikyil;

/**
 *
 * @author Samsung
 */
import java.util.Scanner;
public class ArtikYil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input=new Scanner(System.in);
        
        System.out.print("Yili Giriniz : ");
        int yil=input.nextInt();
        boolean artikYil=false;
        
        if(yil%4==0){
            if(yil%100==0){
                if(yil%400==0){
                    artikYil=true;
                }else{
                    artikYil=false;
                }
            }else{
                artikYil=true;
            }
        }else{
            artikYil=false;
        }
        
        if(artikYil){
            System.out.println(yil +" yili artik yildir.");
        }else{
            System.out.println(yil +" yili artik yil degildir.");
        }
    }
    
}
