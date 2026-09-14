/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multidimensional;

/**
 *
 * @author ASUS
 */
public class MultiDimensional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int values [][] = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}}; 
        
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                System.out.print(values[i][j] + " ");
                
            }
            System.out.println();
        }
    }
    
}
