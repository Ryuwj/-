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
		// ¦���� �빮��, Ȧ�� ��° �ε����� �ҹ��ڷ� ��ȯ
		char charArr[] = new char[str.length()];
		String upStr = str.toUpperCase();
		String lowerStr = str.toLowerCase();
		
		for(int i = 0; i < charArr.length; i++) {
			if(i % 2 == 0) {
				// ¦��
				charArr[i] = upStr.charAt(i);
			}
			else {
				// Ȧ��
				charArr[i] = lowerStr.charAt(i);
			}
		}
		return charArr;
	}
	
}
