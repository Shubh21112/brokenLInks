package automaticlogin;

public class araay {
	
  int a = 1232;
  
	public static void main(String[] args) {
		
	
int a []= {1,2,3,2};

int b ;
int lastindex = (a.length-1);   
System.out.println("length of array =" +a.length);

System.out.println("number to test");

for (int i= 0; i <= lastindex; i ++)
{
	System.out.print(+a[i]);
}
System.out.println();

System.out.println("reverse array");
System.out.println("result");

for (int i = 0; i <=lastindex/2; i++)
{
	b = a[i];
	a[i]  = a[(lastindex-i)];
	a[(lastindex-i)] = b;
}
for (int i= 0; i <= lastindex; i ++)
{System.out.print(+a[i]);

}
System.out.println();

int[] k = new int [a.length];
//k = a; 

if(a == k)
{System.out.println("number is palindrome");

}
else 
{System.out.println("number is not paloindrome");

}
	}
	}
	
	
