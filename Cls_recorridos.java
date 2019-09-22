package Clases;

import java.util.Scanner;

public class Cls_recorridos {
    Scanner read =new Scanner (System. in );
    mdposiciones send = new mdposiciones(); 
    int right=1,left=1,down=1,up=1;
    int numpos []=new int [5];  String direc[]=new String [5];
 
public void recorridos(int x, int y){
       for(int i = 0; i<=3; i++){
        direcciones(x,y); 
        if(send.getColumna()==x&&send.getFila()==y){
            System.out.println("\nFelicidades! lograste acertar!"); 
            matrizrecorridos(x,y,send.getColumna(),send.getFila(),"♪"); 
            resultados();break;
        } 
       direc[i]= send.getDireccion();
    } 
        if(send.getColumna()<x&&send.getFila()<y){
           System.out.println("\nNo lograste acertar :C"); 
           matrizrecorridos(x,y,send.getColumna(),send.getFila(),"@");
           resultados();
        }
}
   
public void direcciones(int x, int y){
       System.out.print("En que direccion debo ir -> ");       
       String direccion = read.next().toLowerCase();
        switch(direccion){
            case "derecha":
                System.out.print("Cuantos pasos dara a la derecha? -> ");right=read.nextInt();
                 send.setRight(right);  send.setFila(send.getRight());
                 numpos[0]=send.getRight(); send.setDireccion(direccion);
                 matrizrecorridos(x,y,1,send.getRight(),"@");
                break;
                
            case "izquierda":
                System.out.print("Cuantos pasos dara a la izquierda? -> ");left=read.nextInt();
                send.setLeft(left); send.setFila(send.getLeft());
                numpos[2]=left; send.setDireccion(direccion);
                matrizrecorridos(x,y,1,send.getLeft(),"@");
                break;
                
            case "abajo":
                System.out.print("Cuantos pasos dara hacia abajo? -> ");down =read.nextInt();   
                send.setDown(down); send.setColumna(send.getDown()); 
                numpos[1]=down;
                direc[1]=direccion;
                matrizrecorridos(x,y,send.getDown(),1,"@");
                 break;
            
            case "arriba":
                System.out.print("Cuantos pasos dara hacia arriba? -> ");up =read.nextInt();   
                send.setColumna(up); send.setColumna(send.getUp());
                numpos[3]=up;
                direc[3]=direccion;
                System.out.println();
                matrizrecorridos(x,y,send.getUp(),1,"@");
                break;  
            default :
                     System.out.println("Ingresa valor correcto");
                    break;
        }
   }
   public void resultados(){
       for(int i = 1; i<4; i++){
       System.out.println("La direccion "+i+" fue; "+direc[i]);
       System.out.println("El paso" +i+" fue; "+numpos[i]);
       }
   } 
   
   public void matrizrecorridos(int x, int y, int p1, int p2, String c){
        String ANSI_BLUE = "\u001B[34m";
        String matriz [][]=new String [10][10];
        for(int a=0;a<matriz.length;a++){
            matriz[p1][p2]="♪ ";
            matriz[x][y]= c+" ";
            for(int b=0;b<matriz.length;b++){
            matriz[b][0]=ANSI_BLUE+Integer.toString(b)+" ";
            matriz[0][b]=ANSI_BLUE+Integer.toString(b)+" ";
            matriz[a][b] = "¤ ";
            }
        }
        new matriz().despliega(matriz);
    }   
}