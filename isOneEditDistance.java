//loop: TC: O(n), SC: O(1)
public boolean isOneEditDistance(String s, String t) {
	int sl = s.length(), tl = t.length();
	if (sl > tl) return isOneEditDistance(t, s); //先確保t一定比s長或相等
	if (tl - sl > 1) return false; //就保證不是只差一個digit
	
	int i = 0; span = tl - sl; //span = 0 or 1
	while (i < tl && s.charAt(i) == t.charAt(i)) i++;
	// s = "abc"	"abc"	"abbbe"	 "abc"
	// t = "abc"	"abcd" 	"abcde"  "abdc"			
	if (i == tl) return span > 0; //上面二true
	if (span == 0) i++;
	while (i < tl && s.charAt(i) == t.charAt(i + span)) i++;
	return i == tl;
} 