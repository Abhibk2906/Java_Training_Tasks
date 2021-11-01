import java.util.*;
public class ArrayListTask {
	 public static float mean(ArrayList<Integer> list){
	        float sum=0;
	        for(int i=0;i<list.size();i++){
	            sum=sum+list.get(i);
	        }
	        return sum;
	    }
	    
	    public static double median(ArrayList<Integer> list){
	    	Collections.sort(list);
	        double index;
	        int n=list.size();
	        if(n%2==0){
	        	 index = ((double)list.get(n/2) + (double)list.get(n/2 - 1))/2;
	        }else{
	       index=(double)list.get(n/2);
	        }
	        return index;
	    }
	    
	

		public static void main(String[] args) {
			ArrayList<Integer> ar=new ArrayList<>();
			ar.add(1);
			ar.add(2);
			ar.add(3);
			ar.add(4);
			ar.add(5);
			
			
			System.out.println("The array list elements are");
			for(int i=0;i<ar.size();i++){
			    System.out.print(ar.get(i)+" ");
			}
			System.out.println();
			System.out.println();
			System.out.println("The sum of Array is : "
			+ mean(ar) + "\nThe mean of array is "+mean(ar)/ar.size());
			System.out.println();
			System.out.println("The median of arraylist is "+median(ar));
		}


}
