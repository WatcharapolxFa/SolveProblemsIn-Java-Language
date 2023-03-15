public class BoardReverse {

    public static void main(String[] args) {
        int n = 3; // example value, you can change it to any other odd number
        char[] board = createBoard(n);
        System.out.println("Original board: " + new String(board));
        reverseBoard(board);
        System.out.println("Reversed board: " + new String(board));
    }

    public static char[] createBoard(int n) {
        char[] board = new char[2 * n + 1];
        int mid = n;
        for (int i = 0; i < board.length; i++) {
            if (i == mid) {
                board[i] = ' ';
            } else if (i < mid) {
                board[i] = 'b';
            } else {
                board[i] = 'w';
            }
        }
        return board;
    }

    public static void reverseBoard(char[] board) {
        int n = (board.length - 1) / 2; // calculate n from the size of the board
        int whitePos = n + 1;
        int blackPos = n - 1;
        while (whitePos < board.length) {
            if (board[whitePos] == 'w') {
                if (whitePos + 1 < board.length && board[whitePos + 1] == ' ') {
                    swap(board, whitePos, whitePos + 1);
                    whitePos += 2;
                } else if (whitePos + 2 < board.length && board[whitePos + 2] == 'b') {
                    swap(board, whitePos, whitePos + 2);
                    whitePos += 3;
                } else {
                    // cannot move white marble
                    break;
                }
            } else {
                whitePos++;
            }
        }
        while (blackPos >= 0) {
            if (board[blackPos] == 'b') {
                if (blackPos - 1 >= 0 && board[blackPos - 1] == ' ') {
                    swap(board, blackPos, blackPos - 1);
                    blackPos -= 2;
                } else if (blackPos - 2 >= 0 && board[blackPos - 2] == 'w') {
                    swap(board, blackPos, blackPos - 2);
                    blackPos -= 3;
                } else {
                    // cannot move black marble
                    break;
                }
            } else {
                blackPos--;
            }
        }
    }

    public static void swap(char[] board, int i, int j) {
        char temp = board[i];
        board[i] = board[j];
        board[j] = temp;
    }

}