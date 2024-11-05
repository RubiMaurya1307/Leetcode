class Solution {
    public int[][] imageSmoother(int[][] img) {
        return smoothImage(img);
    }
    
    private int[][] smoothImage(int[][] image) {
        
        int[][] smoothedImage = new int[image.length][];

        for (int row = 0; row < image.length; row++) {

            smoothedImage[row] = new int[image[row].length];

            for (int col = 0; col < image[0].length; col++) {
                
                smoothedImage[row][col] = getSmoothedPixelValue(row, col, image);
            }
        }
        
        return smoothedImage;
    }

    private int getSmoothedPixelValue(int row, int col, int[][] image) {

        int sum = 0;
        int pixelCount = 0;

        for (int i = col - 1; i <= col + 1; i++) {

            if (isWithinBounds(i, image[row].length)) {continue;}

            for (int j = row - 1; j <= row + 1; j++) {

                if (isWithinBounds(j, image.length)) {continue;}

                sum += image[j][i];
                pixelCount++;
            }
        }

        return sum / pixelCount;
    }

    private boolean isWithinBounds(int value, int limit) {
        return value < 0 || value >= limit;
    }

}