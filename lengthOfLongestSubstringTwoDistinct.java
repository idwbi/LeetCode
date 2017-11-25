//Sliding Window, 調整type的數字, 就可以應付最多有幾種字元: while (type > K)
public int lengthOfLongestSubstringTwoDistinct(String s) {
	int[] record = new int[256]; //ASCII code
	int L = 0, type = 0, maxLen = 0;
	for (int R = 0; R < s.length(); R++) {
		if (record[s.charAt(R)] == 0) type++; //Sliding Window右邊碰到新東西會加一
		record[s.charAt(R)]++; //也記錄出現字元
		while (type > 2) { //當出現兩種以上字元
			record[s.charAt(L)]--;
			if (record[s.charAt(L)] == 0) type--;
			L++;
		}
		maxLen = Math.max(maxLen, R - L + 1);
	}
	return maxLen;
}