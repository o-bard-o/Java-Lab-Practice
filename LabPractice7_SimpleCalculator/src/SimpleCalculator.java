import java.util.*;

public class SimpleCalculator {
	public class OutOfRangeException extends Exception{
		OutOfRangeException(){};
		OutOfRangeException(String message){super(message);}
	}
	public class AddZeroException extends Exception{
		AddZeroException(){};
		AddZeroException(String message){super(message);}		
	}
	public class SubstractZeroException extends Exception{
		SubstractZeroException(){};
		SubstractZeroException(String message){super(message);}		
	}
	int result;
	void add(int a,int b)throws OutOfRangeException,AddZeroException {
		result=a+b;
		if(a==0||b==0) {
			throw new AddZeroException("AddZeroException");
		}
		if(result<0 || result>1000 || a<0 || a>1000 || b<0 || b>1000) {
			throw new OutOfRangeException("OutOfRangeException");
		}
		System.out.println(result);
	}
	void subtract(int a,int b) throws OutOfRangeException, SubstractZeroException{
		result=a-b;
		if(a==0||b==0) {
			throw new SubstractZeroException("SubtractZeroException");
		}
		if(result<0 || result>1000 || a<0 || a>1000 || b<0 || b>1000) {
			throw new OutOfRangeException("OutOfRangeException");
		}
		System.out.println(result);
	}
	public static void main(String args[] ) {
		SimpleCalculator A=new SimpleCalculator();
		try {
			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();
			String q[] = s.split("\\+");
			if(q.length==2)
				A.add(Integer.parseInt(q[0]), Integer.parseInt(q[1]));
			String r[] = s.split("\\-");
			if(r.length==2)
				A.subtract(Integer.parseInt(r[0]), Integer.parseInt(r[1]));
			sc.close();
		}catch(AddZeroException e1) {
			System.err.println(e1.getMessage());
		}catch(OutOfRangeException e2) {
			System.err.println(e2.getMessage());
		}catch(SubstractZeroException e3) {
			System.err.println(e3.getMessage());
		}
	}
	
}
