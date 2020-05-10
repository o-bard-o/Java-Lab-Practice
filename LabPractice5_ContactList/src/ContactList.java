import java.util.*;

public class ContactList {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		cList l = new cList();
		while(true) {
			String query[]=sc.nextLine().split(" ");
			boolean isError = false;
			if(query[0].contentEquals("show"))
				l.show();
			if(query[0].contentEquals("add"))
				isError = l.add(query[1], query[2]);
			if(query[0].contentEquals("delete"))
				isError = l.delete(query[1]);
			if(query[0].contentEquals("find"))
				isError = l.find(query[1]);
			if(isError) {
				System.out.println("error");
			}
			if(query[0].contentEquals("quit"))	break;
		}
		sc.close();
	}
}
class cList{
	HashMap<String,String> map = new HashMap<>();
	void show() {
		for(String key : map.keySet())
			System.out.printf("%s : %s\n",key,map.get(key));
	}
	boolean find(String name) {
		if(map.get(name) == null)	return true;
		
		System.out.println(map.get(name));
		return false;
	}
	boolean add(String name, String phone) {
		if(map.get(name) != null)	return true;

		map.put(name, phone);
		return false;
	}
	boolean delete(String name) {
		if(map.get(name) == null)	return true;
		
		map.remove(name);
		return false;
	}
}