
package paquete03;

import java.util.Locale;
import java.util.Scanner;
import paquete01.Enlace;
import paquete02.*;

public class Ejecutor {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Ejecutor obj = new Ejecutor();
        Enlace c = new Enlace();
        //sc.useLocale(Locale.US);
        int opc;
        String bandera;
        boolean continuar = true;
        do{
            opc = obj.menu();
            if(opc < 1 || opc > 4){
                System.out.println("Error. Ingrese una opción Válida");
            }else{
                obj.sc.nextLine();
                //Proceso
                System.out.println("Ingrese el nombre del propietario: ");
                String nom = obj.sc.nextLine();
                System.out.println("Ingrese la cédula de identidad: ");
                String ced = obj.sc.nextLine();
                System.out.println("Ingrese la ciudad de residencia: ");
                String ciudad = obj.sc.nextLine();
                System.out.println("Ingrese la marca del teléfono movil: ");
                String marca = obj.sc.nextLine();
                System.out.println("Ingrese el modelo del teléfono móvil: ");
                String mod = obj.sc.nextLine();
                System.out.println("Ingrese el número de telefono del "
                        + "propietario: ");
                int num = obj.sc.nextInt();
                obj.sc.nextLine();
                
                switch(opc){
                    case 1:
                        System.out.println("Ingrese el numero de Megas (GB) "
                                + "que desea en su plan: ");
                        int numgb = obj.sc.nextInt();
                        System.out.println("Ingrese el costo por Mega (GB): ");
                        double costo = obj.sc.nextDouble();
                        
                        PlanPostPagoMegas planM = new PlanPostPagoMegas(nom, ced, 
                                ciudad, marca, mod, num, numgb, costo, 6.50);
                        planM.calcularPagoMensual();
                        
                        //c.insertarPlanMegas(planM);
                        System.out.println(planM);
                        
                        break;
                    case 2:
                        System.out.println("Ingrese el número de minutos "
                                + "nacionales: ");
                        int mn = obj.sc.nextInt();
                        System.out.println("Ingrese el costo por minuto "
                                + "nacional: ");
                        double cn = obj.sc.nextDouble();
                        System.out.println("Ingrese el número de minutos "
                                + "internacionales: ");
                        int mi = obj.sc.nextInt();
                        System.out.println("Ingrese el costo por minuto "
                                + "internacional: ");
                        double ci = obj.sc.nextDouble();
                        
                        PlanPostPagoMinutos planMin = new PlanPostPagoMinutos(nom, ced, 
                                ciudad, marca, mod, num, mn, cn, mi, ci);
                        planMin.calcularPagoMensual();
                        
                        //c.insertarPlanMinutos(planMin);
                        System.out.println(planMin);
                        
                        break;
                    case 3:
                        System.out.println("Ingrese el número de minutos de "
                                + "su plan: ");
                        int nm = obj.sc.nextInt();
                        System.out.println("Ingrese el costo por minuto: ");
                        double cm = obj.sc.nextDouble();
                        System.out.println("Ingrese el número de Megas (GB) "
                                + "de su plan: ");
                        int nGB = obj.sc.nextInt();
                        System.out.println("Ingrese el costo por Mega (GB): ");
                        double cGB = obj.sc.nextDouble();
                        
                        PlanPostPagoMinutosMegas planMM = new PlanPostPagoMinutosMegas(nom, 
                                ced, ciudad, marca, mod, num, nm, cm, nGB, cGB);
                        planMM.calcularPagoMensual();
                        
                        //c.insertarPlanMinutosMegas(planMM);
                        System.out.println(planMM);
                        
                        break;
                    case 4:
                        System.out.println("Ingrese el número de minutos de "
                                + "su plan: ");
                        nm = obj.sc.nextInt();
                        System.out.println("Ingrese el costo por minuto: ");
                        cm = obj.sc.nextDouble();
                        System.out.println("Ingrese el número de Megas (GB) "
                                + "de su plan: ");
                        nGB = obj.sc.nextInt();
                        System.out.println("Ingrese el costo por Mega (GB): ");
                        cGB = obj.sc.nextDouble();
                        
                        PlanPostPagoMinutosMegasEconomico planMME = new
                                PlanPostPagoMinutosMegasEconomico(nom,ced, ciudad, 
                                        marca, mod, num, nm, cm, nGB, cGB, 20);
                        planMME.calcularPagoMensual();
                        
                        //c.insertarPlanMinutosMegasEc(planMME);
                        System.out.println(planMME);
                        
                        break;
                    default: break;
                        
                }
                obj.sc.nextLine();
                System.out.println("Desea acceder a otro plan de "
                        + "telefonía movil?: ");
                bandera = obj.sc.nextLine();
                if("No".equals(bandera) || "no".equals(bandera)){
                    continuar = false;
                }
            }
        }while(continuar);
        
    }
    
    public int menu(){
        System.out.println("           Plan de Telefonía Móvil  ");
        System.out.println("----------------------------------------------");
        System.out.println("[1]-> Plan PostPago Megas");
        System.out.println("[2]-> Plan PostPago Minutos");
        System.out.println("[3]-> Plan PostPago Minutos Megas");
        System.out.println("[4]-> Plan PostPago Minutos Megas Economico");
        System.out.println("Ingrese la opcion del plan que desee adquirir: ");
        int op = sc.nextInt();
        return op;
    }
}
