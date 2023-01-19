class Solution {
    public int romanToInt(String s) {
        
        char[] arr = s.toCharArray();
		int answer = 0;
		char temp = '0';
		
		for(int i=0; i<arr.length; i++) {
			switch(arr[i]) {
			
				case 'I': 
					answer += 1;
					temp='I';
					break;
					
				case 'V':
					if(temp == 'I') answer += 3;
					else answer += 5;
					temp = 'V';
					break;
					
				case 'X':
					if(temp == 'I') answer += 8;
					else answer += 10;
					temp = 'X';
					break;
					
				case 'L':
					if(temp == 'X') answer += 30;
					else answer += 50;
					temp = 'L';
					break;
					
				case 'C':
					if(temp == 'X') answer += 80;
					else answer += 100;
					temp = 'C';
					break;
					
				case 'D':
					if(temp == 'C') answer += 300;
					else answer += 500;
					break;
					
				case 'M':
					if(temp == 'C') answer += 800;
					else answer += 1000;
					break;
			}
		}
		
        return answer;
    }
}