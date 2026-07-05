package DFS;
public class UniquePaths980 {
    static void main(String[] args) {
        int[][] grid = {{1,0,0,0},{0,0,0,0},{0,0,2,-1}};
        Solution s = new Solution();
        System.out.println(s.uniquePathsIII(grid));
    }
}
class Solution {
    public int uniquePathsIII(int[][] grid) {
        int x = -1;
        int y = -1;
        int unchecked = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]!=-1){
                    unchecked++;
                }
                if(grid[i][j]==1){
                    x=i;
                    y=j;
                }
            }
        }
        return dfs(x,y,grid,unchecked);
    }

    public int dfs(int x,int y,int[][] grid,int unchecked) {
        if (x < 0 || y < 0 || x >= grid.length || y >= grid[0].length) {
            return 0;
        }
        if (grid[x][y] == -1) {
            return 0;
        }
        if (grid[x][y] == 2) {
            if (unchecked == 1) {
                return 1;
            }
            return 0;
        }
        int paths = 0;
        int current = grid[x][y];
        grid[x][y] = -1;
        paths += dfs(x + 1, y, grid, unchecked - 1);
        paths += dfs(x, y + 1, grid, unchecked - 1);
        paths += dfs(x - 1, y, grid, unchecked - 1);
        paths += dfs(x, y - 1, grid, unchecked - 1);
        grid[x][y] = current;

        return paths;
    }
}