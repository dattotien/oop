//
// TetrisGrid encapsulates a tetris board and has
// a clearRows() capability.

public class TetrisGrid {
	private boolean[][] grid;
	private int x,y;
	/**
	 * Constructs a new instance with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
	public TetrisGrid(boolean[][] grid) {
		this.grid=grid;
		x=grid.length-1;
		y=grid[0].length-1;
	}
	
	
	/**
	 * Does row-clearing on the grid (see handout).
	 */
	public void clearRows() {
		for(int i=0;i<=y;i++){
			boolean check=true;
			for(int j=0;j<=x;j++){
				if(grid[j][i]==false){
					check=false;
					break;
				}
			}
			if(check==true){
				clear(i);
				i--;
			}
		}
	}
	public void clear(int loc){
		for(int i=loc;i<=y;i++){
			for(int j=0;j<=x;j++){
				if(i==y){
					grid[j][i]=false;
				}
				else {
					grid[j][i] = grid[j][i + 1];
				}
			}
		}
	}
	/**
	 * Returns the internal 2d grid array.
	 * @return 2d grid array
	 */
	boolean[][] getGrid() {
		return grid; // YOUR CODE HERE
	}
}
