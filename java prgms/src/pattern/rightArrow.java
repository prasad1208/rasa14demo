package pattern;

public class rightArrow 
{
	public static void main(String[] args)
	{
	for(int i = 1;i<=4;i++)
	{
		char a = 'A';
		for(int j=1;j<=i;j++)
		{
			System.out.println(a);
			a++;
		}
		System.out.println();
	}
		for(int i=4;i>=1;i--)
		{
			char a='A';
			for(int j=1;j<=i;j++)
			{
				System.out.println(a);
				a++;
		}
		System.out.println();
	}

}

}
