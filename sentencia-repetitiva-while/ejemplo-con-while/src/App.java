import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        System.out.println("Hasta que tabla de multiplicar desea saber?");
        byte n=s.nextByte();
        byte x=1,num=1;

        while(num<=n){
          while(x<=10){
            System.out.println( num+ " x " + x + " = " +num*x);
            x++;  
          }
          x=1;
         num++;
        }  
     s.close();
    }
}
