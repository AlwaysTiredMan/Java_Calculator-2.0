class Factorial extends Calculator {

    public void setNumbers(int num1) {
        this.num1 = num1;
    }
    public int factorial() {
        int temp = 1;
        for (int count=num1; count> 0; count--) {
            temp = temp * count;
        }
        result=temp;
        return result;
    }
    @Override
    public void displayResult(String operator) {
        System.out.println(num1 + operator + " = " + result);
    }
}
