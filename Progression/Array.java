public class Array{
	public static void main(String[] args) {

		int []array = {1, 5, 9};
		for (int j = 0; j < array.length; j++){
			double test = array[2] - array[1];
			boolean flag = true;
				for (int i=0; i<array.length-1; i++){
					if (array[i+1] - array[i] != test)
					flag = false;
					}
					if (!flag)
					System.out.println ("Не арифметическая прогрессия!");
					else
					System.out.println("Арифметическая прогрессия");
		}
	}
}