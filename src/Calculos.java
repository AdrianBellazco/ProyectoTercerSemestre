
import java.util.ArrayList;

public class Calculos {
    
     public int Contador2020(ArrayList<String> dataArrayList, String buscar, int toks) {
    int contador = 0;

    for (String registro : dataArrayList) {
        // Dividir la línea actual en tokens utilizando ';' como separador
        String[] tokens = registro.split(";");

        // Asegurarse de que haya al menos 3 elementos y verificar si el tercer elemento es "M"
        if (tokens.length > 2 &&    buscar.equalsIgnoreCase(tokens[toks])) {
            contador++;
        }
    }

    return contador;
}
}
