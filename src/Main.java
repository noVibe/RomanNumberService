import enums.ArithmeticOperationForRoman;
import model.RomanExpression;
import model.SumRomanExpression;
import service.RomanOperation;
import service.RomeArabicConverter;

public class Main {
    public static void main(String[] args) {

        //Converting
        String convertToRoman = RomeArabicConverter.convert(22);
        Integer convertToInt = RomeArabicConverter.convert("MMX");

        //Evaluation
        String multiplication = RomanOperation.multiplyRomans("V", "II", "X");
        String sum = RomanOperation.sumRomans("V", "II");
        String division = RomanOperation.divideRomans("VII", "II", "I");
        String subtraction = RomanOperation.subtractRomans("V", "II", "XX", "XXX");

        String anyOperation = RomanOperation.evaluate(ArithmeticOperationForRoman.SUM, "C", "MCX");


        //Lazy evaluation
        RomanExpression sumExpression = new SumRomanExpression( "V", "X", "I");
        String sumExpressionResult = sumExpression.execute();

        RomanExpression anyOperationExpression = new RomanExpression(ArithmeticOperationForRoman.DIVIDE, "XX", "X");
        String anyOperationExpressionResult = anyOperationExpression.execute();
    }

}

