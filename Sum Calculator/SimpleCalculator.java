public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return this.firstNumber;
    }

    public double getSecondNumber() {
        return this.secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }

    public double getDivisionResult() {
        if (secondNumber == 0)
            return 0;
        else
            return firstNumber / secondNumber;
    }

    public static void main(String[] args) {
        SimpleCalculator s = new SimpleCalculator();
        s.setFirstNumber(5.0);
        s.setSecondNumber(4);
        System.out.println("add= " + s.getAdditionResult());
        System.out.println("subtract= " + s.getSubtractionResult());
        s.setFirstNumber(5.25);
        s.setSecondNumber(0);
        System.out.println("multiply= " + s.getMultiplicationResult());
        System.out.println("divide= " + s.getDivisionResult());

    }
}
