package pattern;

public class diamond 
{

	public static  void main(String[] args)
	{
		int space = 3;
		int star = 1;
		for(int i = 1;i<=4;i++)
		{
			char ch = 'A';
			for(int j=1;j<=space;j++)
			{
				System.out.println(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.println(ch);
				ch++;
			}
			space--;
			star=star+2;
			System.out.println();
		}

	}

}
