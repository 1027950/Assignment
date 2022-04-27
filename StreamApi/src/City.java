import java.util.*;
import java.util.stream.Collectors;
 class Cityinfo {
	 String cityname;
	    int citypopulation;
	    float area;
	
	    Cityinfo(String cityname,int citypopulation,float area){
	    this.cityname=cityname;
	    this.citypopulation=citypopulation;
	    this.area=area;
	}
 }
	    public class City{
	public static void main(String s[]){
	    ArrayList <Cityinfo> city = new ArrayList<Cityinfo>();
	    city.add(new Cityinfo("Pune",   4000,   150));
	    city.add(new Cityinfo("Mumbai", 10000,  200));
	    city.add(new Cityinfo("Nasik",  8000, 	700));
	    city.add(new Cityinfo("Nagpur", 9000, 	400));
	  
	  Cityinfo obj=city.stream().max((obj1, obj2)->obj1.citypopulation>obj2.citypopulation? 1:-1).get(); 
	  System.out.println("Citypopulation in --> "+obj.cityname+"-->"+obj.citypopulation);
	  
	  Set<Integer> Set = city.stream().map(e->e.citypopulation).collect(Collectors.toSet());
	  System.out.println(Set);
	  
      Cityinfo leastarea=city.stream().max((obj1, obj2)->obj1.area<obj2.area? 1:-1).get(); 
	  System.out.println("Leastarea in --> "+leastarea.cityname+"-->"+leastarea.area);

}
}