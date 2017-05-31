public class DaysOfTheWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Satruday", "Sunday"};
		for (int i=0; i<days.length; i++){
			System.out.println(days[i]);
		
		}
		
		System.out.println();
		
		int x = 0; // initialise counter to zero before loop
		while (x<days.length){ //while guard is true
			System.out.println(days[x]);
			//avdancer
			x++;
			
		}

	}

}
