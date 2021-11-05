import java.util.Arrays;

public class Formula {
    private String num1;
    private String num2;
    private String operator;
    private String[] formula_s;
    private String formula;

    public Formula(String form) {
        formula = form;
        formula_s = split_oper(formula);
        num1 = formula_s[0];
        num2 = formula_s[2];
        operator = formula_s[1];
    }

    public String getNum1() {
        return num1;
    }

    public String getNum2() {
        return num2;
    }

    public String getOperator() {
        return operator;
    }

    private String[] split_oper(String form) {
        String result[];
        String operators[] = {"=", "\\+", "-", "\\*", "/", "%"};
        for (int i = 0; i<operators.length; i++) {
            if (Arrays.asList(form).contains(operators[i])) {
                result = form.split(operators[i]);
                for (int j=0; j<result.length; j++) {
                    result[j].trim();
                }
                return result;
            }
        }
        return null;
    }
}

