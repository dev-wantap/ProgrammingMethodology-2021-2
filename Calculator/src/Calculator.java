import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Formula formula;
        Var arr[] = new Var[60];
        String input;
        Scanner sc = null;
        int index = 0;
        while (true) {
            input = sc.nextLine();
            formula = new Formula(input);
            if (formula.getOperator().equals("=")) {
                arr[index++] = new Var(formula.getNum1(), Double.parseDouble(formula.getNum2()));
            } else if (formula.getOperator().equals("+")) {
                double tmp1;
                double tmp2;
                for (int i=0; i<index; i++) {
                    formula.getNum1().
                }
            }

            System.out.print(arr[0]);
            int a = arr.length;
        }
    }
}
