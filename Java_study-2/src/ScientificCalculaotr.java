class ScientificCalculaotr {
    protected int num1;
    protected int num2;
    protected int result;

    public void setNumbers(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public int Square() {
        int temp = num1;
        for(int count = num2 ; count > 1 ; count--){
            temp = temp * num1;
        }
        result = temp;
        return result;
    }

    public void displayResult(String operator) {
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}

