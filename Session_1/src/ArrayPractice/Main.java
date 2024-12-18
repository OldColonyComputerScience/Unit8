package ArrayPractice;

public class Main
{
    public static void main(String[] args)
    {
        int[][] array = {{ 3, 5, 7, 8, 0 },
                         { 500, 250, 125, 784, 267, 674, 0 },
                         { 9, 8, 0 }};

        // Call the updateValue method three times on this array:



        print(array);
    }


    //Do not make alterations to this method!
    public static void print(int[][] array)
    {
        for(int[] row: array)
        {
            for(int num: row)
            {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
