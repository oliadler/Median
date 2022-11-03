public class MedianTest {

    public static void main(String[] args) {

        Median medianClass = new Median();

        int[] array1 = {12,16,2,63,55,8};
        int medianIndexArray1 = medianClass.median(array1);

        System.out.println("Der Median lautet: "+array1[medianIndexArray1]);

        int [] array2 = {42,7,543,77,87,876,143};
        int medianIndexArray2 = medianClass.median(array2);
        System.out.println("Der Median lautet: "+array2[medianIndexArray2]);


    }
}
