import java.util.Scanner;
public class Simplecalci{
 public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter first number:");
        
int n1 = scanner.nextInt();

System.out.println("Enter second number:");
        
int n2 = scanner.nextInt();
        
        
System.out.println("Choose an operation:");
        
System.out.println("1 - Addition");
        
System.out.println("2 - Subtraction");
       
System.out.println("3 - Multiplication");
        
System.out.println("4 - Division");
        
System.out.println("5 - Quotient");
        
System.out.println("6 - Remainder");
        
System.out.println("7 - Exponential");

        
int choice = scanner.nextInt();
       
double result = 0;

        
switch (choice) {
            
case 1:
result = n1 + n2;
                
               
 break;
            
case 2:
result = n1 - n2;
                
                
break;
            
case 3:
result = n1 * n2;
                               
 break;
            
case 4:
if (n2 != 0) {
                    
result = n1 / n2;
                                   
} else {
                    
System.out.println("Error: Division by zero");
}
                
break;
           
case 5:
if (n2 != 0) {
                    
result =  n1 /  n2;
                   
} 
else {
                    
System.out.println("Error: Division by zero");
}
break;
           
case 6:
if (n2 != 0) {
                    
result =  n1 %  n2;
                   
}
 else {
System.out.println("Error: Division by zero");
                
}
               
break;
            
case 7:
result = Math.pow(n1, n2);
                                
break;
          
default:
System.out.println("Invalid choice. Please select a valid operation.");
                
break;
}


System.out.println("Result:"+result);        
scanner.close();
 
}
}