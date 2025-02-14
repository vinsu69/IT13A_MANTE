
package Prelim;


public class Act1_Arithmetic_Operators {
     public static void main(String[] org){
             
        int numb1 = 10;
        int numb2 = 6;
        int numb3 = 4;
        int numb4 = 3; 
        
        
        
        int mante1 = numb1 * numb3 + numb2;
        int depends1 = numb1 - numb3;
        int mante2 = depends1 % numb2;
        int depends2 = numb1 + numb3 + numb2;
        int mante3 = depends2 / numb4;
        int depends3 = numb3 * numb3;
        int mante4 = numb1 * numb2 - depends3;
        
          System.out.println("10 * 4 + 6 ="+ mante1);
         System.out.println("(10-4) % 6 = "+ mante2);
            System.out.println("(10 + 4 + 6)/3 = "+ mante3);
               System.out.println("10 * 6 -(4 * 4 ) = "+ mante4);
               
     }
}
