public class Day13_FlipImage {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] arr = new int[image.length][image[0].length];

        int[][] reversedArray = new int[image.length][];

        for (int i = 0; i < image.length; i++) {
            int len = image[i].length;
            reversedArray[i] = new int[len];
            int index = len - 1;

            for (int j = 0; j < len; j++) {
                reversedArray[i][j] = image[i][index];
                index--;
            }
        }

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                if (reversedArray[i][j]==0){
                    arr[i][j]=1;
                }
                else{
                    arr[i][j]=0;
                }
            }
        }
        return arr;
    }
}
