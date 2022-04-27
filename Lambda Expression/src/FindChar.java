/*
 * import java.util.Scanner;

 * 
 * interface character { void show();
 * 
 * }
 * 
 * public class FindChar {
 * 
 * public static void main(String[] args) {
 * 
 * character m = ()->{
 * 
 * String str="Galaxy";
 * 
 * Scanner sc = new Scanner (System.in);
 * System.out.println("Enter any Character:"); String n= sc.next();
 * 
 * int index = str.indexOf(n);
 * 
 * System.out.println("character is at index "+index);
 * 
 * };
 * 
 * m.show();
 * 
 * }
 * 
 * 
 * 
 * }
 * 
 */

import java.time.LocalTime;
class FindChar
{
  public static void main(String s[])
  {
    LocalTime objtime = LocalTime.now();
	System.out.println(objtime);
	LocalTime oldTime = LocalTime.of(18,34,33);
	System.out.println(oldTime);
	// for getting old time by subtracting hour and minute we can use minusHours and minusMinutes()
	
	LocalTime ot1 = objtime.minusHours(10);
	System.out.println(ot1);
	
	LocalTime ot2 = objtime.minusMinutes(50);
	System.out.println(ot1);	
	
	LocalTime ot3 = objtime.plusHours(5);
	LocalTime ot4 = objtime.plusMinutes(15);
	System.out.println(ot3);
	System.out.println(ot4);
	
  }
}