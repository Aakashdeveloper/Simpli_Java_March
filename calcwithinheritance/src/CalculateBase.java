public  abstract class CalculateBase{
    public double leftVal;
    public double rightVal;
    public char opCode;
    public double result;

    public double getLeftVal(){return  leftVal;}
    public void setLeftVal(double leftVal) {this.leftVal = leftVal;}
    public double getRightVal(){return  rightVal;}
    public void setRightVal(double rightVal) {this.rightVal = rightVal;}
    public double getOpCode(){return  opCode;}
    public void setOpCode(char opCode) {this.opCode = opCode;}

    public double getResult(){return  result;}
    public void setResult(double result) {this.result = result;}

    public CalculateBase(){
    }


    public CalculateBase(double leftVal, double rightVal){
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    public abstract void calculate();
}
