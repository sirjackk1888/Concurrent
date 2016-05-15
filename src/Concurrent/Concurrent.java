/* This program demonstrates a method to create concurrent threads
/of the same method
*/
package Concurrent;

class Atomic extends Thread {
    @Override
    public void run()  {
        
        for (int i = 0; i<10; i++) {
            System.out.println("Boom # " + (i+1));
                    //cycles through the iterations, displaying the 
                    //string and count
            
            try {
                Thread.sleep(100);
            }catch (InterruptedException e) {
                //e.printStackTrace();
            }       //catches an interuption exception thrown by overriding the 
                    //run object
        }
    }
}

public class Concurrent {

    public static void main(String[] args) {
        Atomic atomic1 = new Atomic();
        atomic1.start();        //starts a new thread of the atomic object
        
        Atomic atomic2 = new Atomic();
        atomic2.start();        //starts a new thread of the atomic object
    }
    
}

