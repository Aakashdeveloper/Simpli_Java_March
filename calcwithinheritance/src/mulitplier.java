public class mulitplier extends CalculateBase {

    public mulitplier(){ }

    public mulitplier(double leftVal, double rightVal){
        super(leftVal,rightVal);
    }

    @Override
    public void calculate(){
        double value = getLeftVal() * getRightVal();
        setResult(value);
    }

}