import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_p32 {

	public static void main(String[] args) throws NumberFormatException, IOException{
		// TODO Auto-generated method stub
		System.out.println("�аݭn�b�ĴX���B�z���������j��?(1-10)");
	
		
		BufferedReader br1=
				new BufferedReader(new InputStreamReader(System.in)); 
		String str =(br1.readLine());
		int res=Integer.parseInt(str);
		
		for(int i=1;i<=10;i++) {
			System.out.println("��"+i+"�����B�z�C");
			if(i==res)
				break;
		}

	}

}
