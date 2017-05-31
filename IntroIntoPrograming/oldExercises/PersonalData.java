
public class PersonalData {

	public static void main(String[] args) {
		// post and pre increment
		// if ++ or -- is before the variable so u update then change the value - pre increment
		//if ++ or -- is after the variable so u change the value then update - post increment
		
		int i=2,j=3;
		int a =i++ + j++ + i++ + j++ - --j + --i + ++i + ++j;
		System.out.println("i is: " + i);
		System.out.println("j is: " + j);
		System.out.println("a is " + a);
		String fn="Gilberto", ln= "Caobianco";
		String fn2="Joe", ln2= "Fitzpatrick";
		String fn3= "Marrion", ln3= "Jennings";
		String fn4= "Marie Anne", ln4= "Lyons";
		int age = 38;
		int age2= 23;
		int age3= 22;
		int age4 = 44;
		double coins = 3.84;
		double coins2 = 34.4;
		double coins3 = 187.34;
		double coins4 = 2233.45566;
		
		System.out.printf("%s %s is %d years old and has %f in her pocket",  fn, ln, age, coins);
		System.out.println("My Friends List: ");
		System.out.println("-----------------");
		System.out.println(fn + "\t" + ln + "\t" + age + "\t" + coins);
		System.out.println(fn2 + "\t" + ln2 + "\t" + age2 + "\t" + coins2);
		System.out.println(fn3 + "\t" + ln3 + "\t" + age3 + "\t" + coins3);
		System.out.println(fn4 + "\t" + ln4 + "\t" + age4 + "\t" + coins4);
		
		System.out.println("My Friends List: ");
		System.out.println("-----------------");
		System.out.printf("%-15s %-15s %5s  %12s\n" , "First Name", "Last Name ", "Age", "Coins");
		System.out.println("-----------------");
		System.out.printf("%-15s %-15s %5d %12.2f\n", fn, ln, age, coins);
		System.out.printf("%-15s %-15s %5d %12.2f\n", fn2, ln2, age2, coins2);
		System.out.printf("%-15s %-15s %5d %12.2f\n", fn3, ln3, age3, coins3);
		System.out.printf("%-15s %-15s %5d %12.2f\n", fn4, ln4, age4, coins4);
		// backslash "/n" arruma as colunas nao as endireita deixando perfeitamente em simetria mais nao mistura os numeros e colunas como estavam antes.
		// os numeros no caso 15 e pra desenhar as colunas..15 caracteres a direita, se o numero for negativo esta comecando da esquerda ou ajustando a esquerda.
		// na quarta coluna o numero 8.2 e pra alinhar na coluna e o .2 e pra definir qtos decimais depois dos numeros caso queira simplificar.
		
		String[] firstname = {"Gilberto", "Joe", "Marrion", "Marie-Anne"};
		String[] lastname = {"Martin", "Fitzpatrick", "Jennings", "Lyons"};
		int[] ages = {20,23,22,44};
		double[] money = {3.84, 34.4, 187.34, 2233.46887};
		System.out.println();
		System.out.println("My Friends List: ");
		System.out.printf("%-15s %-15s %5s  %12s\n" , "First Name", "Last Name ", "Age", "Coins");
		System.out.println("--------------------------------------------------");
		
		for (int x=0; x<firstname.length; x++){
			System.out.printf("%-15s %-15s %5d %12.2f\n",
					firstname[x], lastname[x], ages[x], money[x]);
			
			System.out.println(firstname[x]);
		}
		
		
				
		
		
		
		
		
		
		
		

	}

}