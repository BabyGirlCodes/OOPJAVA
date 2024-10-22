public class resizeDelete {
    public static int[] resize(int [] array, int pos, int value){
        if (array == null){
            throw new IllegalArgumentException("array cannnot be null");
        }
        if(pos < 0 || pos> array.length){
            throw new IndexOutOfBoundsException("the position cannot be greater than the array");
        }

        int tracker = 0;
        int [] resized = new int[array.length+1];
        for (int i = 0; i < pos; i++) {
            array[i] = resized[tracker];
            tracker++;
        }
        tracker++;

        for (int i = pos; i < array.length ; i++) {
            array[i] = resized[tracker];
            tracker++;
        }
        resized[pos] = value;
        return resized;
    }
}
