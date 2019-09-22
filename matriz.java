package Clases;

/**
 *
 * @author USUARIOTC
 */
public class matriz { 
    String ANSI_BLUE = "\u001B[34m";
    
    public void matrizoriginal(int x, int y){
        String matriz [][]=new String [10][10];
        for(int a=0;a<matriz.length;a++){
            matriz[1][1]="♪ ";
            matriz[x][y]="@ ";
            for(int b=0;b<matriz.length;b++){
            matriz[b][0]=ANSI_BLUE+Integer.toString(b)+" ";
            matriz[0][b]=ANSI_BLUE+Integer.toString(b)+" ";            
            matriz[a][b] = "¤ ";
            }
        }
        despliega(matriz);
    }

     public void despliega(String matriz [][] ){
        for( int x=0;x<matriz.length;x++)
        {
            for(int y=0;y<matriz[x].length;y++)
            {
                String currentCell=matriz[x][y];
                System.out.print(currentCell);
            }
            System.out.println();
        }
     }
}