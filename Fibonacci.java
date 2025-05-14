package Exp4;

import java.util.Scanner; 
public class Fibonacci { 
public static void main(String[] args) { 
Scanner sc = new Scanner(System.in); 
System.out.print("Enter number of terms: "); 
int n = sc.nextInt(); 
int firstTerm = 0, secondTerm = 1; 
System.out.print("Fibonacci Series till " + n + " terms: "); 
for (int i = 1; i <= n; ++i) { 
System.out.print(firstTerm + (i < n ? ", " : "\n")); 
int nextTerm = firstTerm + secondTerm; 

 firstTerm = secondTerm; 
secondTerm = nextTerm; 
} 
sc.close(); 
} 
} 

