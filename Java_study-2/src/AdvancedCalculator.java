class AdvancedCalculator extends Calculator {

    @Override
    public int multiply() {
        if (num1 == 0 || num2 == 0) {
            result = 0;
            return result;
        }
        result = num1 * num2;
        return result;
    }

    @Override
    public int divide() {
        if (num2 == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
            result = Integer.MAX_VALUE;
            return result;
        }
        if (num1 == 0) {
            result = 0;
            return result;
        }
        result = num1 / num2;
        return result;
    }
}