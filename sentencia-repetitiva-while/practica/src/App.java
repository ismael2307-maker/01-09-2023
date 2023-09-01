import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int num1,num2,Resultado;

        System.out.println("Digite el primer numero");
        num1=s.nextByte();

        while(num1<=0){
             System.out.println("Digite el primer numero");
             num1=s.nextByte();
        }
         System.out.println("Digite el segundo numero");
         num2=s.nextByte();

          while(num2<=0){
             System.out.println("Digite el primer numero");
             num2=s.nextByte();
             
       }
         Resultado=num1+num2;
        System.out.println("El resultado de: "+num1 + " + " +  num2 + " = " +Resultado);


       s.close();
    }
}
