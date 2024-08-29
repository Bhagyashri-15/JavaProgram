package ArraysProgram;

public class SortArray {
	
	public static void main(String[] args) {
		
		int [] a = {15,5,22,81,7};
		
		int temp;
		
		for(int i = 0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
			if(a[i]>a[j])
			{
				temp = a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			}
			System.out.print(a[i]+" ");
		}
	}

}
