/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javareview.review;

/**
 *
 * @author bonsk5852
 */
public class Maze {

    public void printMaze(char[][] maze) {
        // Go through the row
        for (int i = 0; i < maze.length; i++) {
            // Go through columns
            for (int j = 0; j < maze[i].length; j++) {
                // Printing the current location
                System.out.print(maze[i][j]);
            }
            System.out.println("");
        }
    }

    public boolean solveMaze(char[][] maze, int row, int col) {
        // Am i off the map?
        if (row < 0 || col < 0 || row >= maze.length || col >= maze[0].length) {
            return false;
        }
        // Did I find the end
        if (maze[row][col] == 'e') {
            printMaze(maze);
            return true;
        }
        // Is this a bad spot?
        if (maze[row][col] == '+'
                || maze[row][col] == 'w') {
            return false;
        }
        // I'm on a valid location!
        // mark i've been here
        maze[row][col] = '+';
        // Check north
        boolean check = solveMaze(maze, row - 1, col);
        // did it work? Are we at the end>
        if (check) {
            return true;
        }

        // check east
        check = solveMaze(maze, row, col + 1);
        if (check) {
            return true;
        }

        // check south
        check = solveMaze(maze, row + 1, col);
        if (check) {
            return true;
        }
        // check west
        check = solveMaze(maze, row, col - 1);
        if (check) {
            return true;
        }

        // This spot no good?
        // unmoving
        maze[row][col] = '.';
        return false;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a 2d char array
        //char[][] maze = new char[10][10];
        char[][] maze = {
            {'w', 'w', 'w', '.', '.', '.'},
            {'s', '.', 'w', '.', 'w', '.'},
            {'w', '.', 'w', '.', 'w', '.'},
            {'w', '.', '.', '.', '.', '.'},
            {'w', 'w', 'w', 'e', 'w', 'w'}
        };
        // Test the method
        Maze test = new Maze();
        test.printMaze(maze);
        System.out.println("");
        System.out.println("");
        test.solveMaze(maze, 1, 0);
    }
}
