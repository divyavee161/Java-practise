// File: JavaOperators.java

public class operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        
        // 1. ARITHMETIC OPERATORS
        
        System.out.println("Arithmetic Operators ");
        System.out.println(a+b); // Addition
        System.out.println(a-b);// Subtraction
        System.out.println(a*b); // Multiplication
        System.out.println(a/b); // Division
        System.out.println(a%b); // Modulus (remainder)

        
        // 2. RELATIONAL OPERATORS
        
        System.out.println("relational operators");
        System.out.println(a>b); // Greater than
        System.out.println(a<b); // Less than
        System.out.println(a==b); // Equal to
        System.out.println(a!= b); // Not equal to

        
        // 3. LOGICAL OPERATORS
        
        System.out.println("Logical Operators");
        boolean x = true;
        boolean y = false;
        System.out.println(x&&y); // AND
        System.out.println(x||y); // OR
        System.out.println(!x); // NOT

        
        // 4. ASSIGNMENT OPERATORS
       
        System.out.println(" Assignment Operators ");
        int c = 10;
        c += 5; // c = c + 5
        System.out.println(+ c);
        c -= 3; // c = c - 3
        System.out.println(+ c);
        c *= 2; // c = c * 2
        System.out.println(+ c);

        
        // 5. UNARY OPERATORS
        
        System.out.println("Unary Operators");
        int d = 5;
        System.out.println("Original d = " + d);
        System.out.println("d++ (post-increment) = " + (d++)); // first use, then increase
        System.out.println("After d++ = " + d);
        System.out.println("++d (pre-increment) = " + (++d)); // first increase, then use

       
        // 6. TERNARY OPERATOR
       
        System.out.println("\n=== Ternary Operator ===");
        int max = (a > b) ? a : b; // condition ? true : false
        System.out.println("Maximum of a and b = " + max);
    }
}
