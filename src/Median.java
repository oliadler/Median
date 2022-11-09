
public class Median {

    public int median(int[] array){

        // Ueberpruefung, ob das array eventuell leer ist.

        if (array == null || array.length == 0)
        {
            System.out.println("Das Array ist leer.");
            System.exit(0);
        }

        // array wird sortiert.
        java.util.Arrays.sort(array);
        // array Länge wird in eine Variable geschrieben.
        int arrayLength = array.length;


        if (array.length % 2 != 0)
        {
            // Formel zur Berechnung des Medians bei einer ungeraden Anzahl von Elementen im Array
            return array[(array.length)/2];
        }
        else
        {   // Formel zur Berechnung des Medians bei einer geraden Anzahl von Elementen im Array
            return (array[(arrayLength/2)]+ array[((arrayLength/2)-1)])/2;
        }
    }








}
