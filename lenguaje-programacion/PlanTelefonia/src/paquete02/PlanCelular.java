
package paquete02;

public abstract class PlanCelular {
    
    protected String nombre;
    protected String cedula;
    protected String ciudad;
    protected String marca;
    protected String modelo;
    protected int numero;
    protected double pagoMensual;
    
    public PlanCelular(String nom, String ci, String c, 
            String mar, String mod, int num){
        nombre = nom;
        cedula = ci;
        ciudad = c;
        marca = mar;
        modelo = mod;
        numero = num;
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerCedula(String c){
        cedula = c;
    }
    
    public void establecerCiudad(String c){
        ciudad = c;
    }
    
    public void establecerMarca(String m){
        marca = m;
    }
    
    public void establecerModelo(String m){
        modelo = m;
    }
    
    public void establecerNumero(int num){
        numero = num;
    }
    
    public abstract void calcularPagoMensual();
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerCedula(){
        return cedula;
    }
    
    public String obtenerCiudad(){
        return ciudad;
    }
    
    public String obtenerMarca(){
        return marca;
    }
    
    public String obtenerModelo(){
        return modelo;
    }
    
    public int obtenerNumero(){
        return numero;
    }
    
    public double obtenerPagoMensual(){
        return pagoMensual;
    }
    
    @Override
    public String toString() {
        String data = String.format("\n-->Propietario\n"
                + "-Nombre del propietario: %s\n"
                + "-Cedula de identidad: %s\n"
                + "-Ciudad de residencia: %s\n\n"
                + "-->Informacion del teléfono Móvil\n"
                + "-Marca: %s\n"
                + "-Modelo: %s\n"
                + "-Numero del teléfono: %d\n\n",nombre, cedula, ciudad, 
                marca, modelo, numero);

        return data;
    }
    
}
