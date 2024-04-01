class Solution {
    public int lengthOfLastWord(String s) {
    	s = s.trim();
        int answer = s.length() - s.lastIndexOf(" ") - 1;
        return answer;
    }
}
