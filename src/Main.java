import model.RomanExpression;
import model.SumRomanExpression;
import service.Roman;

public class Main {
    public static void main(String[] args) {
        //Checking
        boolean isLegalRoman = Roman.isLegal("IIIV");

        //Converting
        String convertToRoman = Roman.convert(22);
        Integer convertToInt = Roman.convert("MMX");

        //Evaluation
        String multiplication = Roman.multiply("V", "II", "X");
        String sum = Roman.sum("V", "II");
        String division = Roman.divide("VII", "II", "I");
        String subtraction = Roman.subtract("V", "II", "XX", "XXX");

        //Lazy evaluation
        RomanExpression sumExpression = new SumRomanExpression( "V", "X", "I");
        String sumExpressionResult = sumExpression.execute();

    }

}

