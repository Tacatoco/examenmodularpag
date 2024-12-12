import java.time.Year;
import java.util.Scanner;

//EMPIEZA EL PROGRAMA//
public class Main {
    public static void main(String[] args) {
        char valorusu = 'a';
        menu(valorusu);
    }

//FUNCION DEL MENU//
    public static void menu (char valorusu){
        Scanner scanner = new Scanner(System.in);
        boolean salirwhile = true;
        System.out.println("(a) Mayores de edad");
        System.out.println("(b) Calculadora de ingresos de canal de Youtube");
        System.out.println("(c) Cálculo horario");
        System.out.println("(d) Salir");
        System.out.println();

        //WHILE PARA SABER LA ELECCIÓN DEL USUARIO//
        while (salirwhile) {
            valorusu = scanner.next().charAt(0);
            switch (valorusu) {
                case 'a': {
                    int cantidadedad;
                    int cantidadmayores;
                    System.out.println("HAS SELECCIONADO (MAYORES DE EDAD)");
                    System.out.println();
                    System.out.println("INTRODUCE LA CANTIDAD DE EDADES QUE QUIERES COMPROBAR");
                    System.out.println();

                    cantidadedad = scanner.nextInt();
                    cantidadmayores = mayoresedad(cantidadedad);

                    System.out.println("LA CANTIDAD DE MAYORES DE EDAD ES: " + cantidadedad);

                    break;
                }

                case 'b': {
                    double visitas = 0;
                    int tematica = 0;
                    double sumatotal;
                    double todosumado;
                    double sumatotaldevideos = 0;
                    System.out.println("HAS SELECCIONADO (CALCULADORA DE INGRESOS A CANAL DE YOUTUBE)");
                    System.out.println("EL DINERO TOTAL ES: " + sumaglobalvideos(sumatotaldevideos));
                    break;
                }

                case 'c': {
                    System.out.println("HAS SELECCIONADO (CÁLCULO HORARIO)");

                    break;
                }

                case 'd': {
                    System.out.println("HAS SELECCIONADO (SALIR)");
                    salirwhile = false;
                    break;

                }
            }
        }

    }

//FUNCION PARA CALCULAR SI SON MAYORES DE EDAD//
    public static int mayoresedad (int cantidadedad){
        Scanner scanner = new Scanner(System.in);
        int anousu;
        int contadormayores = 0;
        int anoactual = Year.now().getValue();
        System.out.println("INTRODUCE LOS AÑOS DE NACIMIENTO");

        for (int i = 0 ; i < cantidadedad ; i++){
             anousu = scanner.nextInt();
            if ((anoactual - anousu) >= 18){
                contadormayores++;
            }
        }
        return contadormayores;
    }

//FUNCION PARA CALCULAR LOS INGRESOS//
    public static double calcularingresos (double visitas, int tematica) {
        Scanner scanner = new Scanner(System.in);
        boolean comprobacionswitch = true;
        double porcentaje = 0;
        double ingresostotales = 0;
        double sumatotal;

            System.out.println("INTRODUCE LA CANTIDAD DE VISITAS DEL VIDEO");
            visitas = scanner.nextInt();
                System.out.println();
                System.out.println("Y AHORA INTRODUCE LA TEMÁTICA:");
                System.out.println("ASMR -> 1, DEPORTES -> 2, ANIMALES -> 3, TECNOLOGIA-> 4  BEBES-> 5");
                tematica = scanner.nextInt();
                    switch (tematica) {
                        case 1: {
                            porcentaje = 0.1;
                            comprobacionswitch = false;
                            break;
                        }
                        case 2: {
                            porcentaje = 1;
                            comprobacionswitch = false;
                            break;
                        }
                        case 3: {
                            porcentaje = 0.2;
                            comprobacionswitch = false;
                            break;
                        }
                        case 4, 5: {
                            porcentaje = 0.5;
                            comprobacionswitch = false;
                            break;
                        }
                    }
                sumatotal = (visitas * porcentaje) / 1000;
        return sumatotal;
    }

//FUNCION PARA CALCULAR LA SUMA TOTAL DE LOS VIDEOS//
public static double sumaglobalvideos (double sumatotaldevideos){
    Scanner scanner = new Scanner(System.in);
    boolean salirusu = true;
    double visitas = 0;
    int tematica = 0;

//WHILE PARA SABER SI EL USUARIO QUIERE SEGUIR CALCULANDO//
    while (salirusu) {
        System.out.println("PARA SEGUIR CALCULANDO PULSA 1, PARA SALIR PULSA 2");
        int elecusu = scanner.nextInt();
        if (elecusu == 1) {
            sumatotaldevideos = sumatotaldevideos + calcularingresos(visitas, tematica);
        } else {
            salirusu = false;
        }
    }
return sumatotaldevideos;
}

}

