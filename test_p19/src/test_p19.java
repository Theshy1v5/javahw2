import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_p19 {

	public static void main(String[] args) throws NumberFormatException, IOException{
		// TODO Auto-generated method stub
		System.out.println("�аݧA�O�k�Ͷ�?");
		System.out.println("�п�JN��Y");
		
		BufferedReader br1=
				new BufferedReader(new InputStreamReader(System.in)); 
		String str =(br1.readLine());
		char letter=str.charAt(0);
		
		if(letter=='y'||letter=='Y')
		{
			System.out.println("�A�O�k�ͪ�!");
		}
		else if(letter=='n'||letter=='N')
		{
			System.out.println("�A�O�k�ͪ�!");
		}
		else 
		{
			System.out.println("�п�JN��Y");
		}

	}

}
