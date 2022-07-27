
package paquete02;

public class PlanPostPagoMinutos extends PlanCelular{
    
    int minNacionales;
    double costMinNac;
    int minInternac;
    double costMinIntern;
    
    public PlanPostPagoMinutos(String nom, String ci, String c, 
            String mar, String mod, int num, int mN, double pN, 
            int mI, double pI){
        super(nom, ci, c, mar, mod, num);
        minNacionales = mN;
        costMinNac = pN;
        minInternac = mI;
        costMinIntern = pI;
    }
    
    public void establecerMinutosNacionales(int min){
        minNacionales = min;
    }
    
    public void establecerCostoMinutosNacionales(double c){
        costMinNac = c;
    }
    
    public void establecerMinutosInternacionales(int min){ 
        minInternac = min;
    }
    
    public void establecerCostoMinutosInternacionales(double c){
        costMinIntern = c;
    }
    
    @Override
    public void calcularPagoMensual() {
        pagoMensual = (minNacionales * costMinNac) + 
                (minInternac + costMinIntern);
    }
    
    public int obtenerMinutosNacionales(){
        return minNacionales;
    }
    
    public double obtenerCostoMinutosNacionales(){
        return costMinNac;
    }
    
    public int obtenerMinutosInternacionales(){ 
        return minInternac;
    }
    
    public double obtenerCostoMinutosInternacionales(){
        return costMinIntern;
    }
    
    @Override
    public String toString() {
        String data = String.format(super.toString() 
                + "-->Plan PostPago Minutos\n"
                + "-Numero minutos nacionales: %d\n"
                + "-Costo por minuto nacional: %.2f\n"
                + "-Numero minutos internacionales: %d\n"
                + "-Costo por minuto internacional: %.2f\n\n"
                + "Pago mensual: %.2f\n",
                obtenerMinutosNacionales(),
                obtenerCostoMinutosNacionales(),
                obtenerMinutosInternacionales(),
                obtenerCostoMinutosInternacionales(),
                obtenerPagoMensual());
        return data;
    }
}
