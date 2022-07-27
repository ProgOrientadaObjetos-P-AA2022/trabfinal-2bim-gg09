
package paquete01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import paquete02.*;

public class Enlace {
    
    private Connection conn;

    public void establecerConexion() {

        try {
            // db parameters  
            String url = "jdbc:sqlite:bd/base01.bd.db";
            // create a connection to the database  
            conn = DriverManager.getConnection(url);
            // System.out.println(conn.isClosed());
            // System.out.println("Connection to SQLite has been established.");  
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public Connection obtenerConexion() {
        return conn;
    }
    
    public void insertarPlanPostPagoMegas(PlanPostPagoMegas planM) {  
  
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            planM.calcularPagoMensual();
            String data = String.format("INSERT INTO PlanPostPagoMegas "
                    + "(nombre,cedula,ciudad,marca,modelo,numero,"
                    + "megasGB,costoGB,tarifaBase,pagoMensual) "
                    + "values ('%s', '%s', '%s', '%s', '%s', '%d', %d, %s,"
                    + " %s, %s)",
                    planM.obtenerNombre(),
                    planM.obtenerCedula(), 
                    planM.obtenerCiudad(),
                    planM.obtenerMarca(),
                    planM.obtenerModelo(),
                    planM.obtenerNumero(),
                    planM.obtenerMegasGB(),
                    planM.obtenerCostoGB(),
                    planM.obtenerTarifaBase(),
                    planM.obtenerPagoMensual());
            System.out.println("\n");
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {  
             System.out.println("Exception:");
             System.out.println(e.getMessage());  
             
        }  
    }
    
    public ArrayList<PlanPostPagoMegas> obtenerDataPlanMegas() {  
        ArrayList<PlanPostPagoMegas> listaPM = new ArrayList<>();
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from PlanPostPagoMegas;";
            
            ResultSet rs = statement.executeQuery(data);
            while(rs.next()){
                PlanPostPagoMegas planM = new PlanPostPagoMegas(
                        rs.getString("nombre"),
                        rs.getString("cedula"),
                        rs.getString("ciudad"),
                        rs.getString("marca"),
                        rs.getString("modelo"),
                        rs.getInt("numero"),
                        rs.getInt("megasGB"),
                        rs.getDouble("costoGB"),
                        rs.getDouble("tarifaBase"));
                planM.calcularPagoMensual();
                listaPM.add(planM);
            }
            
            obtenerConexion().close();
        } catch (SQLException e) {  
             System.out.println("Exception: insertarPlanMegas");
             System.out.println(e.getMessage());  
             
        }  
        return listaPM;
    }
    
    public void insertarPlanPostPagoMinutos(PlanPostPagoMinutos planM) {  
  
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            planM.calcularPagoMensual();
            String data = String.format("INSERT INTO PlanPostPagoMinutos "
                    + "(nombre,cedula,ciudad,marca,modelo,numero,"
                    + "minNacionales,costMinNac,minInternac,"
                    + "costMinIntern,pagoMensual) "
                    + "values ('%s', '%s', '%s', '%s', '%s', '%d', %d, %s,"
                    + "%d, %s, %s)",
                    planM.obtenerNombre(),
                    planM.obtenerCedula(), 
                    planM.obtenerCiudad(),
                    planM.obtenerMarca(),
                    planM.obtenerModelo(),
                    planM.obtenerNumero(),
                    planM.obtenerMinutosNacionales(),
                    planM.obtenerCostoMinutosNacionales(),
                    planM.obtenerMinutosInternacionales(),
                    planM.obtenerCostoMinutosInternacionales(),
                    planM.obtenerPagoMensual());
            System.out.println("\n");
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {  
             System.out.println("Exception:");
             System.out.println(e.getMessage());  
             
        }  
    }
    
    public ArrayList<PlanPostPagoMinutos> obtenerDataPlanMinutos() {  
        ArrayList<PlanPostPagoMinutos> listaPM = new ArrayList<>();
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from PlanPostPagoMinutos;";
            
            ResultSet rs = statement.executeQuery(data);
            while(rs.next()){
                PlanPostPagoMinutos planM = new PlanPostPagoMinutos(
                        rs.getString("nombre"),
                        rs.getString("cedula"),
                        rs.getString("ciudad"),
                        rs.getString("marca"),
                        rs.getString("modelo"),
                        rs.getInt("numero"),
                        rs.getInt("minNacionales"),
                        rs.getDouble("costMinNac"),
                        rs.getInt("minInternac"),
                        rs.getDouble("costMinIntern"));
                planM.calcularPagoMensual();
                listaPM.add(planM);
            }
            obtenerConexion().close();
        } catch (SQLException e) {  
             System.out.println("Exception: insertarPlanMinutos");
             System.out.println(e.getMessage());  
             
        }  
        return listaPM;
    }
    
