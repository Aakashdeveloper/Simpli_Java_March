package com.developerfunnel.myapp;

public class switcharrayloopcalc {
    public static void main(String[] args){
        double[] leftVals = {100.0d, 25.0d, 325.0d, 11.0d};
        double[] rightVals = {50.0d, 95.0d, 225.0d, 31.0d};
        char[] opCodes = {'d','a','s','m'};
        double[] result = new double[opCodes.length];

        for(int i =0; i<opCodes.length; i++){
            switch(opCodes[i]){
                case 'a':
                    result[i] = leftVals[i]+rightVals[i];
                    break;
                case 's':
                    result[i] = leftVals[i]-rightVals[i];
                    break;
                case 'm':
                    result[i] = leftVals[i]*rightVals[i];
                    break;
                case 'd':
                    result[i] = rightVals[i] != 0.0d ?  leftVals[i]/rightVals[i]: 0.0d;
                    break;
                default:
                    System.out.println("Error - invalid opcode");
                    result[i] = 0.0d;

            }

        }

        for(double theresult:result){
            System.out.println(theresult);
        }

    }
}

/*
for(int i =0; i<opCodes.length; i++){
            if(opCodes[i] == 'a')
                result[i] = leftVals[i]+rightVals[i];
            else if(opCodes[i] == 's')
                result[i] = leftVals[i]-rightVals[i];
            else if(opCodes[i] == 'm')
                result[i] = leftVals[i]*rightVals[i];
            else if(opCodes[i] == 'd')
                result[i] = rightVals[i] != 0.0d ?  leftVals[i]/rightVals[i]: 0.0d;
            else{
                System.out.println("Error - invalid opcode");
                result[i] = 0.0d;
            }
        }
 */