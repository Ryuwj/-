package Level1;

import java.lang.*;

public class StrangeString {
	public String solution(String s) {
        String string[] = s.split("\\s",-1);
        StringBuilder strBul = new StringBuilder();
        char charArr[];
        
        for(int i = 0; i < string.length; i++) {
        	charArr = toSwapCase(string[i]);
        	strBul.append(charArr);
        	if((i + 1) != string.length)
        		strBul.append(' ');
        }
               
        return strBul.toString();
    }
	
	char[] toSwapCase(String str) {
		// Â¦¼ö´Â ´ë¹®ÀÚ, È¦¼ö ¹øÂ° ÀÎµ¦½º´Â ¼Ò¹®ÀÚ·Î º¯È¯
		char charArr[] = new char[str.length()];
		String upStr = str.toUpperCase();
		String lowerStr = str.toLowerCase();
		
		for(int i = 0; i < charArr.length; i++) {
			if(i % 2 == 0) {
				// Â¦¼ö
				charArr[i] = upStr.charAt(i);
			}
			else {
				// È¦¼ö
				charArr[i] = lowerStr.charAt(i);
			}
		}
		return charArr;
	}
	
}
