package Switch_case;

public class Switch_int {

	public static void main(String[] args) {
		
		System.out.println("To check a perticular day in a week");
		
		int day = 6;
		switch (day)
		{
		case 1:
		System.out.println("Today is Monday");
		break;
		
		case 2:
		System.out.println("Today is Tuesday");
		break;
		
		case 3:
		System.out.println("Today is Wednesday");
		break;
		
		case 4:
		System.out.println("Today is Thirsday");
		break;
		
		case 5:
		System.out.println("Today is Friday");
		break;
		
		case 6:
		System.out.println("Today is Saturday");
		break;
		
		case 7:
		System.out.println("Today is Sunday");
		break;
		
		default:
			System.out.println("Plz provide a valid input");
		}

	}

}
