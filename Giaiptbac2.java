import java.util.Scanner;
import java.lang.Math;
public class Giaiptbac2 {
  public static void main(String[] args){
    double a,b,c,x1,x2;
    double delta;
    Scanner input = new Scanner(System.in);
    System.out.print("Nhap a= ");
    a=input.nextFloat();
    System.out.print("Nhap b= ");
    b=input.nextFloat();
    System.out.print("Nhap c= ");
    c=input.nextFloat();
      if(a==0){
        if(b==0){
          if(c==0){
            System.out.println("Phuong trinh vo so nghiem ");
          }
          else{
            System.out.println("Phuong trinh vo nghiem ");
          }
        }
        else{
          x1=(-c)/b;
          System.out.println("Phuong trinh co nghiem duy nhat : " + x1);
        }
      }
      else{
        delta= (b*b)-(4*a*c);
        if(delta<0){
          System.out.println("Phuong trinh vo nghiem");
        }
        if(delta==0){
          x1= -b/(2*a);
          System.out.println("Phuong trinh co nghiem duy nhat" +x1);
        }
        if(delta>0){
          x1=(-b+Math.sqrt(delta))/(2*a);
          x2=(-b-Math.sqrt(delta))/(2*a);
          System.out.println("Phuong trinh co 2 nghiem" );
          System.out.println(x1);
          System.out.println(x2);
        }
      }
  }
 
}/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giaiptbac2;

/**
 *
 * @author chinh_000
 */
public class Giaiptbac2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
