package rotate;

public class Rotate {

	public static boolean rotate(String a,String b){
		return a.length()==b.length() && (a+a).contains(b);	
	}

}
