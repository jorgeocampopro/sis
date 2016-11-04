/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emanuel
 */
public class ManagerBoard {

    private Board board;
    private int[][] map;

    public ManagerBoard() {
        board = new Board(9);
        map = new int[9][9];
    }

    private void initBoard() {

    }

    private void fillBoard() {

    }

    private int[][] createMap() {
        int[][] map1 = new int[][]{{7, 14, 8, 3, 7, 14, 8, 3, 1},
        {7, 14, 8, 3, 7, 14, 8, 3, 1}, {3, 13, 4, 1, 7, 14, 8, 3, 1},
        {7, 14, 8, 3, 7, 14, 8, 3, 1}, {6, 19, 7, 27, 1, 4, 8, 3, 1},
        {3, 13, 4, 1, 7, 14, 8, 3, 1}, {7, 14, 8, 3, 7, 14, 8, 3, 1},
        {6, 19, 7, 27, 1, 4, 8, 3, 1}, {3, 13, 4, 1, 7, 14, 8, 3, 1}};
        return map1;
    }

}
