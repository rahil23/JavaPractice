import java.awt.List;
import java.util.ArrayList;

public class findCount {
	public static void main(String[] args) {
		int count =0;
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(3);
		
		for (int i = 0; i < list.size(); i++) 
		{
			
			if(list.get(0)==list.get(i))
			{
				count++;
			}
		}
		System.out.println(count);
			
		
	

}
	}