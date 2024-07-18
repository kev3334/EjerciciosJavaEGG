/*
✏️  Actividad:Validación de contraseña
Escribe un programa que solicite al usuario que ingrese una contraseña y verifique 
si cumple con los siguientes criterios para considerarse segura:
La contraseña debe tener al menos 8 caracteres.
La contraseña debe contener al menos una letra mayúscula y una letra minúscula.
La contraseña debe contener al menos un número.
La contraseña debe contener al menos un carácter especial (por ejemplo, !, @, #, $).
El programa debe mostrar un mensaje indicando si la contraseña es segura o no, 
según los criterios establecidos. Puedes utilizar métodos de la clase String para verificar cada uno de los criterios.
*/

import java.util.Scanner;

public class VerificacionDeContraseñaNueva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean contraseniaCorrecta=false;
        while(!contraseniaCorrecta){
            String contraseniaUsuario;
        
            System.out.println("-----------------------------------------------------------");
            System.out.println("*****************VALIDACIÓN DE CONTRASEÑA******************");
            System.out.println("-----------------------------------------------------------");
            System.out.print("Ingrese su nueva contraseña: ");
            contraseniaUsuario = scanner.nextLine();

            boolean validaTamanioMinimo = (contraseniaUsuario.length()>=8) ? true : false;
            boolean validaTamanioMaximo = (contraseniaUsuario.length()<=30 ? true : false); 
            boolean validaMayuscula = (contraseniaUsuario.matches(".*[A-Z].*")) ? true : false;
            boolean validaMinuscula = (contraseniaUsuario.matches(".*[a-z].*")) ? true : false;
            boolean validaNumero = (contraseniaUsuario.matches(".*[0-9].*")) ? true : false;
            boolean validaCaracterEspecial = (contraseniaUsuario.matches(".*[!@#$%^&*()\\-_=+\\[\\]{}|;:'\",.<>?/].*")) ? true : false;
            boolean validaVacio = (contraseniaUsuario.isEmpty()) ? true : false;
            boolean validaEspacio = (contraseniaUsuario.contains(" ")) ? true : false;
            
            
            String resultadoFinal,resultadoTamanioMinimo, resultadoTamanioMaximo,resultadoMayuscula, resultadoMinuscula, resultadoNumero, resultadoCaracterEspecial;
            if(validaVacio){
                resultadoFinal="La contraseña no puede estar vacía";
            }else{
                if(validaEspacio){
                    resultadoFinal="La contraseña no debe tener espacios en blanco";
                }else{
                    if(validaTamanioMinimo==true && validaTamanioMaximo==true && validaMayuscula==true && validaMinuscula==true && validaNumero==true && validaCaracterEspecial==true){
                        resultadoFinal="¡Contraseña segura! Cumple con todos los criterios.";
                        contraseniaCorrecta=true;
                    }else{
                        if(validaTamanioMinimo){
                            resultadoTamanioMinimo="";
                        }else{
                            resultadoTamanioMinimo="La contraseña debe tener al menos 8 caracteres\n";
                        }
                        if(validaTamanioMaximo){
                            resultadoTamanioMaximo="";
                        }else{
                            resultadoTamanioMaximo="La contraseña debe tener maximo 30 caracteres\n";
                        }
                        if(validaMayuscula){
                            resultadoMayuscula="";
                        }else{
                            resultadoMayuscula="La contraseña debe tener al menos una letra Mayúscula\n";
                        }
                        if(validaMinuscula){
                            resultadoMinuscula="";
                        }else{
                            resultadoMinuscula="La contraseña debe tener al menos una letra Minúscula\n";
                        }
                        if(validaNumero){
                            resultadoNumero="";
                        }else{
                            resultadoNumero="La contraseña debe tener al menos un número\n";
                        }
                        if(validaCaracterEspecial){
                            resultadoCaracterEspecial="";
                        }else{
                            resultadoCaracterEspecial="La contraseña debe tener al menos un carácter especial\n";
                        }
                        resultadoFinal="Contraseña no segura.\n"+resultadoTamanioMinimo+resultadoTamanioMaximo+resultadoMayuscula+resultadoMinuscula+resultadoNumero+resultadoCaracterEspecial;
                    }
                }
            }
            System.out.println(resultadoFinal);
        }
        scanner.close();
    }
}