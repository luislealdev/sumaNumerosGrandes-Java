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

    }
}

class EnteroLargo {
    String a_enteroLargo;

    EnteroLargo(String p_enteroLargo) {
        a_enteroLargo = p_enteroLargo;
    }

    public EnteroLargo m_calcSuma(EnteroLargo p_enteroLargo) {
        String v_result = "";
        int contador;

        if (a_enteroLargo.length() >= p_enteroLargo.a_enteroLargo.length()) {
            for (contador = 0; contador < p_enteroLargo.a_enteroLargo.length(); contador++) {
                char v_num_a_enteroLargo =a_enteroLargo.charAt(contador);
                System.out.println(Character.getNumericValue(v_num_a_enteroLargo));
                // int v_num_p_enteroLargo = p_enteroLargo.a_enteroLargo.charAt(contador);

            }
        } else {
            for (contador = 0; contador < a_enteroLargo.length(); contador++) {

            }
        }

        EnteroLargo el_result = new EnteroLargo(v_result);
        return el_result;
    }
}