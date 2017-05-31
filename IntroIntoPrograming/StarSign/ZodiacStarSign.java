/*
StarSign.java
@ Author C Shiels
25/03/2017
*/
public class ZodiacStarSign{

	    int month;
        int day;
        private String message;
		private String monthName;

        public ZodiacStarSign(){
		month=0;
        day=0;
	}
	public void setMonth(String monthName){
			this.monthName=monthName;
		}
		public void setDay(int day){
					this.day=day;
				}

		public void computeMonth(){
			if(monthName.equalsIgnoreCase("january")){
				month=1;
			}
			else if(monthName.equalsIgnoreCase("febuary")){
				month=2;
			}
			else if(monthName.equalsIgnoreCase("march")){
				month=3;
			}
			else if(monthName.equalsIgnoreCase("April")){
				month=4;
			}
			else if(monthName.equalsIgnoreCase("may")){
							month=5;
			}
			else if(monthName.equalsIgnoreCase("june")){
							month=6;
			}
			else if(monthName.equalsIgnoreCase("july")){
							month=7;
			}
			else if(monthName.equalsIgnoreCase("august")){
							month=8;
			}
			else if(monthName.equalsIgnoreCase("september")){
							month=9;
			}
			else if(monthName.equalsIgnoreCase("october")){
							month=10;
			}
			else if(monthName.equalsIgnoreCase("november")){
							month=11;
			}
			else if(monthName.equalsIgnoreCase("december")){
							month=12;
			}
		}

		public void compute(){
			computeMonth();

			 if((month == 12 && day >= 22 && day <= 31) || (month ==  1 && day >= 1 && day <= 19)){
				message="Capricorn";
			}

			else if ((month ==  1 && day >= 20 && day <= 31) || (month ==  2 && day >= 1 && day <= 17)){
				message="Aquarius";
			}

			else if ((month ==  2 && day >= 18 && day <= 29) || (month ==  3 && day >= 1 && day <= 19)){
				message="Pisces";
			}

			else if ((month ==  3 && day >= 20 && day <= 31) || (month ==  4 && day >= 1 && day <= 19)){
				message="Aries";
			}

			else if ((month ==  4 && day >= 20 && day <= 30) || (month ==  5 && day >= 1 && day <= 20)){
				message="Taurus";
			}

			else if ((month ==  5 && day >= 21 && day <= 31) || (month ==  6 && day >= 1 && day <= 20)){
				message="Gemini";
			}

			else if ((month ==  6 && day >= 21 && day <= 30) || (month ==  7 && day >= 1 && day <= 22)){
				message="Cancer";
			}

			else if ((month ==  7 && day >= 23 && day <= 31) || (month ==  8 && day >= 1 && day <= 22)){
				message="Leo";
			}

			else if ((month ==  8 && day >= 23 && day <= 31) || (month ==  9 && day >= 1 && day <= 22)){
				message="Virgo";
			}

			else if ((month ==  9 && day >= 23 && day <= 30) || (month == 10 && day >= 1 && day <= 22)){
				message="Libra";
			}

			else if ((month == 10 && day >= 23 && day <= 31) || (month == 11 && day >= 1 && day <= 21)){
				message="Scorpio";
			}

			else if ((month == 11 && day >= 22 && day <= 30) || (month == 12 && day >= 1 && day <= 21)){
				message="Sagittarius";
			}
			else{
					  throw new IllegalArgumentException(
						"invalid number entered");
			}

    	}

		public String getMessage(){
			return message;
		}

}