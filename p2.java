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
        String v_result;
        String p_enteroLargo = par_enteroLargo.a_enteroLargo;

        Helpers helper = new Helpers();
        String[] v_numIgualados = new String[2];

        v_numIgualados = helper.m_IgualarCharDeNum(a_enteroLargo, p_enteroLargo);
        v_result = helper.m_SumarCharPorChar(v_numIgualados);

        EnteroLargo el_result = new EnteroLargo(v_result);
        return el_result;
    }
}

class Helpers {
    public String[] m_IgualarCharDeNum(String p_num1, String p_num2) {
        String[] v_numIgualados = new String[2];

        if (p_num1.length() == p_num2.length()) {
            p_num2 = "0" + p_num2;
            p_num1 = "0" + p_num1;
        } else if (p_num1.length() > p_num2.length()) {
            int v_diferencia = p_num1.length() - p_num2.length();
            int contador;
            for (contador = 0; contador < v_diferencia; contador++) {
                p_num2 = "0" + p_num2;
            }
        } else if (p_num1.length() < p_num2.length()) {
            int v_diferencia = p_num2.length() - p_num1.length();
            int contador;
            for (contador = 0; contador < v_diferencia; contador++) {
                p_num1 = "0" + p_num1;
            }
        }

        v_numIgualados[0] = p_num1;
        v_numIgualados[1] = p_num2;

        return v_numIgualados;
    }

    public String m_SumarCharPorChar(String[] p_numIgualados) {
        String v_result = "";
        String v_suma;
        int v_numDecimal = 0;
        int contador;
        int v_numChar_1, v_numChar_2;

        for (contador = p_numIgualados[0].length() - 1; contador >= 0; contador -= 1) {

            v_numChar_1 = Character.getNumericValue(p_numIgualados[0].charAt(contador));
            v_numChar_2 = Character.getNumericValue(p_numIgualados[1].charAt(contador));

            v_suma = Integer.toString(v_numDecimal + v_numChar_1 + v_numChar_2);

            if (v_suma.length() > 1) {
                v_result = String.valueOf(v_suma.charAt(1)) + v_result;
                v_numDecimal = Character.getNumericValue(v_suma.charAt(0));
            } else {
                v_result = v_suma + v_result;
                v_numDecimal = 0;
            }

        }

        return v_result;
    }

}