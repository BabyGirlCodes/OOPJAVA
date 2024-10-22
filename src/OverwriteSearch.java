public class OverwriteSearch {
    public static int overWrite(int[] arr, int pos, int value){

//  validation
        if( arr == null)
        {
            throw new IllegalArgumentException("array cannot be null");
        }
        if(pos < 0 || pos > arr.length){
            throw new IndexOutOfBoundsException("position cannot be greater than array ");
        }
         return 0;
    }
}
