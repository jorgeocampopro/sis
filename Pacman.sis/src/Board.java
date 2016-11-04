/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emanuel
 */
public class Board {

    private Object[][] board;

    public Board(int size) {
        board = new Object[size][size];
    }

    public int getSize() {
        return board.length;
    }

    public Object[][] getBoard() {
        return board;
    }
}
