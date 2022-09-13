package Level1;

public class MaxBudget {
	public int solution(int[] d, int budget) {
        int answer = 0;
        int cost = 0;
        
        // 예산이 적은 부서를 먼저 지원할 수록 최대한 많은 부서 지원 가능
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
        // 내림차순 정렬
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
