package Level1;

public class StringBasic {
	
	// ���ڿ� s �� ���̰� 6 Ȥ�� 4 ���� �ϰ�, s �� ���� �϶� true�� �����ϴ� �Լ�
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
