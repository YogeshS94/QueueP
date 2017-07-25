/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package queue;

/**
 *
 * @author Yogesh
 */
public class QueueD {

    private static int size=3;
    int a [] = new int[size];
    int top = -1;
    int rear = 0;
    
    public void push (int pushelement){
        if(top<size-1){
            top++;
            a[top]=pushelement;
            System.out.println(pushelement + " pushed into queue");
            display();
                       
        }
        else
        {
            System.out.println("stack is overflow");
        }
    }
    
    public void pop(){
        if(top>=rear){
            rear++;
            System.out.println("pop is done");
            display();
            
        }
        else{
            System.out.println("nothing in the queue");
        }
    }
    
    public void display(){
        if(top>=rear){
            System.out.println("element in queue");
            for(int i=rear;i<=top;i++){
            System.out.println(a[i]);
        }
        }
    }
    public static void main(String[] args) {
      QueueD q = new QueueD();
        q.push(23);
        q.push(55);
        q.push(22);
        q.push(11);
        q.pop();
        q.pop();
        q.pop();
        q.pop();
        
        
    }
    
}
