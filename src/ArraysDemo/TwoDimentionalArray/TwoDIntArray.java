package ArraysDemo.TwoDimentionalArray;

public class TwoDIntArray {

    public static void main(String[] args) {

        int[][] a = new int[4][3];

        a[0][0]=11;
        a[0][1]=22;
        a[0][2]=33;

        a[1][0]=13;
        a[1][1]=23;
        a[1][2]=34;

        a[2][0]=23;
        a[2][1]=33;
        a[2][2]=44;

        a[3][0]=93;
        a[3][1]=83;
        a[3][2]=74;

        int row = a.length;
        int col = a[0].length;

        for (int i=0;i<a.length;i++)
        {
            for (int j = 0 ; j<a[0].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }



    }
}
