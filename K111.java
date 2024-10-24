class MultiThreadThree extends Thread{
public void run(){
 for(int i=0;i<5;i++){
System.out.println(i);
try{
Thread.sleep(1000);}
catch(InterruptedException e){
}}}}
public class K111{
public static void main(String[] args){
MultiThreadThree mt1=new MultiThreadThree();
mt1.start();
}}