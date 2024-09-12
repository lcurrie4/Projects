/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a.star.search.lucas.currie;

import java.lang.Math;
import java.awt.Font;
import java.awt.Color;

/**
 *
 * @author lucas
 */
public class AStarSearchLucasCurrie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] path;
        path = new int[15][15];
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                path[i][j] = 0;
            }
        }
        for (int i = 0; i < 22; i++) {
            int rand1 = (int) (Math.random() * 14) + 1;
            int rand2 = (int) (Math.random() * 14) + 1;
            path[rand1][rand2] = 8;
        }
        int start1 = (int) (Math.random() * 14) + 1;
        int start2 = (int) (Math.random() * 14) + 1;
        path[start1][start2] = 1;
        int curr1 = start1;
        int curr2 = start2;
        int end1 = (int) (Math.random() * 14) + 1;
        int end2 = (int) (Math.random() * 14) + 1;
        path[end1][end2] = 2;
        for (int i = 0; i < 15; i++) {
            System.out.print("\n");
            for (int j = 0; j < 15; j++) {
                System.out.print(path[i][j]);
                System.out.print(" ");
            }
        }
        int diff1 = start1 - end1;
        int diff2 = start2 - end2;
        while (curr1 != end1) {
            //if(java.lang.Math.abs(diff1) > java.lang.Math.abs(diff2)){
            if (diff1 > 0) {
                if(path[curr1-1][curr2] != 8){
                down1(path, curr1, curr2);
                curr1--;
                diff1--;
                } else{
                            while(curr2 != end2){
            if(diff2 > 0){
                    if(path[curr1][curr2-1] != 8){
                left1(path, curr1, curr2);
                curr2--;
                diff2--;
                    }
            } else if (diff2 < 0) {
                if(path[curr1][curr2+1] != 8){
                right1(path, curr1, curr2);
                curr2++;
                diff2++;
                }
            }
        }
                }
            } else if (diff1 < 0) {
                if(path[curr1+1][curr2] != 8){
                up1(path, curr1, curr2);
                curr1++;
                diff1++;
                } else{
                            while(curr2 != end2){
            if(diff2 > 0){
                    if(path[curr1][curr2-1] != 8){
                left1(path, curr1, curr2);
                curr2--;
                diff2--;
                    } else{
                        
                    }
            } else if (diff2 < 0) {
                if(path[curr1][curr2+1] != 8){
                right1(path, curr1, curr2);
                curr2++;
                diff2++;
                } else{
                           while (curr1 != end1) {
            //if(java.lang.Math.abs(diff1) > java.lang.Math.abs(diff2)){
            if (diff1 > 0) {
                if(path[curr1-1][curr2] != 8){
                down1(path, curr1, curr2);
                curr1--;
                diff1--;
                } 
            } else if (diff1 < 0) {
                if(path[curr1+1][curr2] != 8){
                up1(path, curr1, curr2);
                curr1++;
                diff1++;
                }
            } 
        }
                }
            }
        }
                }
            } 
        }
        while(curr2 != end2){
            if(diff2 > 0){
                    if(path[curr1][curr2-1] != 8){
                left1(path, curr1, curr2);
                curr2--;
                diff2--;
                    }
            } else if (diff2 < 0) {
                if(path[curr1][curr2+1] != 8){
                right1(path, curr1, curr2);
                curr2++;
                diff2++;
                } else{
                           while (curr1 != end1) {
            //if(java.lang.Math.abs(diff1) > java.lang.Math.abs(diff2)){
            if (diff1 > 0) {
                if(path[curr1-1][curr2] != 8){
                down1(path, curr1, curr2);
                curr1--;
                diff1--;
                } 
            } else if (diff1 < 0) {
                if(path[curr1+1][curr2] != 8){
                up1(path, curr1, curr2);
                curr1++;
                diff1++;
                }
            } 
        }
                }
            }
        }
        path[end1][end2] = 2;
        path[start1][start2] = 3;
            System.out.print("\n\n");
            System.out.println("Final Product:");
            
            printPath(path);
            System.out.println("\n 1 = path, 2 = end, 3 = start \n 8 = blocked paths");
        
        //    }

    }

    public static void up1(int grid[][], int x, int y) {
        grid[x][y] = grid[x + 1][y] = 1;
        //grid[x][y] = 0;
    }

    public static void down1(int grid[][], int x, int y) {
        grid[x][y] = grid[x - 1][y] = 1;
        //grid[x][y] = 0;
    }

    public static void right1(int grid[][], int x, int y) {
        grid[x][y] = grid[x][y + 1] = 1;
       // grid[x][y] = 0;
    }

    public static void left1(int grid[][], int x, int y) {
        grid[x][y] = grid[x][y - 1] = 1;
        //grid[x][y] = 0;
    }
    public static void printPath(int path[][]){
                for (int i = 0; i < 15; i++) {
                System.out.print("\n");
                for (int j = 0; j < 15; j++) {
                    System.out.print(path[i][j]);
                    System.out.print(" ");
                }
            }
    }
}
