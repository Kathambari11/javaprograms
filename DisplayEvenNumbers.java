import java.util.Scanner;  
public class DisplayEvenNumbers 
{  
public static void main(String[] args)   
{  
int number, i;  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the limit: ");  
number = sc.nextInt();    
i=2;   
System.out.print("List of even numbers: ");   
while(i<=number)  
{  
System.out.print(i +" ");     
i=i+2;  
}     
}  
}  