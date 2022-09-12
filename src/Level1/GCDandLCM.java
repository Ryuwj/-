package Level1;

/*
 * 두 수를 입력받아 최대 공약수와 최소 공약수를 받는 반환하는 함수
*/
import java.util.*;
import java.util.Scanner;

public class GCDandLCM {
	// 내가 생각해서 풀어낸 문제 풀이
	public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int max = 1;
        int min = 0;
        int num = 0;
        
        Vector<Integer> measursN = new Vector<Integer>();
        Vector<Integer> measursM = new Vector<Integer>();
        
        for(int i = 2; i <= n; i++){
            if(n % i == 0)
                measursN.add(i);
        }
        
        for(int i = 2; i <= m; i++){
            if(m % i == 0)
                measursM.add(i);
        }
        
        Iterator itN = measursN.iterator();
        
        while(itN.hasNext()) {
        	num = (int) itN.next();
        	min = 0;
        	Iterator itM = measursM.iterator();
        	while(itM.hasNext()) {
        		min = (int) itM.next();
        		if(num == min) {			// 공약수
        			max = num;
        		}
        	}
        }
        
        answer[0] = max;
        
        // 최소공배수 찾기
        max = n * m;
        
        if(n < m)
        	min = n;
        else
        	min = m;
        num = min;
        
        for(int i = max-1; i >= min; i--) {
        	if((i % m == 0) && (i % n == 0))
        		num = i;
        }

        answer[1] = num;
        
        return answer;
    }
	
	// 유클리드 호제법을 사용한 최대공약수 찾는 법
	// 유클리드 호제법에 대해 알아보고 내가 생각해낸 알고리즘
	int gcd(int a, int b) {
		// a = b*q + r
		int r = a % b;
		
		if(r != 0) {
			return gcd(b,r);
		}
		else {
			return b;
		}
	}
	
	// 최대 공약수를 이용해 최소 공배수를 찾는 법
	int lcm(int a, int b) {
		return (a*b)/gcd(a,b);
	}
	
	public static void main(String[] args) {
		GCDandLCM test = new GCDandLCM();
		int num0 = 0;
		int num1 = 0;
		int gcdNum = 0;
		int lcmNum = 0;
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("최대공약수와 최대공배수를 구할 두 수를 입력하세요 : ");
		num0 = scanner.nextInt();
		num1 = scanner.nextInt();
		
		gcdNum = test.gcd(num0, num1);
		lcmNum = test.lcm(num0, num1);
		
		System.out.println(num0 + "와 " + num1 + "의 최대 공약수 : " + gcdNum);
		System.out.println(num0 + "와 " + num1 + "의 최소 공배수 : " + lcmNum);
		
	}
}
