//10. Count the number of words ending in 'm' or 'n' (not case sensitive) in a given text

package Assignment;

public class CountEnd {
	public int endWithmOrn(String stng) 
	{
	  int l = stng.length();
	  int ctr = 0;
	  stng = stng.toLowerCase();
	  for (int i = 0; i < l; i++) 
	  {
	    if (stng.charAt(i) == 'm' || stng.charAt(i) == 'n') 
		{
	      if (i < l-1 && !Character.isLetter(stng.charAt(i+1)))
	        ctr++;
	      else if (i == l-1)
	        ctr++;
	    }
	  }
	  return ctr;
	}
	
	public static void main (String[] args)
    {
      CountEnd m= new CountEnd();
      String str1 =  "ma";
      System.out.println("The given string is: "+str1);
      System.out.println("The number of words ends eith m or n is: "+m.endWithmOrn(str1));
	  }

}


