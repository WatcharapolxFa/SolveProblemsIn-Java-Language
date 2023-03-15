import java.util.Scanner;

public class MarbleGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;
        while (playAgain) {
            System.out.println("Welcome to the Marble Game!");
            int n = 0;
            while (n < 2) {
                System.out.print("Please enter the number of white and black marbles (n must be at least 2): ");
                n = scanner.nextInt();
            }
            int boardSize = 2 * n + 1;
            String[] board = new String[boardSize];
            for (int i = 0; i < boardSize; i++) {
                if (i < n) {
                    board[i] = "w" + i;
                } else if (i == n) {
                    board[i] = "O";
                } else {
                    board[i] = "b" + (i - n - 1);
                }
            }
            boolean autoMode = false;
            while (true) {
                System.out.print("Enter a marble ID to move or type 'auto' to switch to auto mode: ");
                String marbleID = scanner.next();
                if (marbleID.equals("auto")) {
                    autoMode = true;
                    break;
                }
                int currentIndex = -1;
                for (int i = 0; i < boardSize; i++) {
                    if (board[i].equals(marbleID)) {
                        currentIndex = i;
                        break;
                    }
                }
                if (currentIndex == -1) {
                    System.out.println("Invalid marble ID. Please try again.");
                } else if (!isMovable(board, currentIndex)) {
                    System.out.println("This marble is not movable. Please choose another marble.");
                } else {
                    int newIndex = getNewIndex(board, currentIndex);
                    board[newIndex] = board[currentIndex];
                    board[currentIndex] = " ";
                    System.out.println("Moved " + marbleID + " to position " + newIndex + ".");
                    printBoard(board);
                }
            }
            if (autoMode) {
                int[] solution = findSolution(board);
                if (solution == null) {
                    System.out.println("No solution found. Starting a new game.");
                } else {
                    System.out.println("Solution found:");
                    for (int i = 0; i < solution.length - 1; i++) {
                        int currentIndex = solution[i];
                        int newIndex = solution[i + 1];
                        String marbleID = board[currentIndex];
                        board[newIndex] = marbleID;
                        board[currentIndex] = " ";
                        System.out.println("Moved " + marbleID + " to position " + newIndex + ".");
                        printBoard(board);
                    }
                    System.out.println("Congratulations! You have solved the puzzle.");
                }
            }
            System.out.print("Do you want to play again? (y/n) ");
            String answer = scanner.next();
            if (!answer.equalsIgnoreCase("y")) {
                playAgain = false;
            }
        }
        System.out.println("Thank you for playing!");
    }

    public static boolean isMovable(String[] board, int currentIndex) {
        String currentMarble = board[currentIndex];
        if (currentMarble.equals(" ")) {
            return false;
        }
        if (currentMarble.startsWith("w")) {
            return isMovableLeft(board, currentIndex) || isMovableRight(board, currentIndex);
        } else {
            return isMovableLeft(board, currentIndex) && isMovableRight(board, currentIndex);
        }
    }

    public static boolean isMovableLeft(String[] board, int currentIndex) {
        String currentMarble = board[currentIndex];
        if (currentIndex < 2) {
            return false;
        }
        String leftMarble = board[currentIndex - 1];
        String leftEmpty = board[currentIndex - 2];
        return leftMarble.startsWith("w") && leftEmpty.equals(" ") && currentMarble.startsWith("w") ||
                leftMarble.startsWith("b") && currentMarble.startsWith("b") && board[currentIndex - 2].equals("O");
    }
    
    public static boolean isMovableRight(String[] board, int currentIndex) {
        String currentMarble = board[currentIndex];
        if (currentIndex > board.length - 3) {
            return false;
        }
        String rightMarble = board[currentIndex + 1];
        String rightEmpty = board[currentIndex + 2];
        return rightMarble.startsWith("b") && rightEmpty.equals(" ") && currentMarble.startsWith("b") ||
                rightMarble.startsWith("w") && currentMarble.startsWith("w") && board[currentIndex + 2].equals("O");
    }
    
    public static int getNewIndex(String[] board, int currentIndex) {
        String currentMarble = board[currentIndex];
        if (currentMarble.startsWith("w")) {
            if (isMovableRight(board, currentIndex)) {
                return currentIndex + 2;
            } else {
                return currentIndex - 2;
            }
        } else {
            if (isMovableRight(board, currentIndex)) {
                return currentIndex + 1;
            } else {
                return currentIndex - 1;
            }
        }
    }
    
    public static int[] findSolution(String[] board) {
        for (int i = 0; i < board.length; i++) {
            if (isMovable(board, i)) {
                String[] copyBoard = board.clone();
                int newIndex = getNewIndex(copyBoard, i);
                copyBoard[newIndex] = copyBoard[i];
                copyBoard[i] = " ";
                if (isSolved(copyBoard)) {
                    return new int[]{i, newIndex};
                }
                int[] subSolution = findSolution(copyBoard);
                if (subSolution != null) {
                    int[] solution = new int[subSolution.length + 1];
                    solution[0] = i;
                    for (int j = 0; j < subSolution.length; j++) {
                        solution[j + 1] = subSolution[j];
                    }
                    return solution;
                }
            }
        }
        return null;
    }
    
    public static boolean isSolved(String[] board) {
        int n = (board.length - 1) / 2;
        boolean whiteWin = true;
        boolean blackWin = true;
        for (int i = 0; i < n; i++) {
            if (!board[i].equals("b" + i)) {
                blackWin = false;
            }
            if (!board[2 * n - i].equals("w" + i)) {
                whiteWin = false;
            }
        }
        return whiteWin || blackWin;
    }
    
    public static void printBoard(String[] board) {
        System.out.println("---------------");
        for (String marble : board) {
            System.out.print("| " + marble + " ");
        }
        System.out.println("|\n---------------");
    }
}