
package paquete02;

public class PlanPostPagoMinutosMegasEconomico extends PlanCelular{
    
    int minutos;
    double costoMin;
    int megasGB;
    double costoGB;
    double porcDesc;
    
    public PlanPostPagoMinutosMegasEconomico(String nom, String ci, 
            String c, String mar, String mod, int num, int min, 
            double cmin, int m, double cgb, double desc){
        super(nom, ci, c, mar, mod, num);
        minutos = min;
        costoMin = cmin;
        megasGB = m;
        costoGB = cgb;
        porcDesc = desc;
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
    
    public void establecerPorcentajeDescuento(double pd){
        porcDesc = (pd / 100);
    }
    
    @Override
    public void calcularPagoMensual(){
        double sub = (minutos * costoMin) + (megasGB * costoGB);
        pagoMensual = sub - (sub * porcDesc);
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
    
    public double obtenerPorcentajeDescuento(){
        return porcDesc;
    }
    
    @Override
    public String toString() {
        String data = String.format(super.toString() 
                + "-->Plan PostPago Minutos Megas Económico\n"
                + "-Numero de Minutos: %d\n"
                + "-Costo por Minuto: %.2f\n"
                + "-Numero de Megas(GB): %d\n"
                + "-Costo por Mega(GB): %.2f\n"
                + "-Porcentaje de Descuento: %.2f\n\n"
                + "Pago mensual: %.2f\n",obtenerMinutos(),
                obtenerCostoMinutos(), obtenerMegasGB(),
                obtenerCostoGB(), obtenerPorcentajeDescuento(),
                obtenerPagoMensual());
        return data;
    }
}
