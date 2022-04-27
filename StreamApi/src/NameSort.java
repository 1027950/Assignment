import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

public class NameSort {

	public static void main(String[] args) {

     List<String> list=new ArrayList<>();
     
     list.add("Amrapali");
     list.add("ketaki");
     list.add("akshada");
     list.add("ritu");
     
     List<String> l=list.stream().filter(e->e.startsWith("A")||e.startsWith("a")).collect(Collectors.toList());
     System.out.println(l);
     
	}



}
