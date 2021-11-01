package casestudy1;
import java.util.*;

public class FlowerDemo {

	public static Map<String, String> displayFlower(String continentName) {
		 Map<String,String> data = new HashMap<String,String>();
		 if(continentName.equalsIgnoreCase("asia")) {
		 data.put("Pakistan","jasmine");
		 data.put("Nepal","Lali Gurans");
		 data.put("India","Lotus");
		 return data;
		 } else if(continentName.equalsIgnoreCase("europe")) {
			 data.put("Germany","Corn Flower");
			 data.put("France","Lily");
			 data.put("Greece","Acanthus Mollis");
			 return data;
		 } else if(continentName.equalsIgnoreCase("africa")) {
			 data.put("Egypt","Blue Lotus");
			 data.put("Nigeria","Yellow Trumpet");
			 data.put("Kenya","Orchid");
			 return data;
		 } 
		 data.put("No data","Found!!!!!");
		 return data;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the continent name to get data");
		String continent=sc.nextLine();
		Map<String, String> map=displayFlower(continent);
		System.out.println();
		System.out.println("CountryName\tNationalFlower");
		System.out.println("---------------------------------");
		for(Map.Entry m : map.entrySet()){ 
			System.out.println(m.getKey()+"\t\t"+m.getValue());  
		}
		sc.close();
	}
}
