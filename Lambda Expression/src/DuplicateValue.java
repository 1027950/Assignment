
public class DuplicateValue {

	public static void main(String[] args) {
		
      int[] arr= new int[] {28, 14, 8, 28, 28};
      int count=0;
      int number=28;
      
      for(int i=0;i<arr.length;i++)
      {
    	  if(arr[i]==number)
    		  count++;
      }
         
      if(count>0)
      {
      System.out.println("Duplicate value count of number 28 is "+count);
      }
      else
      {
    	  System.out.println("Number is not present");  
      }
}
}