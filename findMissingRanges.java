//loop: TC: O(n), SC: O(1)
//[0, 99] => [(0 + 1) -> (99 - 1)](X)
//Edge Case, 0或99要包含
import java.util.List;
public List<String> findMissingRanges(int[] values, int start, int end) {
	//動態增加內容: ArrayList
	List<String> ranges = new ArrayList<>();
	int pre = start - 1; // [0, 99] -> pre = -1
	for (int i = 0; i <= values.length; i++) {
		int cur = values[i];
		if (i == values.length) cur = end + 1; //[0, 99] -> cur = 100
		if (cur - pre >= 2) { //[1,5] -> ["2->4"]
			int from = pre + 1;
			int to = cur - 1;
			String miss = from + "->" + to;
			if (from == to) miss = String.valueOf(from); //[1,3] -> [2]
			ranges.add(miss);
		}
		pre = cur; //因為cur會是loop下一次執行時的pre
	}
	return ranges;
}