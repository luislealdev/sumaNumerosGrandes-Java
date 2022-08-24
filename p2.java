import java.util.Scanner;
public class p2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int v_casosPrueba = sc.nextInt();
        EnteroLargo arr_result[] = new EnteroLargo[v_casosPrueba];
        int contador;

        for (contador = 0; contador < v_casosPrueba; contador++) {
            EnteroLargo el1 = new EnteroLargo(sc.next());
            EnteroLargo el2 = new EnteroLargo(sc.next());

            arr_result[contador] = el1.m_calcSuma(el2);
        }

        for (contador = 0; contador < v_casosPrueba; contador++) {
            System.out.println(arr_result[contador].a_enteroLargo);
        }

    }
}

class EnteroLargo {
    String a_enteroLargo;

    EnteroLargo(String p_enteroLargo) {
        a_enteroLargo = p_enteroLargo;
    }

    public EnteroLargo m_calcSuma(EnteroLargo par_enteroLargo) {
        String v_result = "";
        String v_suma;
        int v_numDecimal = 0;
        String p_enteroLargo = par_enteroLargo.a_enteroLargo;

        int v_num_a_enteroLargo, v_num_p_enteroLargo;

        if (a_enteroLargo.length() > p_enteroLargo.length()) {
            int v_diferencia = a_enteroLargo.length() - p_enteroLargo.length();
            int contador;
            for (contador = 0; contador < v_diferencia; contador++) {
                p_enteroLargo = "0" + p_enteroLargo;
            }
        }

        if (a_enteroLargo.length() < p_enteroLargo.length()) {
            int v_diferencia = p_enteroLargo.length() - a_enteroLargo.length();
            int contador;
            for (contador = 0; contador < v_diferencia; contador++) {
                a_enteroLargo = "0" + a_enteroLargo;
            }
        }

        int contador;
        for (contador = a_enteroLargo.length() - 1; contador >= 0; contador -= 1) {

            v_num_a_enteroLargo = Character.getNumericValue(a_enteroLargo.charAt(contador));
            v_num_p_enteroLargo = Character.getNumericValue(p_enteroLargo.charAt(contador));

            v_suma = Integer.toString(v_numDecimal + v_num_a_enteroLargo + v_num_p_enteroLargo);

            if (v_suma.length() > 1) {
                v_result = String.valueOf(v_suma.charAt(1)) + v_result;

                v_numDecimal = Character.getNumericValue(v_suma.charAt(0));

            } else {
                v_result = v_suma + v_result;
                v_numDecimal = 0;
            }

        }

        EnteroLargo el_result = new EnteroLargo(v_result);
        return el_result;
    }
}