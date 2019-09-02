/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sepatudemo;

/**
 *
 * @author ASUS
 */
public class sepatubola extends Sepatu {
    private String pull ;
     public void setpull(String newValue){
         pull = newValue;
     }
    public void cetakStatus(){
        super.cetakStatus();
        System.out.println("jenis alas :"+pull);
        
    }
}
