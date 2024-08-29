package enums;

public enum DiaSemana {
    LUNES,
    MARTES,
    MIERCOLES,
    JUEVES,
    VIERNES,
    SABADO,
    DOMINGO;

    public boolean esDiaLaboral(){
        switch (this){
            case LUNES,MARTES,MIERCOLES,JUEVES,VIERNES:
                return true;
            default:
                return false;
        }
    }



}
