package edu.escuelaing.arep.calculators;


import edu.escuelaing.arep.collections.LinkedList;

/**
 * The type Statistical calculator.
 *
 * @author Davor Cortes
 * @version 1.0
 */
public class StatisticalCalculator {

    private LinkedList<Double> data;

    /**
     * Instantiates a new Statistical calculator.
     */
    public StatisticalCalculator() {
        data = new LinkedList<>();
    }

    /**
     * Calculate the Mean.
     *
     * @return mean of dataset.
     * @throws CalculatorException the calculator exception
     */
    public double mean() throws  CalculatorException{
        if(data == null) throw  new  CalculatorException(CalculatorException.NULL_DATA);
        double calculation = 0;
        for (Double x:data
             ) {
            calculation += x / data.size();
        }
        calculation = Math.round(calculation * 100);
        return calculation / 100;
    }

    /**
     * Calculate Standar deviation.
     *
     * @return standar deviation of dataset.
     * @throws CalculatorException the calculator exception
     */
    public double standarDeviation() throws  CalculatorException{
        if(data == null) throw  new  CalculatorException(CalculatorException.NULL_DATA);
        double calculation = 0;
        double mean =  mean();
        for (Double x: data
            ){
            calculation += Math.pow(x - mean, 2)/(data.size() - 1);
        }
        calculation = Math.sqrt(calculation);
        calculation = Math.round(calculation * 100);
        return calculation / 100;
    }

    /**
     * Put data.
     *
     * @param data the data
     */
    public void putData(LinkedList<Double> data){
        this.data = data;
    }


    /**
     * Erase data.
     */
    public void eraseData(){
        this.data = null;
    }

}
