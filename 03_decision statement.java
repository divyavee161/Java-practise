/* decision statements..
1. if statement
2. if-else statement
3. else-if ladder
4. switch statement */
 

public class decision_statement {
    public static void main(String[] args) {
         int age = 24;
         int day = 2;

        
        // 1. IF STATEMENT(Executes only if condition is true)

        if (age >= 18) {
            System.out.println("IF: Adult");
        }

       
        // 2. IF-ELSE STATEMENT(Executes one block based on condition)
        
        if (age >= 18) {
            System.out.println("IF-ELSE: Adult");
        } else {
            System.out.println("IF-ELSE: Minor");
        }

        
        // 3. ELSE-IF LADDER(Checks multiple conditions)
        
        if (age <= 12) {
            System.out.println("ELSE-IF: Child");
        } else if (age <= 19) {
            System.out.println("ELSE-IF: Teen");
        } else {
            System.out.println("ELSE-IF: Adult");
        }

       
        // 4. SWITCH STATEMENT(Matches value with cases)
        
        switch (day) {
            case 1:
                System.out.println("SWITCH: Monday");
                break;

            case 2:
                System.out.println("SWITCH: Tuesday");
                break;

            case 3:
                System.out.println("SWITCH: Wednesday");
                break;

            default:
                System.out.println("SWITCH: Invalid Day");
        }
    }
}

