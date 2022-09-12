package Level1;

/*
 * �� ���� �Է¹޾� �ִ� ������� �ּ� ������� �޴� ��ȯ�ϴ� �Լ�
*/
import java.util.*;
import java.util.Scanner;

public class GCDandLCM {
	// ���� �����ؼ� Ǯ� ���� Ǯ��
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
        		if(num == min) {			// �����
        			max = num;
        		}
        	}
        }
        
        answer[0] = max;
        
        // �ּҰ���� ã��
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
	
	// ��Ŭ���� ȣ������ ����� �ִ����� ã�� ��
	// ��Ŭ���� ȣ������ ���� �˾ƺ��� ���� �����س� �˰���
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
	
	// �ִ� ������� �̿��� �ּ� ������� ã�� ��
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
		
		System.out.println("�ִ������� �ִ������� ���� �� ���� �Է��ϼ��� : ");
		num0 = scanner.nextInt();
		num1 = scanner.nextInt();
		
		gcdNum = test.gcd(num0, num1);
		lcmNum = test.lcm(num0, num1);
		
		System.out.println(num0 + "�� " + num1 + "�� �ִ� ����� : " + gcdNum);
		System.out.println(num0 + "�� " + num1 + "�� �ּ� ����� : " + lcmNum);
		
	}
}
