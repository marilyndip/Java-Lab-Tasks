/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

/**
 *
 * @author user
 */
public class Stack {
    private int[] stck;
    private int tos;
    
    public Stack(int size){
        stck = new int[size];
        tos = -1;
    }
    public void push(int item){
        if(tos == stck.length - 1){
            System.out.println("Stack is full");
        }
        else{
            stck[++tos] = item;
        }
    }
    public int pop(){
        return stck[tos--];
    }
}
