class Solution {
	public int romanToInt(String s) {
		int answer = 0;
		Map<Character, Integer> romanMap = new HashMap<>();

		romanMap.put('M', 1000);
		romanMap.put('D', 500);
		romanMap.put('C', 100);
		romanMap.put('L', 50);
		romanMap.put('X', 10);
		romanMap.put('V', 5);
		romanMap.put('I', 1);

		for (int i = 0; i < s.length(); i++) {
			int currentValue = romanMap.get(s.charAt(i));

			if (i + 1 < s.length() && currentValue < romanMap.get(s.charAt(i + 1))) {
				answer -= currentValue;
			} else {
				answer += currentValue;
			}

		}

		return answer;
	}
}
