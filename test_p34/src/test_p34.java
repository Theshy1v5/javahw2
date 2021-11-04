import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_p34 {

	public static void main(String[] args) throws NumberFormatException, IOException{
		// TODO Auto-generated method stub
		System.out.println("要跳過第幾次處理?(1-10)");
	
		
		BufferedReader br1=
				new BufferedReader(new InputStreamReader(System.in)); 
		
		String str =(br1.readLine());
		int res=Integer.parseInt(str);
		
		for(int i=1;i<=10;i++) {
			if(res==i)
			continue;
			System.out.println("第"+i+"次的處理。");
		}

	}

}
