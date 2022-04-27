interface Binary{
	void search();
}
public class BinarySearch {
	public static void main(String s[]) {
		
		Binary b = () -> {
			
			int arr[]= {2,4,6,8,10,12,14};
			int number=8;
			int low=0, high=(arr.length)-1;
			
			while(low<=high)
			{
				int mid=(low+high)/2;
				
				if(number<arr[mid]) {
					high=mid-1;
				}
				
				else if(number>arr[mid]) {
					low=mid+1;
				}
				
				else if(number==arr[mid]) {
					System.out.println("Number "+number+" is found at location-> "+mid);
					break;
				}
			}
		};
		
		b.search();
	}
}