import model.RomanExpression;
import model.SumRomanExpression;
import service.Roman;

public class Main {
    public static void main(String[] args) {
        //Checking
        boolean isLegalRoman = Roman.isValid("IIIV");

        //Converting
        String convertToRoman = Roman.convert(22);
        Integer convertToInt = Roman.convert("MMMX");

        //Evaluation
        String multiplication = Roman.multiply("V", "II", "C");
        String sum = Roman.sum("V", "II");
        String division = Roman.divide("VII", "II", "I");
        String subtraction = Roman.subtract("CV", "II", "XX", "XXX");

        //Lazy evaluation
        RomanExpression sumExpression = new SumRomanExpression( "V", "X", "I");
        String sumExpressionResult = sumExpression.getResult();
    }
}

