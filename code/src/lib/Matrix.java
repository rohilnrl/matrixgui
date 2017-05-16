package lib;

public class Matrix {

	private int height;
	private int width;
	int[][] matrix;
	
	public Matrix() {	
		height = -1;
		width = -1;
	}
	
	public Matrix(int width, int height) {
		this.height = height;
		this.width = width;
		matrix = new int[height][width];
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getElement(int i, int j) {
		return matrix[i][j];
	}
	
	/**
	 * Accepts three parameters i, j as indexes and an integer value.
	 * Stores the integer in the specified position (i, j).
	 * 
	 * @param i
	 * @param j
	 * @param val
	 */
	public void setElement(int i, int j, int val) {
		matrix[i][j] = val;
	}
	
	/**
	 * O(n) function to check for matrix equality.
	 * 
	 * @param item
	 * @return
	 */
	public boolean equals(Matrix item) {
		if (height != item.getHeight() || width != item.getWidth()) {
			return false;
		}
		
		boolean flag = true;
		
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if (matrix[i][j] != item.getElement(i, j)) {
					flag = false;
					break;
				}
			}
		}
		
		return flag;
	}
}
