/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLib;

/**
 *
 * @author adriel
 */
public class TaskArray {
    public Task[] tasks = new Task[100];
    public int count = 0;    

    public void addTask(Task t) {
        tasks[count] = t;
        count++;
    }    
}
