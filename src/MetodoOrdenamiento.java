public class MetodoOrdenamiento {
    


    //Metodo que devuelve u arrelgo
    //de enteros ordenados por burbuja
    public int[] sortBybubble(int[]arreglo){
        ///code to sort


        //obtener el tamaño del arreglo}
        int tamano = arreglo.length;

        //bucle externo que va a recorrer todo el arreglo
        for(int i = 0; i< tamano -1;i++){
            System.out.println("/n pasado el"+i);
        
        //bucle for interno que compara el elemento actual con los siguientes
        for(int j = i+ 1; j< tamano; j ++){
            if(arreglo[i] > arreglo[j]){

                System.out.println("- si es mayor asi que cambio");
                int temporal = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = temporal;
                System.out.print("");
                imprime(arreglo);
                



            }
        }
    }




        return arreglo;
    }


    //3.Metodo que deuelve un arreglo de
    //enteros ordenados por inserccion

    //4: Metodo que imprime un arreglo
    public void imprime(int[] arreglo){
        for(int i = 0; i < arreglo.length; i++){
            System.out.print(arreglo[i] +" ");

        }
        System.out.println();

    }
}
