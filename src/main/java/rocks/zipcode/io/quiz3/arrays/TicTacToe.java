package rocks.zipcode.io.quiz3.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        return board[value];
    }

    public String[] getColumn(Integer value) {
        String[] columns = new String[board.length];
        for (int row = 0; row < board.length; row++) {
            columns[row] = board[row][value];
        }
        return columns;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        String[] row = getRow(rowIndex);
        String base = row[0];
        for (int i = 0; i < row.length; i++) {
            if (row[i] != base) {
                return false;
            }
        } return true;
    }

        public Boolean isColumnHomogeneous (Integer columnIndex){
            String[] column = getColumn(columnIndex);
            String base = column[0];
            for (int i = 0; i < column.length; i++) {
                if ((column[i] != base)) {
                    return false;
                }
            } return true;
        }

        public String getWinner () {
            for (int i = 0; i < board.length ; i++) {
                if(isRowHomogenous(i)) {
                    return getRow(i)[i];
                }
                if(isColumnHomogeneous(i)) {
                    return getColumn(i)[i];
                }
            } return "X";
        }

        public String[][] getBoard () {
            return this.board;
        }

    }

