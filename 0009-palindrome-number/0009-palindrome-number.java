class Solution {
    public boolean isPalindrome(int x) {
        
        String str = String.valueOf(x);
        
		char[] arr = str.toCharArray();
		char[] arr2 = new char[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			char temp = arr[i];
			arr2[i] = arr[arr.length-i-1];
		}
		
		String str2 = String.valueOf(arr2);

        if(str.equals(str2)) return true;
        else return false;
    }
}