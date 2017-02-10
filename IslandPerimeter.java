/*
 * 463. Island Perimeter
 * You are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water. Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells). The island doesn't have "lakes" (water inside that isn't connected to the water around the island). One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.
 */

public class Solution {
    public int islandPerimeter(int[][] grid) {
        //int length = grid.size();
        int i=0,j=0,count=0;
        for(i=0; i<grid.length;i++){
            for(j=0;j<grid[0].length;j++){
                if(grid[i][j]>0){
                    //water above
                    if(i-1<0 || grid[i-1][j]==0)
                        count++;
                    //water below
                    if(i+1>=grid.length || grid[i+1][j]==0)
                        count++;
                    //water to the left
                    if(j-1<0 || grid[i][j-1]==0)
                        count++;
                    //water to the right
                    if(j+1>=grid[0].length || grid[i][j+1]==0)
                        count++;
                }
            }
        }
        return count;
    }
}