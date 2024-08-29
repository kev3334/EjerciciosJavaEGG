import enums.DiaSemana;

public class Aplication {
    public static void main(String[] args) {
        DiaSemana[] dias = new DiaSemana[10];
        generarDiasAleatorios(dias);

        for(DiaSemana dia : dias){
            System.out.println(dia+" "+imprimirDiaLaboral(dia));
        }

    }

    public static void generarDiasAleatorios(DiaSemana[] dias){
        for (int i = 0; i <dias.length ; i++) {
            int numeroRandom = ((int)(Math.random()*(DiaSemana.values().length)));
            dias[i] = DiaSemana.values()[numeroRandom];
        }
    }

    public static String imprimirDiaLaboral(DiaSemana dia){
        if(dia.esDiaLaboral()){
            return "Es día laboral";

        }else{
            return "No es dia laboral";
        }
    }
}