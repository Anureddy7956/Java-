//rotate an array to 90 degree -> transpose ->reverse every row = 90 degree array
class Solution {
    public void rotateMatrix(int[][] matrix) {
       int n= matrix.length;
    
    // transpose of a matrix
       for(int i=0; i<n ;i++){
        for(int j=i+1; j<n; j++){
    
            int temp = matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=temp;

            }
       } 
    // reverse every row
    for(int i=0 ; i<n; i++){
        
        int left=0;
        int right=n-1;

        while(left<right){
            int temp=matrix[i][left];
            matrix[i][left]=matrix[i][right];
            matrix[i][right]=temp;
            
            left++;
            right--;
            }
        }
    
    }

}
