import java.util.Random;

public class Perceptron {
	
	Random r = new Random();
	double w[] = {r.nextDouble(), r.nextDouble()};
	double b = r.nextDouble();
	double a = 0.9;
	int aux = r.nextInt(2);
	
	
	public void teste(int x[][], int d[], int t) {
		if(aux==0)
			b=-b;
		double u;
		int y, aux1=1, k=0;
		int[] e = new int[4];
		while(aux1>0&&k<t) {
			aux1=0;
			for (int i = 0; i < x.length; i++) {
				u = w[0]*x[i][0] + w[1]*x[i][1] + b;
				if(u<=i)
					y = -1;
				else
					y = 1;
				e[i] = d[i] - y;
				w[0] = w[0] + (a*e[i]*x[i][0]);
				w[1] = w[1] + (a*e[i]*x[i][0]);
				b = b + (a*e[i]);
				}
			for (int i = 0; i < e.length; i++) {
				if(e[i]!=0)
					aux1++;
			}
			System.out.println(k);
			k++;
		}
		System.out.println(w[0]+" "+w[1]+" "+b);
	}

}
