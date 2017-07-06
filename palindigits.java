# palindigits
import java.io.*;
import java.util.*;
public class palindromedigits
{
  public static void main(String arg[])throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
    int n,m,rev=0,i;
    n=Integer.parseInt(br.readLine());
    m=n;
    
    while(n!=0)
    {
      i=n%10;
      rev=(rev*10)+i;                 
      n/=10;
    }
    
    if(m==rev)
    System.out.println("\nNumber is palindrome");
    else
    System.out.println("\nNumber is not palindrome");
  }
}
