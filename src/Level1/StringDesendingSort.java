package Level1;

class StringDesendingSort {
	// ���ڿ��� ������������ �����ϴ� �ڵ�
	
	public String solution(String s) {
        String answer = "";
        int temp, max = 0;
        char charArray[] = s.toCharArray();
        int codeArray[] = new int[charArray.length];
        
        for(int i= 0; i < codeArray.length; i++){
            codeArray[i] = (int) charArray[i];
        }
        
        for(int i = 0; i < codeArray.length; i++){
            max = codeArray[i];
            
            // max ���� ū ���ڸ� ã�Ƽ� temp�� ����
            // codeArray[i]�� temp ���� ����
            for(int j = i+1; j < codeArray.length; j++){
                if(max >= codeArray[j]){
                    continue;
                }
                else{
                    temp = max;
                    max = codeArray[j];
                    codeArray[j] = temp;
                }
            }
            codeArray[i] = max;
            answer += (char) codeArray[i]; 
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		StringDesendingSort sort = new StringDesendingSort();
		
		String str = "Zbcdefg";
		str = sort.solution(str);
		System.out.println(str);
	}
}
