import java.util.Scanner;
public class ex4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM=10;
		int a[],s=0, m, i; 
		a = new int[TAM];
		for (i=0; i<TAM; i++) {
			System.out.println("Diga o " + (i+1) + "° número.");
			a[i] = ler.nextInt();
			
		}
		for (i = 0; i < TAM; i++) {
            s += a[i];
        }
        m = s / TAM;
		System.out.println("a média é: " + m);
		
	}
}
