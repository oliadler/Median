
public class Median {

    public int median(int[] array){

        // Überprüfung, ob das array eventuell leer ist.

        if (array == null || array.length == 0)
        {
            System.out.println("Das Array ist leer.");
        }

        // array wird sortiert.
        java.util.Arrays.sort(array);
        // array Länge wird in eine Variable geschrieben.
        double arrayLength = array.length;
        double medianIndex;

        if (array.length % 2 != 0)
        {
            // Formel zur Berechnung des Medians bei einer ungeraden Anzahl von Elementen im Array
            return (array.length +1 )/2;
        }
        else
        {   // Formel zur Berechnung des Medians bei einer geraden Anzahl von Elementen im Array
            medianIndex =((( arrayLength/2)+(arrayLength/2)+1))/2;
        }

        return (int) medianIndex;
    }








}
