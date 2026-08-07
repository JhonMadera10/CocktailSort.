public class CocktailSort {

    public static void cocktailSort(int[] arreglo) {

        boolean intercambio = true;
        int inicio = 0;
        int fin = arreglo.length - 1;

        while (intercambio) {

            intercambio = false;

            // Recorrido de izquierda a derecha
            for (int i = inicio; i < fin; i++) {

                if (arreglo[i] > arreglo[i + 1]) {

                    int aux = arreglo[i];
                    arreglo[i] = arreglo[i + 1];
                    arreglo[i + 1] = aux;

                    intercambio = true;
                }
            }

            if (!intercambio) {
                break;
            }

            intercambio = false;
            fin--;

            // Recorrido de derecha a izquierda
            for (int i = fin - 1; i >= inicio; i--) {

                if (arreglo[i] > arreglo[i + 1]) {

                    int aux = arreglo[i];
                    arreglo[i] = arreglo[i + 1];
                    arreglo[i + 1] = aux;

                    intercambio = true;
                }
            }

            inicio++;
        }
    }

    public static void main(String[] args) {

        int[] arreglo = {8, 4, 2, 7, 1};

        System.out.println("Arreglo original:");

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }

        cocktailSort(arreglo);

        System.out.println("\n\nArreglo ordenado:");

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }
}