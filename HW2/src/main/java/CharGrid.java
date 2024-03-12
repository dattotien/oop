// HW1 2-d array Problems
// CharGrid encapsulates a 2-d grid of chars and supports
// a few operations on the grid.

public class CharGrid {
	private char[][] grid;

	/**
	 * Constructs a new CharGrid with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
	public CharGrid(char[][] grid) {
		this.grid = grid;
	}
	
	/**
	 * Returns the area for the given char in the grid. (see handout).
	 * @param ch char to look for
	 * @return area for given char
	 */
	public int charArea(char ch) {
		int a = grid.length;
		int b = grid[0].length;
		int maxx = 0;
		int maxy = 0;
		int minx = Integer.MAX_VALUE;
		int miny = Integer.MAX_VALUE;
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				if (grid[i][j] == ch) {
					maxx = Integer.max(i, maxx);
					maxy = Integer.max(j, maxy);
					minx = Integer.min(i, minx);
					miny = Integer.min(j, miny);
				}
			}
		}
		return (maxy - miny + 1) * (maxx - minx + 1);
	}
	
	/**
	 * Returns the count of '+' figures in the grid (see handout).
	 * @return number of + in grid
	 */
	public int countPlus() {
		int n = grid.length;
		int m = grid[0].length;
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				int cnt1 = 0;
				int k = j + 1;
				while (k < m && grid[i][j] == grid[i][k]) {
					cnt1++;
					k++;
				}
				k = j - 1;
				int cnt2 = 0;
				while (k >= 0 && grid[i][j] == grid[i][k]) {
					cnt2++;
					k--;
				}
				k = i + 1;
				int cnt3 = 0;
				while (k < n && grid[i][j] == grid[k][j]) {
					cnt3++;
					k++;
				}
				k = i - 1;
				int cnt4 = 0;
				while (k >= 0 && grid[i][j] == grid[k][j]) {
					cnt4++;
					k--;
				}
				if (cnt1 == cnt2 && cnt2 == cnt3 && cnt3 == cnt4 && cnt1 > 0) {
					cnt++;
				}
			}
		}
		return cnt; // YOUR CODE HERE
	}
	
}
