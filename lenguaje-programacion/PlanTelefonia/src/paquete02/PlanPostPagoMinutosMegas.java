
package paquete02;

public class PlanPostPagoMinutosMegas extends PlanCelular{
    
    int minutos;
    double costoMin;
    int megasGB;
    double costoGB;
    
    public PlanPostPagoMinutosMegas(String nom, String ci, String c, 
            String mar, String mod, int num, int min, double cmin, 
            int m, double cgb){
        super(nom, ci, c, mar, mod, num);
        minutos = min;
        costoMin = cmin;
        megasGB = m;
        costoGB = cgb;
    }
    
    public void establecerMinutos(int m){
        minutos = m;
    }
    
    public void establecerCostoMinutos(double c){
        costoMin = c;
    }
    
    public void establecerMegasGB(int m){
        megasGB = m;
    }
    
    public void establecerCostoGB(double c){
        costoGB = c;
    }
    
    @Override
    public void calcularPagoMensual(){
        pagoMensual = (minutos * costoMin) + (megasGB + costoGB);
    }
    
    public int obtenerMinutos(){
        return minutos;
    }
    
    public double obtenerCostoMinutos(){
        return costoMin;
    }
    
    public int obtenerMegasGB(){
        return megasGB;
    }
    
    public double obtenerCostoGB(){
        return costoGB;
    }
    
}
