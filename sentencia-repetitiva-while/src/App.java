import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        byte n;
       System.out.println("Sentencia while");
       System.out.println("que tabla de multiplicar desear saber");
       n=s.nextByte();
       byte x=1;
       while(x<=10){  
          System.out.println( n+ " x " + x + " = " +n*x );
           x++;
       }
       while(n<=0)
       {
         System.out.println("que tabla de multiplicar desear saber");
           n=s.nextByte();
           x++;  
       }
        System.out.println("  ");
        System.out.println("No puede ingresar numeros negativos ni ceros");
       
        System.out.println("Fin");

       s.close();
     
    }
}
