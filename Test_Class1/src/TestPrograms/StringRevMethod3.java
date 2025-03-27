package TestPrograms;

public class StringRevMethod3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String rev="Christina";
		char[] a=rev.toCharArray();
		
		for(int i=a.length-1;i>=0;i--)

		{
			System.out.print(a[i]);
		}
	}

}
