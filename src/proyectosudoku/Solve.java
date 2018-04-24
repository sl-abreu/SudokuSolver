/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectosudoku;



/**
 *
 * @author eschu
 */
public class Solve {
    
    
    public static void main(String[] args) {
        Solver s;
        
/*
        Integer[][] board ={
            { 8, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 3, 6, 0, 0, 0, 0, 0 },
            { 0, 7, 0, 0, 9, 0, 2, 0, 0 },
            { 0, 5, 0, 0, 0, 7, 0, 0, 0 },
            { 0, 0, 0, 0, 4, 5, 7, 0, 0 },
            { 0, 0, 0, 1, 0, 0, 0, 3, 0 },
            { 0, 0, 1, 0, 0, 0, 0, 6, 8 },
            { 0, 0, 8, 5, 0, 0, 0, 1, 0 },
            { 0, 9, 0, 0, 0, 0, 4, 0, 0 }
        };
    
/*
        Integer[][] solution={
            {8, 1, 2, 7, 5, 3, 6, 4, 9},
            {9, 4, 3, 6, 8, 2, 1, 7, 5},
            {6, 7, 5, 4, 9, 1, 2, 8, 3},
            {1, 5, 4, 2, 3, 7, 8, 9, 6},
            {3 ,6 ,9 ,8, 4, 5, 7, 2, 1},
            {2 ,8 ,7 ,1 ,6 ,9 ,5, 3, 4},
            {5 ,2 ,1 ,9 ,7 ,4 ,3 ,6 ,8},
            {4 ,3 ,8 ,5 ,2 ,6 ,9 ,1 ,7},
            {7 ,9 ,6 ,3 ,1 ,8 ,4 ,5 ,2}
        };
    */
/*
        Integer [][]board ={
            {null,2,4,null},
            {1,null,null,3},
            {4,null,null,2},
            {null,1,3,null} 
        };
    */

Integer[][] board ={
{ 5, null, 4, 3, null, 6, null, 7, null },
{ null, null, 1, null, null, null, null, null, null },
{ null, 7, 6, null, null, 2, 9, null, null },
{ null, 8, null, 7, null, 5, 6, null, 1 },
{ 7, 6, null, null, 3, null, null, 8, 9 },
{ 9, null, 3, 8, null, 4, null, 2, null },
{ null, null, 8, 1, null, null, 2, 9, null },
{ null, null, null, null, null, null, 3, null, null },
{ null, 3, null, 4, null, 7, 1, null, 6 }
};

        s=new Solver(board);
        System.out.println(s.toString());
        System.out.println("\n");
        System.out.println(s.solve());
        System.out.println("\n");
        System.out.println(s.toString());
    } 
}
