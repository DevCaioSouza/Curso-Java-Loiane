
public class Ex04 {

	public static void main(String[] args) {
		double[] temperaturas = new double[365];
		temperaturas[0] = 31.3;
		temperaturas[1] = 32;
		temperaturas[2] = 33.7;
		temperaturas[3] = 34;
		temperaturas[4] = 33.1;
		
		System.out.println("A temperatura do dia 3 e: " + temperaturas[2]);
		
//		for(int i = 0; i<temperaturas.length ; i++) {
//			System.out.println("O valor da temperatura do dia " + (i+1) + " eh: " + temperaturas[i]);
//		}
		
		//temos tb um for melhorado
		for(double temp: temperaturas) {
			System.out.println(temp);
		}

	}

}
