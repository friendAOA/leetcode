package 数组;

class 螺旋矩阵2 {
    public int[][] generateMatrix(int n) {
        int startX=0,startY=0;//记录每一圈的起始点

        int i=0;
        int j=0;
        int[][] result=new int[n][n];
        int offset=1;
        int road=1;//记录圈数
        int num=1;//记录赋值
        while(road<=n/2){ 
            
            for(j=startX;j<n-offset;j++){
                result[startX][j]=num++;
            }
            for(i=startY;i<n-offset;i++){
               result[i][j]=num++;
            }
            for(;j>startX;j--){
               result[i][j]=num++;
            }
            for(;i>startY;i--){
               result[i][j]=num++;
            }
            startX++;
            startY++;
            road++;
            offset++;

        }
        if(n%2==1){
                result[startX][startY]=n*n;
        }
        return result;
    }
}