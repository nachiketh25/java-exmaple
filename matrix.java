
    
import java.util.*;


public class matrix {
    int[][] mat;
    int row, col;


    public void setmat() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        row = sc.nextInt();
        System.out.print("Enter number of columns: ");
        col = sc.nextInt();
        mat = new int[row][col];
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }


    public void readmat() {
        System.out.println("Matrix elements are:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }


    public void sortmat() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                for (int k = 0; k < col-1; k++) {
                    if (mat[i][k] > mat[i][k + 1]) {
                        int temp = mat[i][k];
                        mat[i][k] = mat[i][k + 1];
                        mat[i][k + 1] = temp;
                    }
                }
            }
        }
    }


    public void maxmat() {
        int max = mat[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (mat[i][j] > max) {
                    max = mat[i][j];
                }
            }
        }
        System.out.println("Maximum element of matrix is: " + max);
    }


    public void addmat(matrix m1, matrix m2) {
        System.out.println("addition is");
                        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                m1.mat[i][j] += m2.mat[i][j];
           System.out.println(m1.mat[i][j]+" "); }
        }
    }


    public void mulmat(matrix m1, matrix m2) {
        System.out.println("multiplication");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                m1.mat[i][j] *= m2.mat[i][j];
                System.out.print(m1.mat[i][j]+" ");}
        }
    }
 public static void main(String[] args)
 {
        matrix m1 = new matrix();
        matrix m2 = new matrix();
        m1.setmat();
        m1.readmat();
        m1.sortmat();
        m1.maxmat();
        m2.setmat();
        m2.readmat();
        m2.sortmat();
        m2.maxmat();
       m1.addmat(m1,m2);
       m1.mulmat(m1,m2);
    }
    }

