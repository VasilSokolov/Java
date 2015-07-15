package regex;

import java.util.regex.*;

public class Regex {

	public static void main(String[] args) {
		String text = "Hello my mother is from Sofia,"
				+ " my number is  +359 943 12 32"
				+ "but the Monics phone number is +49 (89) 958-98762.";
//		String phoneRegex = "\\+\\d{1,3}([ -]*([0-9]+))+"; no scobi
		String phoneRegex = "\\+\\d{1,3}([() -]*[0-9]+)+";
		Pattern phonePattern = Pattern.compile(phoneRegex);
		Matcher matcher = phonePattern.matcher(text);
		while (matcher.find()) {
			System.out.println(matcher.group());			
		}
	}

}
