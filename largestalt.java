public class largestalt {
    public static int lalt(int[] gain) {
        int[] alt = new int[gain.length + 1];
        alt[0] = 0;
        for (int i = 1; i < alt.length; i++) {
            alt[i] = alt[i - 1] + gain[i - 1];
        }
        int max = 0;
        for (int i = 0; i < alt.length; i++) {
            if (alt[i] > max) {
                max = alt[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7};
        int soln = lalt(gain);
        System.out.println("Highest Altitude: " + soln);
    }
}