    public void insertarPlanPostPagoMinutosMegas(PlanPostPagoMinutosMegas planMM) {  
  
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            planMM.calcularPagoMensual();
            String data = String.format("INSERT INTO PlanPostPagoMinutosMegas "
                    + "(nombre,cedula,ciudad,marca,modelo,numero,minutos,"
                    + "costoMin,megasGB,costoGB,pagoMensual) "
                    + "values ('%s', '%s', '%s', '%s', '%s', '%d', %d, %s,"
                    + "%d, %s, %s)",
                    planMM.obtenerNombre(),
                    planMM.obtenerCedula(), 
                    planMM.obtenerCiudad(),
                    planMM.obtenerMarca(),
                    planMM.obtenerModelo(),
                    planMM.obtenerNumero(),
                    planMM.obtenerMinutos(),
                    planMM.obtenerCostoMinutos(),
                    planMM.obtenerMegasGB(),
                    planMM.obtenerCostoGB(),
                    planMM.obtenerPagoMensual());
            System.out.println("\n");
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {  
             System.out.println("Exception:");
             System.out.println(e.getMessage());  
             
        }  
    }
    
    public ArrayList<PlanPostPagoMinutosMegas> obtenerDataPlanMinutosMegas() {  
        ArrayList<PlanPostPagoMinutosMegas> listaPMM = new ArrayList<>();
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from PlanPostPagoMinutosMegas;";
            
            ResultSet rs = statement.executeQuery(data);
            while(rs.next()){
                PlanPostPagoMinutosMegas planMM = new PlanPostPagoMinutosMegas(
                        rs.getString("nombre"),
                        rs.getString("cedula"),
                        rs.getString("ciudad"),
                        rs.getString("marca"),
                        rs.getString("modelo"),
                        rs.getInt("numero"),
                        rs.getInt("minutos"),
                        rs.getDouble("costoMin"),
                        rs.getInt("megasGB"),
                        rs.getDouble("costoGB"));
                planMM.calcularPagoMensual();
                listaPMM.add(planMM);  
            }
            obtenerConexion().close();
        } catch (SQLException e) {  
             System.out.println("Exception: insertarPlanMinutosMegas");
             System.out.println(e.getMessage());  
             
        }  
        return listaPMM;
    }
    
    public void insertarPlanPostPagoMinutosMegasEconomico(PlanPostPagoMinutosMegasEconomico planMME) {  
  
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            
            String data = String.format("INSERT INTO PlanPostPagoMinutosMegasEconomico "
                    + "(nombre,cedula,ciudad,marca,modelo,numero,minutos,"
                    + "costoMin,megasGB,costoGB,porcDesc,pagoMensual) "
                    + "values ('%s', '%s', '%s', '%s', '%s', '%d', %d, %s,"
                    + "%d, %s, %s, %s)",
                    planMME.obtenerNombre(),
                    planMME.obtenerCedula(), 
                    planMME.obtenerCiudad(),
                    planMME.obtenerMarca(),
                    planMME.obtenerModelo(),
                    planMME.obtenerNumero(),
                    planMME.obtenerMinutos(),
                    planMME.obtenerCostoMinutos(),
                    planMME.obtenerMegasGB(),
                    planMME.obtenerCostoGB(),
                    planMME.obtenerPorcentajeDescuento(),
                    planMME.obtenerPagoMensual());
            System.out.println("\n");
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {  
             System.out.println("Exception:");
             System.out.println(e.getMessage());  
             
        }  
    }
    
    public ArrayList<PlanPostPagoMinutosMegasEconomico> obtenerDataPlanMinutosMegasEconomico() {  
        ArrayList<PlanPostPagoMinutosMegasEconomico> listaPMME = new ArrayList<>();
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from PlanPostPagoMinutosMegasEconomico;";
            
            ResultSet rs = statement.executeQuery(data);
            while(rs.next()){
                PlanPostPagoMinutosMegasEconomico planmme = new PlanPostPagoMinutosMegasEconomico(
                        rs.getString("nombre"),
                        rs.getString("cedula"),
                        rs.getString("ciudad"),
                        rs.getString("marca"),
                        rs.getString("modelo"),
                        rs.getInt("numero"),
                        rs.getInt("minutos"),
                        rs.getDouble("costoMin"),
                        rs.getInt("megasGB"),
                        rs.getDouble("costoGB"),
                        rs.getDouble("porcDesc")*100);
                planmme.calcularPagoMensual();
                listaPMME.add(planmme);   
            }
            
            obtenerConexion().close();
        } catch (SQLException e) {  
             System.out.println("Exception: insertarPlanMinutosMegasEconomico");
             System.out.println(e.getMessage());  
             
        }  
        return listaPMME;
    }
}
