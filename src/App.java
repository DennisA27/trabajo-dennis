public class App {
    public static void main(String[] args) throws Exception {
        MetodoOrdenamiento metodoOrdenamiento = new MetodoOrdenamiento();
        int[] numeros = {30,7,32,5,2};

        metodoOrdenamiento.imprime(numeros);

        int[] arregloOrdenado = metodoOrdenamiento.sortBybubble(numeros);
        //mando a imprimir mi nuevo arreglo ya que fue ordenado arregloOrdenadoBubble
        metodoOrdenamiento.imprime(numeros);



        //todo hacer un metodo que elija el metodo
    }
}
