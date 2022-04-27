
interface Max{
	void search();
}
public class MaxNumber {

	public static void main(String[] args) {
		
           Max m= () -> {
			
			int arr[]= {2,4,6,8,10,12,14};
			int max=0;
		  for(int i=0;i<arr.length;i++) 
		  {
			  if(arr[i]>max) 
			  {
				  max=arr[i];
			  }
			  
		  }
		  System.out.println("Maximum number is -> "+max);
	};
	m.search();

}
}
