class Human{
    public void job(){
        System.out.println("Working Professional");}}
class Teacher extends Human{
    public void job(){                 
        System.out.println("Teacher");}}
class Doctor extends Human{
    public void job(){
        System.out.println("Doctor");}}
public class K91{
    public static void main(String[] args){
        Human amith=new Human();
        Teacher radha =new Teacher();
        Doctor vijay=new Doctor();
        Human priya = new Human();
        amith.job();
        radha.job();
        vijay.job();
        priya.job();}}