public class ques4 {
    public static void main(String[] args) {
        int[][] grid= {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int x= grid.length;
        int y= grid[0].length;
        for(int i=0;i<x;i++)
        { int sumx=0;
            for(int j=0;j<y;j++)
            {
                sumx+= grid[i][j];
            }
            System.out.println("Sum of row "+(i+1)+" is: "+sumx);
        }
        for(int i=0;i<y;i++)
        { int sumy=0;
            for(int j=0;j<x;j++)
            {
                sumy+= grid[j][i];
            }
            System.out.println("Sum of column "+(i+1)+" is: "+sumy);
        }
    }
}


