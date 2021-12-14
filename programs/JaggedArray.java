class JaggedArray
{
    public static void main(String[] args)
    {
        // Declaring 2D array with 2 rows
        int arr[][] = new int[2][];
 
        // Making the above array Jagged, first row has 3 columns
        arr[0] = new int[3];
 
        // Second row has 2 columns
        arr[1] = new int[2];
 
        // Initializing array
        int count = 0;
        for (int i=0; i<arr.length; i++)
            for(int j=0; j<arr[i].length; j++)
                arr[i][j] = count++;
 
        // Displaying the values
        System.out.println("Elements of 2D jagged array");
        for (int i=0; i<arr.length; i++)
        {
            for (int j=0; j<arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}
