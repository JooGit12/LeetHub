import java.util.Stack;

class Solution {
    public String makeGood(String s) {
        
    	Stack<Character> goodString = new Stack<>();
    	
    	for (char c : s.toCharArray()) {
			if (!goodString.isEmpty() && Math.abs(goodString.peek() - c) == 32) {
				goodString.pop();
			} else {
				goodString.push(c);
			}
		}
    	
    	StringBuilder builder = new StringBuilder();
    	
    	for (Character character : goodString) {
			builder.append(character);
		}
    	
    	return builder.toString();
    }
}
