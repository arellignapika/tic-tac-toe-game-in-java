
import java.util.*;

public class tictactoe{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix");
        int n = sc.nextInt();
        boolean anywinner = false;
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = -1;
            }
        }

        int value = -5;
        boolean winner = false;
        for (int i = 0; i < n * n; i++) {
            if (i % 2 == 0) {
                value = 0;
                winner = check(arr, value, 1);
                if (winner) {
                    System.out.println("Player 1 is the winner");
                    anywinner =true;
                    break;
                }
            } else {
                value = 1;
                winner = check(arr, value, 2);
                if (winner) {
                    System.out.println("Player 2 is the winner");
                     anywinner =true;
                    break;
                }
            }
        }
        if(anywinner==false){
            System.out.println("The match has been drawn");
        }

    }

    public static boolean check(int[][] arr, int value, int x) {
        Scanner sc = new Scanner(System.in);
        int n = arr.length;
        System.out.println("Player " + x + ", please enter the indices (i, j) where you want to insert your number:");
        int i = sc.nextInt();
        int j = sc.nextInt();

        if (arr[i][j] != -1) {
            System.out.println("Values already been used, please enter new indices.");
            return check(arr, value, x);
        } else {
            arr[i][j] = value;
        }

        if (i + j == n - 1) {
            if (checkDiagonal2(arr, i, j, n, value)) {
                return true;
            }
        } else if (i == j) {
            if (checkDiagonal1(arr, i, j, n, value)) {
                return true;
            }
        }

        if (checkRow(arr, i, j, n, value)) {
            return true;
        }

        if (checkColumn(arr, i, j, n, value)) {
            return true;
        }

        return false;
    }

    public static boolean checkRow(int[][] arr, int i, int j, int n, int value) {
        int count = 0;
        for (int k = 0; k < n; k++) {
            if (arr[k][j] != value) {
                break;
            } else {
                count++;
            }
        }
        return count == n;
    }
    public static boolean checkColumn(int[][] arr, int i, int j, int n, int value) {
        int count = 0;
        for (int k = 0; k < n; k++) {
            if (arr[i][k] != value) {
                break;
            } else {
                count++;
            }
        }
        return count == n;
    }

    public static boolean checkDiagonal1(int[][] arr, int i, int j, int n, int value) {
        int count = 0;
        for (int k = 0; k < n; k++) {
            if (arr[k][k] != value) {
                break;
            } else {
                count++;
            }
        }
        return count == n;
    }

    public static boolean checkDiagonal2(int[][] arr, int i, int j, int n, int value) {
        int count = 0;
        for (int k = 0; k < n; k++) {
            if (arr[k][n - k - 1] != value) {
                break;
            } else {
                count++;
            }
        }
        return count == n;
    }
}

    