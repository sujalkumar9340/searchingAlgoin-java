package problemsolving;
      
class Recursion{
	static int n1=0;
static	int n2=1;
  static int sum=n1+n2;
	
	public static void  printf(int n) {
		
		
		
	
		if(n==10) {
			return;}
		
		sum=n1+n2;
		System.out.println(sum);
		n1=n2;
		n2=sum;
		
		printf(n+1);
		
		
		
		}
		
		
	}
		
public class calpower  {
	
	public static void main (String args[]) {
//		int Arr[]= {1,2,3,4,5};
		int first_num=0;
		int secnd_num=1;
		System.out.println(first_num+""+secnd_num);
		Recursion sn=new Recursion();
		sn.printf(1);
		
		
		
	}
		
	}
