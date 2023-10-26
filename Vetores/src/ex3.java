import java.util.*;

public class ex3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM=10;
		int inv = TAM -1, i, a[], b[];
		a = new int [TAM];
		b = new int [TAM];
		for (i=0; i<TAM; i++) {
			System.out.println("Diga o " + (i+1) + "° número.");
			a[i] = in.nextInt();
			b[inv] = a[i];
			inv--;
		}
		

		for (i=0; i<TAM; i++) {
			if (i > 0){
				System.out.print(b[i] + " ");
				}else {
					System.out.print( "os valores ao Invertidos São : " + b[i] + " ");
				}

		in.close();
		
	}
}
}
