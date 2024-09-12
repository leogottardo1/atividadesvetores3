import java.util.Arrays;
import java.util.Collections;

public class Atividade03 {
    public static void main(String[] args) {

        Integer[] valores = {5, 10};

        valores[0] = 5;
        valores[1] = 10;

        Arrays.sort(valores, Collections.reverseOrder());

        System.out.println(Arrays.toString(valores));

    }
}
