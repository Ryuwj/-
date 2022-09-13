package Level1;

import java.util.Iterator;
import java.util.Vector;

public class TernaryReverse {
	Vector<Integer> reminders = new Vector<Integer>();
    
	public int solution(int n) {
        int answer = 0;
        
        gcd(n, 3);      // 3진법으로 변환함
        
        // 원래대로라면 reminders를 거꾸로 뒤집어야 하지만,
        // 앞뒤로 뒤집어야 하므로, reminders를 그대로 써도 됨.
        Iterator it = reminders.iterator();
        int num = reminders.size() - 1;
        while(it.hasNext()){
            answer += ((int)it.next()) * Math.pow(3,num);
            num--;
        }
        
        return answer;
    }
    
    void gcd(int share, int base){
        // 진법을 변환하는 함수
        // 몫, 진법.
        if(share == 0){
            return;
        }
        else{
            reminders.add(share % base);
            System.out.println("share : " + share);
            gcd(share/base, base);
        }
    }
    
    public static void main(String[] args) {
    	TernaryReverse te = new TernaryReverse();
    	int answer = te.solution(45);
    	
    	System.out.println("answer = " + answer);
    }
}
