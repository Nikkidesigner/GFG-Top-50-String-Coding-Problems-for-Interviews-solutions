class ParkingLotProblem 
{
    public static void main(String[] args) 
    {
        int row = 3;
        int col = 3;
        int[] arr = {1, 0, 1, 1, 1, 0, 1, 1, 1};
        
        // Call the function to find the row with maximum parked cars
        FindRow(row, col, arr);
    }

    public static void FindRow(int row, int col, int[] arr)
    {
        // Create the matrix to represent the parking lot
        int[][] mat = new int[row][col];
        int k = 0, maxCount = -1, maxRow = -1;

        // Fill the matrix using the input array `arr`
        for(int i = 0; i < row; i++) 
        {
            int count = 0; // Reset count for each row
            for(int j = 0; j < col; j++) 
            {
                mat[i][j] = arr[k++];
                if(mat[i][j] == 1) 
                {
                    count++; // Count the number of parked cars (1s) in the row
                }
            }
            // After checking the entire row, update the maximum row if necessary
            if(count > maxCount) 
            {
                maxCount = count;
                maxRow = i;
            }
        }
        // Output the row with the maximum number of parked cars
        System.out.println("Row with maximum parked cars: " + maxRow);
    }
}
