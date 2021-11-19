package Java.Lab.lab9;

import java.util.Scanner;

public class MatrixSubtraction{
    private static final Scanner input = new Scanner(System.in);
    public static void readInput(int [][]mat,int row,int col){
        System.out.println("Enter the elements in the matrix :");
        for(int i = 0 ; i < row ; i ++){
            for(int j = 0 ; j < col ; j++){
                mat[i][j] = input.nextInt();
            }
        }
    }
    public static void add(int [][]res,int [][]mat1,int [][]mat2,int row,int col){
        for(int i = 0 ; i < col ; i++){
            res[row][i] = mat1[row][i] - mat2[row][i];
        }
        System.out.println("The " + row + " row's sub is calculated using " + Thread.currentThread().getName());
    }
    public static void printArray(int [][]res,int row,int col){
        System.out.println("The matrix after subtraction :");
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col; j ++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int row,col;
        System.out.print("Enter the number of rows :");
        row = input.nextInt();
        System.out.print("Enter the number of cols :");
        col = input.nextInt();
        int [][]mat1 = new int[row][col];
        int [][]mat2 = new int[row][col];
        int [][]res = new int[row][col];
        Thread [] threads = new Thread[row];
        readInput(mat1,row,col);
        readInput(mat2,row,col);
        for(int i = 0 ; i < row ; i++){
            int finalI = i;
            threads[i] = new Thread(() -> {
                add(res,mat1,mat2,finalI,col);
            });
            threads[i].setName("Thread " + i);
            threads[i].start();
        }
        for(int i = 0 ; i < row ; i++){
            try{
                threads[i].join();
            }
            catch(InterruptedException exception){
                exception.printStackTrace();
            }
        }
        printArray(res,row,col);
    }
}
