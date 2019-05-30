
public class Main {

	public static void main(String[] args) {

		int[] d = {1, -1, -1, -1};
		int[][] x = {{1,1},{1,0},{0,1},{0,0}};
		int epoca = 15;
		
		Perceptron p = new Perceptron();
		p.teste(x, d, epoca);
		
		

	}

}
