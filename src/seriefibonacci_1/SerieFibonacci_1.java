package seriefibonacci_1;

public class SerieFibonacci_1 {
public int n;
    public int Fibonacci(int n) {
        if (n > 1) {
            return Fibonacci(n - 1) + Fibonacci(n - 2);

        } else if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;

        } else {
            System.out.println("\u001B[36mDebes ingresar un tamaño igual o mayor a 1");
            return -1;
        }
    }

    public void Serie(int n) {
        System.out.println("=====================================================");
        System.out.println("\033[35mLa serie es:\033[0m");
        for (int i = 0; i < n; i++) {
            System.out.println("\033[34m " +Fibonacci(i) );
            
        }
    }
}
