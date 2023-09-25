import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Object[] options = {"Convertir Divisas", "Convertir Temperatura","Salir"};
        int elige = JOptionPane.showOptionDialog(null, "que quieres hacer?", "conversor", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
        if (elige == 2){
            JOptionPane.showMessageDialog(null, "programa cerrado");
            System.exit(0);
        }
        if (elige == 0){
            DecimalFormat formatearDivisa = new DecimalFormat("#.##");
            boolean continuarPrograma = true;
            while(continuarPrograma){
                String[] opciones = {"pesos a euros", "pesos a dolares", "pesos a libras esterlinas", "pesos a yuanes", "pesos a wones"};
                String cambio = (String) JOptionPane.showInputDialog(null,"elije una opcion", "conversor de moneda", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
                String input = JOptionPane.showInputDialog(null,"ingrese cantidad de pesos");
                double pesos;
                try{
                    pesos = Double.parseDouble(input);
                     if(cambio.equals ("pesos a euros")){
                        double euros = pesos / 952.38;   
                        JOptionPane.showMessageDialog(null, pesos + "pesos chilenos son: " + formatearDivisa.format(euros) + "dolares.");             
                    }else if(cambio.equals ("pesos a dolares")){
                        double dolares = pesos / 901.70;   
                        JOptionPane.showMessageDialog(null, pesos + "pesos chilenos son: " + formatearDivisa.format(dolares) + "dolares."); 
                    }else if(cambio.equals ("pesos a libras")){
                        double libras = pesos / 901.70;   
                        JOptionPane.showMessageDialog(null, pesos + "pesos chilenos son: " + formatearDivisa.format(libras) + "dolares."); 
                    }else if(cambio.equals ("pesos a yenes")){
                        double yenes = pesos / 6.05;   
                        JOptionPane.showMessageDialog(null, pesos + "pesos chilenos son: " + formatearDivisa.format(yenes) + "dolares."); 
                    }else if(cambio.equals ("pesos a euros")){
                        double wones = pesos / 0.67;   
                        JOptionPane.showMessageDialog(null, pesos + "pesos chilenos son: " + formatearDivisa.format(wones) + "dolares."); 
                    }
                    int confirma = JOptionPane.showConfirmDialog(null,"¿Desea continuar con otra conversion?", "Confirmar", JOptionPane.YES_NO_OPTION);
                    if (confirma == JOptionPane.NO_OPTION){
                        continuarPrograma=false;
                        JOptionPane.showMessageDialog(null, "Programa finalizado");
                    }
                    
                }catch(NumberFormatException e){
                    pesos = Double.parseDouble(input);
                    JOptionPane.showMessageDialog(null,"valor no valido");          
                }
                
            }
        }
        if(elige == 1){
            boolean seguirPrograma = true;
            while(seguirPrograma){
                String[] opciones = {"celsios a fahrenheit", "fahrenheit a celsios"};
                int opcion = JOptionPane.showOptionDialog(null, "elije una opcion", "conversor de temperatura",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
                String valorNominal = JOptionPane.showInputDialog(null, "ingrese valor a convertir");
                double valor = 0.0;
              
                try{
                    valor = Double.parseDouble(valorNominal);
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "valor no valido");
                    System.exit(0);
                }
                double resultado = 0 ;
                if(opcion == 0){
                    resultado = (valor * 9/5)+32;
                    JOptionPane.showMessageDialog(null, valor + "grados celsios son" + resultado + "grados fahrenheit");
                }else if(opcion == 1){
                    resultado = (valor - 32) * 5/9;
                    JOptionPane.showMessageDialog(null, valor + "grados fahrenheit" + resultado + "grados celsios son");  
                }
                int continuar = JOptionPane.showConfirmDialog(null, "desea continuar con otra conversion?","", JOptionPane.YES_NO_OPTION);
                    if(continuar==JOptionPane.NO_OPTION){
                        seguirPrograma = false;
                        JOptionPane.showMessageDialog(null, "programa finalizado");
                    }
            }   
        }
    }

}