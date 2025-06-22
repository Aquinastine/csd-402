
//This program builds a Pascal's power Triangle
public class PascalPowerTriangleAligned {
	public static void main(String[] args) {
		//Set the number of rows
		int rows = 7;

		// First, determine the maximum width of the longest line (excluding @)
		StringBuilder maxLineBuilder = new StringBuilder();

		// build the first half of the last row with the middle number
		for (int j = 0; j < rows; j++) {
			maxLineBuilder.append((int)Math.pow(2, j)).append(" ");
		}

		//build the second half of the last row
		for (int j = rows - 2; j >= 0; j--) {
			maxLineBuilder.append((int)Math.pow(2, j)).append(" ");
		}

		//Save the length of the last row
		int maxLineLength = maxLineBuilder.length();

		//Build each of the other rows
		for (int i = 0; i < rows; i++) {
			StringBuilder lineBuilder = new StringBuilder();

			// Leading spaces
			for (int s = 0; s < (rows - i - 1) * 2; s++) {
				lineBuilder.append(" ");
			}

			// Left half (ascending powers of 2)
			for (int j = 0; j <= i; j++) {
				lineBuilder.append((int)Math.pow(2, j)).append(" ");
			}

			// Right half (descending powers of 2)
			for (int j = i - 1; j >= 0; j--) {
				lineBuilder.append((int)Math.pow(2, j)).append(" ");
			}

			// Pad with spaces so all lines are the same width
			while (lineBuilder.length() < maxLineLength) {
				lineBuilder.append(" ");
			}

			// Add @ symbol
			lineBuilder.append("@");

			// Print the line
			System.out.println(lineBuilder.toString());
		}
	}
}