package lambda;

public class ThreadUse {
    public static void main(String[] args) {
       /* //First Thread
        Runnable thread=()->{
            //this is the body of thread
            for(int i=0;i<=10;i++){
                System.out.println ("Value Of I is: "+i );
                try {
                    Thread.sleep (1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException (e);
                }
            }
        };
        Thread thread1=new Thread (  thread);
        //thread1.setName ("ABhishek");
        thread1.start ();
    }*/
    Runnable table=()->{
        System.out.println ("Table of number" );
        for (int i=1;i<=10;i++){
            System.out.println ("Table "+i*2 );
            try {
                Thread.sleep (1000);
            }catch (Exception e){
                e.printStackTrace (  );
            }

        }
    };
    Thread thread=new Thread ( table );
    thread.start ();
    }
}
