/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class ClsContenent {
        Scanner read =new Scanner (System. in );
        mdposiciones send = new mdposiciones();
        public void Contenido(){
        try{
            int menu;
            do{
        System.out.println("Lleva el ♪ hata la pocision en la que se encuentra @ ;");
        System.out.println("Solo tienes 4 intentos;");
        
        send.setColumnarandom(new Cls_numerorandom().numeroaleatorio()); 
        send.setFilarandom(new Cls_numerorandom().numeroaleatorio());

        new matriz().matrizoriginal(send.getColumnarandom(),send.getFilarandom()); 
        new Cls_recorridos().recorridos(send.getColumnarandom(),send.getFilarandom());
       
        System.out.println("\nPresione 0 para intentar nuevamente\nPresina cualquier numero para terminar");
        menu = read.nextInt();
        }while(menu ==0);
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }        
    } 
}  
    
