import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String calza = "calza";
        Boolean flag = false;

        for (String elemento : esploraLista()) {
            if (elemento.equalsIgnoreCase(calza)) {
                flag = true;
            }
            } if (flag == true) {
                System.out.println("Nella lista c'è una calza");
            } else {
                System.out.println("Nella lista non c'è una calza");
            }
    }

        public static HashSet<String> esploraLista () {
            HashSet<String> lista = new HashSet<String>();
            lista.add("calzini");
            lista.add("sedie");
            lista.add("cenere");
            return lista;
        }
}
