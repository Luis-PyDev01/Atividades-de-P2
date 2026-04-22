public class Exercicio3 {
    public static boolean elementoExiste(String[] array, String busca) {
        for (String elemento : array) {
            if (elemento.equals(busca)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        String[] vetor = {"luis","macarrao","Solaire"};
        String busca = "Solaire";
        String busca1 = "Chuva";
        String busca2 = "solaire";
        System.out.println(elementoExiste(vetor,busca));
        System.out.println(elementoExiste(vetor,busca1));
        System.out.println(elementoExiste(vetor,busca2));


    }
}

