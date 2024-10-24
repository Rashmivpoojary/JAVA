class MultiThreadFour extends Thread{
int threadNumber;
MultiThreadFour(int tNo){
this.threadNumber=tNo;}
public void run(){
 for(int i=1;i<6;i++){
System.out.println("Task"+i+" by ThreadNumber "+threadNumber);
try{
Thread.sleep(1000);}
catch(InterruptedException e){
}}}}
public class K112{
public static void main(String[] args){
for(int i=1;i<8;i++){
MultiThreadFour mt1=new MultiThreadFour(i);
mt1.start();
}}}