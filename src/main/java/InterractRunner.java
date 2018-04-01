import java.util.Scanner;

public class InterractRunner {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        try{
            Calculator calc = new Calculator();
            String exit="no";
            while(!exit.equals("yes")){
                System.out.println("Enter first arg");
                String first = reader.next();
                System.out.println("Enter second arg");
                String second = reader.next();

                System.out.println("Enter operation type:");
                System.out.println("1: add");
                System.out.println("2: minus");
                System.out.println("3: multiply");
                System.out.println("4: div");
                System.out.println("5: power");
                System.out.println("6: clearResult");

                String operationType = reader.next();
                switch (operationType){
                    case "1":
                        System.out.println("add to previous result? yes/no");
                        String previousResult = reader.next();
                        if(previousResult.equals("no")){
                            calc.clearResult();
                        }
                        calc.add(Integer.valueOf(first), Integer.valueOf(second));
                        break;
                    case "2":
                        calc.minus(Integer.valueOf(first), Integer.valueOf(second));
                        break;
                    case "3":
                        calc.mult(Integer.valueOf(first), Integer.valueOf(second));
                        break;
                    case "4":
                        calc.div(Integer.valueOf(first), Integer.valueOf(second));
                        break;
                    case "5":
                        calc.power(Integer.valueOf(first), Integer.valueOf(second));
                        break;
                    case "6":
                        calc.clearResult();
                        break;
                }


                System.out.println("Result: "+calc.getResult());
                System.out.println("exit: yes/no");
                exit=reader.next();
            }
        }finally {
            reader.close();
        }
    }
}
