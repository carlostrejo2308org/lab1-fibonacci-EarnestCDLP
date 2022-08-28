import java.util.Scanner;

public class Fibonacci{
    public static void main(String args[]) {
        // n = 1 2 3 4 5 6  7   8  9 10  11 12   13
        // f = 1 2 3 5 8 13 21 34 55 89 144 233 377
        System.out.println("¿Cúal es la posición de la serie que desea encontrar?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    	
    	System.out.println("\nIterativo ");
        System.out.println("Resultado "+fiboIterativo(n));
        
        System.out.println("\nRecursivo ");
        System.out.println("Resultado "+fiboRecursivo(n));
        
    }
    public static int fiboRecursivo(int n){
        if(n<=1) return 1;
        else return fiboRecursivo(n-1) + fiboRecursivo(n-2);
    }
    public static int fiboIterativo(int n){
        int fibo_n1 = 1;
        int fibo_n2 = 1;
        int fibo = 0;
        for(int i = 0; i<=n; i++){
            fibo_n2 = fibo_n1;
            fibo_n1 = fibo;
            fibo = fibo_n1 + fibo_n2;
             System.out.print(fibo+" ");
        }
        
        return fibo;
    }
}