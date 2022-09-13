package Level1;

public class MaxBudget {
	public int solution(int[] d, int budget) {
        int answer = 0;
        int cost = 0;
        
        // ������ ���� �μ��� ���� ������ ���� �ִ��� ���� �μ� ���� ����
        sort(d);
        for(int i = 0; i < d.length; i++){
            cost += d[i];
            if(cost > budget)
                break;
            answer++;
        }
        
        return answer;
    }
    
    void sort(int a[]){
        // �������� ����
        int temp = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = i + 1; j < a.length ; j++){
                if(a[i] > a[j]){
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
    	MaxBudget bud = new MaxBudget();
    	int a[] = {1,3,2,5,4};
    	int answer = 0;
    	
    	answer = bud.solution(a, 9);
    	
    	System.out.println("answer = " + answer);
    	
    }
}
