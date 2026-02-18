
public class Pattern2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n = 3;
		for(int i = 1; i<=n; i++)
		{
			for(int j = 1; j<=n; j++)
			{
				if((i*j)<10) {
					System.out.print("0");
				}
				System.out.print(i*j +" ");
			}
			System.out.println();
		}

	}

}
