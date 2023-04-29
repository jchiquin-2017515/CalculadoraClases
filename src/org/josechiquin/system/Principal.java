/*
Nombre: Jose Daniel Chiquin Montenegro
Código Técnico: IN5AM
Carné: 2017515
Fecha de creación:16-03-2022
Fechas de Modificaciones:24/03/2022
 */
package org.josechiquin.system;

import java.util.Scanner;
import javax.swing.JOptionPane;
import org.josechiquin.bean.Division;
import org.josechiquin.bean.Multiplicacion;
import org.josechiquin.bean.Resta;
import org.josechiquin.bean.Salir;
import org.josechiquin.bean.Suma;

public class Principal {

    public static void main(String[] args) {
//        int num1, num2;
//        Scanner sc = new Scanner(System.in);
//        JOptionPane.showMessageDialog(null, "Jose Chiquin", "Programador", JOptionPane.WARNING_MESSAGE);
//        
//        num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un valor"));
//        num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un segundo valor"));
//        
//        JOptionPane.showMessageDialog(null,"La suma es: " + String.valueOf(num1+num2));
String opcion;
do{
opcion = JOptionPane.showInputDialog(null,"Elija una opción: \n"
                                    + "1. Suma \n" 
                                    + "2. Resta \n"
                                    + "3. Multiplicación \n"
                                    + "4. DIvisión \n"
                                    + "5. Salir \n" );

switch(opcion){
    case "1": Suma suma = new Suma(0,0);
    suma.setNum1(Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese un valor")));
    suma.setNum2(Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese otro valor")));
    JOptionPane.showMessageDialog(null,"La suma es: "+ String.valueOf(suma.sumatoria(suma.getNum1(),suma.getNum2())));
    break;
    
    case "2": Resta resta = new Resta(0,0);
    resta.setNum1(Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese un valor")));
    resta.setNum2(Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese otro valor")));
    JOptionPane.showMessageDialog(null,"La resta es: "+ String.valueOf(resta.restar(resta.getNum1(),resta.getNum2())));
    break;
    
    case "3": Multiplicacion multiplicacion = new Multiplicacion(0,0);
    multiplicacion.setNum1(Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese un valor")));
    multiplicacion.setNum2(Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese otro valor")));
    JOptionPane.showMessageDialog(null,"La multiplicación es: "+ String.valueOf(multiplicacion.multi(multiplicacion.getNum1(),multiplicacion.getNum2())));
    break;
    
    case "4": Division division = new Division(0,0);
    division.setNum1(Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese un valor")));
    division.setNum2(Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese otro valor")));
    if(division.getNum2()==0){ 
       JOptionPane.showMessageDialog(null,"No se puede realizar"); 
    }
    else
        JOptionPane.showMessageDialog(null,"La división es: "+ String.valueOf(division.divi(division.getNum1(),division.getNum2())));
    break;
    
    case "5": Salir salir = new Salir();
    JOptionPane.showMessageDialog(null,"La división es: "+ String.valueOf(salir.salida(salir.getNum1()))); 
    break;
    
    default:
    JOptionPane.showMessageDialog(null,"Ingrese una opción");
    break;
    }
    }while(opcion!="1"+"2"+"3"+"4"+"5");
  }
}
