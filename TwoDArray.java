import java.util.Scanner;

class TwoDArray{
    public static void main(String args[])
    {
        int d[][]= new int[1][1];

        int k[][]= new int[5][3];

        Scanner scr = new Scanner(System.in);
        int c[][]= new int[3][2];

        for(int i=0; i<3; i++)
        {
            for(int j=0; j<2; j++)
            {
                System.out.println("Enter number");
                c[i][j] = scr.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println("");
        }
    }

}