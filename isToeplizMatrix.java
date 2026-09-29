class Solution {
    public boolean isToeplitzMatrix(int[][] a) {
        for(int i=1;i<a.length;i++){
            for(int j=1;j<a[i].length;j++){
                if(a[i][j]!=a[i-1][j-1]){
                    return false;
                }
            }
        }
        return true;
        
    }
}
