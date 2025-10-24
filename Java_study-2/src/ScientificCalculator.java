class ScientificCalculator extends AdvancedCalculator {
    
    public int Square() {
        int temp = num1;
        for(int count = num2 ; count > 1 ; count--){
            temp = temp * num1;
        }
        result = temp;
        return result;
    }
}

