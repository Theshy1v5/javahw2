import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_p21 {

	public static void main(String[] args) throws NumberFormatException, IOException{
		// TODO Auto-generated method stub
		System.out.println("�аݭn��������u?");
		System.out.println("�п�J���");
		
		BufferedReader br1=
				new BufferedReader(new InputStreamReader(System.in)); 
		String str =(br1.readLine());
		int res=Integer.parseInt(str);
		
		char ans=(res==1)?'A':'B';
		
		System.out.println("��ܤF"+ans+"���u");
	}

}
