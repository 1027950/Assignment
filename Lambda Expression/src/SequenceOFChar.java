

interface Sequence{
	      void m();
	      default void search(String a, String b)
	   {
	    	  int c=a.indexOf(b);  
	    	  System.out.print(c);
	   }
       }
       
		public class SequenceOFChar {
			
			public static void main(String[] args) {

                String a ="This is default method";
                String b="s";
                
                Sequence seq = () ->
                System.out.print("index of given character <"+b+"> is -> ");
                seq.m();
                seq.search(a, b);
                }
			}