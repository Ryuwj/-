package Level1;

public class StringBasic {
	
	// 문자열 s 의 길이가 6 혹은 4 여야 하고, s 가 숫자 일때 true를 리턴하는 함수
	public boolean solution(String s) {
        boolean answer = true;

        try{
            Integer num = new Integer(s);
            if(s.length() == 4 || s.length() == 6)
                answer = true;
            else
                answer = false;
        }
        catch(Exception e){
            answer = false;
        }

        return answer;
    }
}
