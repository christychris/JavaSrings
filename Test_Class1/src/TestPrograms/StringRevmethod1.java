package TestPrograms;

public class StringRevmethod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="Valan",rev="";
		for(int i=input.length()-1;i>=0;i--)
		{
			rev=rev+input.charAt(i);
			
		}
		
		System.out.println(rev);

	}

}
