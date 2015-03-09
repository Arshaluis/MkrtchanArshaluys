public class Geometr{
	public static void main(String[] args) {

		int []array = {2, 10, 50, 250};
		for (int j = 0; j < array.length; j++){
			double test = array[2]/array[1];
			boolean flag = true;
				for (int i=0; i<array.length-1; i++){
					if (array[i+1]/ array[i] != test)
					flag = false;
					}
					if (!flag)
					System.out.println ("Не геометрическая прогрессия!");
					else
					System.out.println("Геометическая прогрессия");
		}
	}
}