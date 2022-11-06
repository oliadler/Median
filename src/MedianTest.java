public class MedianTest {

    public static void main(String[] args) {

        // Ein neues Objekt der Klasse Median wird erstellt.
        Median medianClass = new Median();

        // Testdurchlauf mit array1
        int[] array1 = {12,16,2,63,55,8};
        int medianIndexArray1 = medianClass.median(array1);

        System.out.println("Der Median für Array1 lautet: "+array1[medianIndexArray1]);

        // Testdurchlauf mit array2
        int [] array2 = {42,7,543,77,87,876,143};
        int medianIndexArray2 = medianClass.median(array2);
        System.out.println("Der Median für Array2 lautet: "+array2[medianIndexArray2]);


    }
}
