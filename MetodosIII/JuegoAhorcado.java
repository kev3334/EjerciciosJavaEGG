/*
Escribe un programa que implemente un juego en el que el usuario debe adivinar una palabra aleatoria.
El programa elegirá una palabra al azar de una lista predefinida y mostrará una pista de la longitud de la palabra.
El usuario tendrá un número limitado de intentos para adivinar la palabra. Después de cada intento,
el programa mostrará cuántas letras ha adivinado correctamente y en qué posición se encuentran.
El programa debe tener las siguientes características:
Utiliza un array de Strings para almacenar una lista de palabras predefinidas.
Utiliza el método Math.random() para seleccionar una palabra aleatoria del array.
Implementa un método para obtener una pista de la palabra seleccionada. Por ejemplo, si la palabra es "casa", la pista podría ser "_ _ _ _" (cuatro guiones bajos).
Implementa un método para comprobar si una letra ingresada por el usuario está presente en la palabra seleccionada y en qué posición se encuentra.
Utiliza un bucle para permitir al usuario ingresar sus intentos hasta que adivine la palabra o se agoten los intentos.
Muestra un mensaje al usuario al final del juego indicando si adivinó la palabra correctamente o no, y muestra la palabra completa.
*/

import java.util.Scanner;

public class JuegoAhorcado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System. in);
        String paisAleatorio = generarPalabraAleatoria();

        System.out.println("╔═════════════════════════════╗");
        System.out.println("║       ADIVINA EL PAÍS       ║");
        System.out.println("╚═════════════════════════════╝");
        System.out.println("Pista: El nombre del país tiene "+paisAleatorio.length()+" sílabas");
        //Inicializamos el texto final y el array
        String resultadoFinal=generarPista(paisAleatorio);//_______
        char[] arrayResultado = new char[paisAleatorio.length()];
        System.out.println("\t\t"+resultadoFinal);
        for(int i=0; i<arrayResultado.length;i++){
            arrayResultado[i]='_';//_,_,_,_,
        }

        int intentos=3;

        do{
            System.out.println("\nTiene "+intentos+" intentos.");
            System.out.print("Ingrese una letra que se encuentre en la palabra: ");
            char letraUsuario = scanner.next().charAt(0);
            if(comprobarLetrausuario(letraUsuario,paisAleatorio)){
                System.out.println("La letra \""+letraUsuario+"\" SÍ se encuentra en la palabra");
                resultadoFinal="";
                for(int i=0; i<actualizarArrayResultado(letraUsuario,paisAleatorio,arrayResultado).length;i++){
                    resultadoFinal+=actualizarArrayResultado(letraUsuario,paisAleatorio,arrayResultado)[i];
                }
                System.out.print("\t\t"+resultadoFinal);
            }else{
                System.out.println("La letra ingresada NO se encuentra en la palabra");
            }
            intentos--;
        }while(intentos!=0);

        if(acertoPalabra(paisAleatorio,resultadoFinal)){
            System.out.println("Felicidades Adivinó la palabra correcta, eres un crack");
        }else{
            System.out.print("\nNo tienes más intentos. Debes adivinar la palabra final. Ingrese su respuesta final: ");
            String palabraFinalUsuario = scanner.next();
            if(acertoPalabra(paisAleatorio,palabraFinalUsuario)){
                System.out.println("Felicidades adivinó correctamente el país, eres un crack");
            }else{
                System.out.println("\nPERDISTE");
                System.out.println("El país correcto es: ");
                System.out.print("\t\t"+paisAleatorio);
            }
        }

    }

    public static String generarPalabraAleatoria(){
        String[] listaPaises = {"Ecuador", "Canada", "Mexico", "Brasil", "Argentina", "Inglaterra", "Francia", "Alemania", "Italia", "España",
                "China", "Japon", "India", "Peru", "Rusia", "Chile", "Egipto", "Turquia", "Colombia", "Venezuela"};
        int indicePaisAleatorio = (int)(Math.random()*20);
        return listaPaises[indicePaisAleatorio];
    }

    public static boolean comprobarLetrausuario(char letraUsuario, String palabraPais){
        boolean letraEncontrada=false;

        for(int i=0; i<palabraPais.length();i++){
            if(palabraPais.toLowerCase().charAt(i)==Character.toLowerCase(letraUsuario)){
                letraEncontrada=true;
            }
        }
        return letraEncontrada;
    }

    public static char[] actualizarArrayResultado (char letraUsuario, String palabraPais, char[] arrayResultado){
        for(int i=0; i<palabraPais.length();i++){
            if(palabraPais.toLowerCase().charAt(i)==Character.toLowerCase(letraUsuario)){
                    arrayResultado[i]=Character.toLowerCase(letraUsuario);
                }
            }
        return arrayResultado;

    }

    public static String generarPista(String palabraPais){
        String resultadoFinal="";
        for(int i=0; i<palabraPais.length();i++){
            resultadoFinal+="_";
        }
        return resultadoFinal;
    }

    public static boolean acertoPalabra(String palabraAleatoria, String palabraUsuario){
        if(palabraUsuario.toLowerCase().equals(palabraAleatoria.toLowerCase())){
            return true;
        }else{
            return false;
        }

    }
}