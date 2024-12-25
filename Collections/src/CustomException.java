class CustomExceptionExp{
    int divideZero(int a,int b){
        return a/b;
    }
}
public class CustomException extends CustomExceptionExp{
    int divideZero(int a, int b) throws ArithmeticException{
        return a/b;
    }
    int devideTwoNumbers(int a,int b) throws ArithmeticException{
        int c= a/b;
        System.out.println(c);
        // this.divideZero(c, 0);
        super.divideZero(c, 0);
        divideZero(c, 0);
        return c;
    }
    public static void main(String[] args) {
        /*
         * Static Context: The main method is static, meaning it can be called without
         * creating an instance of the class.
         * 
         * Instance Context: The this keyword is used in instance methods or
         * constructors to refer to the object calling the method.
         * 
         * If you try to use this in the main method, you will get a compile-time error
         * since there is no instance associated with a static context.
         * If you need to access instance variables or methods, you would first need to
         * create an instance of the class within the main method.
         */
        // CustomException customException = new CustomException();
        // System.out.println("Program Started");
        // customException.devideTwoNumbers(50, 2);
        // System.out.println("Program Ended");
        try{
            CustomException customException = new CustomException();
            System.out.println("Program Started");
            customException.devideTwoNumbers(50, 2);
        }catch(Exception e){
            e.printStackTrace(); //This print the Exception propagation 
        }finally{
            System.out.println("Program Ended");
        }
    }
}

