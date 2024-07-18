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

public class ValidacionDeContraseña {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrayMayusculas = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","Ñ","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String[] arrayMinusculas = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z"};
        String[] arrayNumeros = {"0","1","2","3","4","5","6","7","8","9"};
        String[] arrayCaracteresEspeciales = {"!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", "/", ":", ";", "<", "=", ">", "?","@", "[", "\\", "]", "^", "_", "`", "{", "|", "}", "~"};
        boolean contraseniaCorrecta=false;
        
        while(!contraseniaCorrecta){        
            System.out.println("-----------------------------------------------------------");
            System.out.println("*****************VALIDACIÓN DE CONTRASEÑA******************");
            System.out.println("-----------------------------------------------------------");
            System.out.print("Ingrese su nueva contraseña: ");
            String contraseniaUsuario = scanner.nextLine();
            boolean validaTamanioMinimo = (contraseniaUsuario.length()>=8) ? true : false;
            boolean validaTamanioMaximo = (contraseniaUsuario.length()<=30 ? true : false); 
            boolean validaVacio = (contraseniaUsuario.isEmpty()) ? true : false;
            boolean validaEspacio = (contraseniaUsuario.contains(" ")) ? true : false;
            
            boolean validaMayuscula = false, validaMinuscula=false, validaNumero=false, validaCaracterEspecial=false;
            String resultadoFinal,resultadoTamanioMinimo, resultadoTamanioMaximo,resultadoMayuscula, resultadoMinuscula, resultadoNumero, resultadoCaracterEspecial;
            if(validaVacio){
                resultadoFinal="La contraseña no puede estar vacía";
            }else{
                if(validaEspacio){
                    resultadoFinal="La contraseña no debe tener espacios en blanco";
                }else{
                    for(int i=0; i<arrayMayusculas.length; i++){
                        if(contraseniaUsuario.contains(arrayMayusculas[i])){
                            validaMayuscula=true;
                        }
                    }
                    for(int j=0; j<arrayMinusculas.length; j++){
                        if(contraseniaUsuario.contains(arrayMinusculas[j])){
                            validaMinuscula=true;
                        }
                    }
                    for(int k=0; k<arrayNumeros.length; k++){
                        if(contraseniaUsuario.contains(arrayNumeros[k])){
                            validaNumero=true;
                        }
                    }
                    for(int l=0; l<arrayCaracteresEspeciales.length; l++){
                        if(contraseniaUsuario.contains(arrayCaracteresEspeciales[l])){
                            validaCaracterEspecial=true;
                        }
                    }
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
 