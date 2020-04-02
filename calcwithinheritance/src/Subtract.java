public class Subtract extends CalculateBase {

    public Subtract(){ }

    public Subtract(double leftVal, double rightVal){
        super(leftVal,rightVal);
    }

    @Override
    public void calculate(){
        double value = getLeftVal() - getRightVal();
        setResult(value);
    }

}
