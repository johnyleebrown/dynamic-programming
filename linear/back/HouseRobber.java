package dp.linear.back;

/**
 * 198
 */
public class HouseRobber {
	class Solution {
		public int rob(int[] a) {
			int n = a.length;
			if (n == 0) {
				return 0;
			}
			int[] dp = new int[n + 1];
			dp[1] = a[0];
			for (int i = 2; i <= n; i++) {
				dp[i] = Math.max(dp[i - 1], dp[i - 2] + a[i - 1]);
			}
			return dp[n];
		}
	}
}
