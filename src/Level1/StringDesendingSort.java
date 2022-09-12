package Level1;

class StringDesendingSort {
	// 문자열을 내림차순으로 정렬하는 코드
	
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
            
            // max 보다 큰 숫자를 찾아서 temp에 넣음
            // codeArray[i]에 temp 값을 넣음
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
