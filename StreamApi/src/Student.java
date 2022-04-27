import java.util.*;
 
class Studentinfo{
	int marks;
    String name;
    
 public Studentinfo(int marks, String name) {
     this.marks = marks;
     this.name = name;
}
}
public class Student{
public static void main(String args[]){

		List<Studentinfo> list=new ArrayList<Studentinfo>();
		list.add(new Studentinfo(66, "Amrapali"));
		list.add(new Studentinfo(86, "Rupali"));
		list.add(new Studentinfo(78, "Shraddha"));
		list.add(new Studentinfo(92, "Pratiksha"));
		
		Double avgmarks = list.stream().mapToInt(sv->sv.marks).average().getAsDouble();
		System.out.println(avgmarks);
}

}