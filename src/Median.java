import java.sql.Array;

public class Median {

    public int median(int[] array){

        java.util.Arrays.sort(array);
        double arrayLength = array.length;
        double medianIndex;

        if (array.length % 2 != 0)
        {
            return (array.length +1 )/2;
        }
        else
        {
            medianIndex =((( arrayLength/2)+(arrayLength/2)+1))/2;
        }

        return (int) medianIndex;
    }








}
