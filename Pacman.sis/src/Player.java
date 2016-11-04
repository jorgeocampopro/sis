/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emanuel
 */
public class Player {

    private int x;
    private int y;
    private Object[][] board;

    enum Direction {

        UP,
        DOWN,
        LEFT,
        RIGHT
    };

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(Direction direction) {
        switch (direction) {
            case UP:
                if (validatePosition(x, y + 1) && !thereIsBlock(x, y + 1)) {
                    setPosition(x, y + 1);
                }
                break;
            case DOWN:
                if (validatePosition(x, y - 1) && !thereIsBlock(x, y - 1)) {
                    setPosition(x, y - 1);
                }
                break;
            case LEFT:
                if (validatePosition(x - 1, y) && !thereIsBlock(x - 1, y)) {
                    setPosition(x - 1, y);
                }
                break;
            case RIGHT:
                if (validatePosition(x + 1, y) && !thereIsBlock(x + 1, y)) {
                    setPosition(x + 1, y);
                }
                break;
            default:
                break;
        }
    }

    public void setBoard(Object[][] board) {
        this.board = board;
    }

    private void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private boolean validatePosition(int x, int y) {
        return x < board.length && y < board.length;
    }

    private boolean thereIsBlock(int x, int y) {
        if (board[x][y] instanceof Block) {
            return true;
        }
        return false;
    }
}
