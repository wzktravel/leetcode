package solution;

/**
 * 每个节点是一个对象，里面有它的状态
 * Created by wzk on 15/4/22.
 */
public class NumberOfIslands {

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length <= 0) {
            return 0;
        }
        if (grid.length == 1 && grid[0].length == 1) {
            if (grid[0][0] == '1') {
                return 1;
            } else {
                return 0;
            }
        }

        int numOfIslands = 0;

        Node[][] nodes = new Node[grid.length][grid[0].length];



        return numOfIslands;
    }

    public class Node {
        boolean status;
        char value;
        int from;
        int to;
    }

}
