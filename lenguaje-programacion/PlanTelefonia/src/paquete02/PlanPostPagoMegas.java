
package paquete02;

public class PlanPostPagoMegas extends PlanCelular{
    
    int megasGB;
    double costoGB;
    double tarifaBase;
    
    public PlanPostPagoMegas(String nom, String ci, String c, 
            String mar, String mod, int num, int m, double cgb, double tb){
        super(nom, ci, c, mar, mod, num);
        megasGB = m;
        costoGB = cgb;
        tarifaBase = tb;
    }
    
    public void establecerMegasGB(int n){
        megasGB = n;
    }
    
    public void establecerCostoGB(double c){
        costoGB = c;
    }
    
    public void establecerTarifaBase(double t){
        tarifaBase = t;
    }
    
    @Override
    public void calcularPagoMensual() {
        pagoMensual = (megasGB * costoGB) + tarifaBase;
    }
    
    public int obtenerMegasGB(){
        return megasGB;
    }
    
    public double obtenerCostoGB(){
        return costoGB;
    }
    
    public double establecerTarifaBase(){
        return tarifaBase;
    }
}
