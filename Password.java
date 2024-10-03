import java.util.Random;
public class Password{
public static void main(String[] args){
  String uppercase="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  String lowercase="abcdefghijklmnopqrstuvwxyz";
  String digits="0123456789";
  String allCharacters=uppercase+lowercase+digits;
String s1="";
Random rand=new Random();
for(int i=0;i<6;i++){
int r1=rand.nextInt(allCharacters.length());
s1=s1+allCharacters.charAt(r1);
}
System.out.println("Generated password : "+s1);}}
