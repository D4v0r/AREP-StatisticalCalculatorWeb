package edu.escuelaing.arep.calculators;

/**
 * The type Calculator exception.
 *
 * @author Davor Cortés
 * @version 1.0
 */
public class CalculatorException extends Exception {

    /**
     * The constant NULL_DATA.
     */
    public static final String NULL_DATA = "Calculator data is null";

    /**
     * Instantiates a new Calculator exception.
     *
     * @param message the message
     */
    public CalculatorException(String message){
        super(message);
    }
}
