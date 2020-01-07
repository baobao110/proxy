package com.spring.context.run;

/**
 * @Auther chenhao
 * @Date 2019/12/2
 */
public class PrintThread{

    private static final Object object=new Object();

    private int count;

    private int i=0;

    public PrintThread(int count) {
        this.count = count;
    }


    public void run(){
        System.out.println("++++++++++++++++");

       while (i<100){
            try{
                if(i%count==0){
                    System.out.println("=================a====================");
                    new ThreadA().start();
                }
                if(i%count==1){
                    System.out.println("=================b====================");
                    new ThreadB().start();
                }
                if(i%count==2){
                    System.out.println("=================c====================");
                    new ThreadC().start();
                }
            }catch (Exception e){
                e.printStackTrace();
            }

        }
    }

    class ThreadA extends Thread{

        @Override
        public void run(){
            synchronized (object){
                System.out.println("Thread-A:"+i);
                i++;
            }

        }
    }

    class ThreadB extends Thread{

        @Override
        public void run(){
            synchronized (object){
                System.out.println("Thread-B:"+i);
                i++;
            }

        }
    }

    class ThreadC extends Thread{

        @Override
        public void run(){
            synchronized (object){
                System.out.println("Thread-C:"+i);
                i++;
            }
        }
    }


}
