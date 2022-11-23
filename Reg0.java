import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg0 {

	public static void main(String[] args) {
		//the pattern we want to match
		Pattern pattern = Pattern.compile("[0-3]+");
			//the string we want the pattern to match against
		Matcher matcher = pattern.matcher("12345");
		 
		if(matcher.matches())
		    System.out.println("Matched");        
		else
		    System.out.println("Not matched");
	}

}
