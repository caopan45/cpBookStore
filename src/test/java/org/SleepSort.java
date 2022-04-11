package org;

public class SleepSort {
    public static void main(String[] args) {
        //存在问题，如果数据相差不大的情况存在错误的情况
        int [] arr = new int[]{99,45,423,3,21,6,7,8,9,10,11,12,13,14,15,16,17,18,19,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,};
        for(int i = 0 ; i < arr.length; i++){
            final int finalI = arr[i];
            new Thread(){
                @Override
                public void run() {
                    try {
                        Thread.sleep(finalI);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+":\t"+finalI);
                }
            }.start();
        }
    }
}
