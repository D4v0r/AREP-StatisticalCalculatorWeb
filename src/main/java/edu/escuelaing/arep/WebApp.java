package edu.escuelaing.arep;

import edu.escuelaing.arep.calculators.CalculatorException;
import edu.escuelaing.arep.calculators.StatisticalCalculator;
import edu.escuelaing.arep.collections.LinkedList;
import spark.Request;
import spark.Response;

import  static spark.Spark.*;

/**
 * Web App main class.
 *
 *  @author Davor Cortés
 *  @version 1.0
 */
public class WebApp
{
    private static StatisticalCalculator calculator = new StatisticalCalculator();

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main( String[] args )
    {
        port(getPort());
        get("/inputdata", WebApp::inputDataPage);
        get("/results", WebApp::resultDataPage);

    }

    /**
     *  Generate Input Page
     *
     * @param req the request
     * @param res the response
     * @return
     */
    private static String inputDataPage(Request req, Response res){
        String pageContent
                = "<!DOCTYPE html>"
                + "<html>"
                + "<body>"
                + "<h1>Calculadora Estadística</h1>"
                + "<form action=\"/results\">"
                + "      Ingrese los números separados por un espacio en blanco <br>"
                + "     <input type=\"text\" name=\"input\" value=\"\">"
                + "     <br><br>"
                + "     <input type=\"submit\" value=\"Calcular\">"
                + "</form>"
                + "<p>Si das click en el botón \"Calcular\" los datos serán enviados a una página llamada \"/results\".</p>"
                + "</body>"
                + "</html>";
        return pageContent;
    }

    /**
     * Generate Result Page
     *
     * @param request
     * @param response
     * @return
     * @throws CalculatorException
     */
    private static String resultDataPage(Request request, Response response) throws CalculatorException {
        LinkedList<Double> dataList = new LinkedList<>();
        for(String data : request.queryParams("input").split(" ")){
            dataList.add(Double.parseDouble(data));
        }
        calculator.putData(dataList);
        return "La media de los datos ingresados es: " + calculator.mean() + " y su desviación estándar es: " + calculator.standarDeviation();


    }

    /**
     * Get Link Port
     */
    private static int getPort(){
        if (System.getenv("PORT") != null){
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}
