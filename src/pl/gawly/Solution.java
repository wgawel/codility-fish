package pl.gawly;

public class Solution {

    public int solution(int[] A, int[] B) {
        int livingFish = A.length;
        System.out.println("-----");
        System.out.println("All: " + livingFish);

        int largestDown = Integer.MIN_VALUE;
        for (int i = A.length - 1; i >= 0; i--) {
            if (B[i] == 0) {
                if (A[i] > largestDown) {
                    largestDown = A[i];
                    System.out.println("Largest fish down: " + largestDown);
                }
            } else {
                if (A[i] < largestDown) {
                    livingFish--;
                    System.out.println("Fish " + A[i] + " die.");
                } else {
                    largestDown = Integer.MIN_VALUE;
                }
            }
        }
        System.out.println("--");

        int largestUp = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            if (B[i] == 1) {
                if (A[i] > largestUp) {
                    largestUp = A[i];
                    System.out.println("Largest fish up: " + largestUp);
                }
            } else {
                if (A[i] < largestUp) {
                    livingFish--;
                    System.out.println("Fish " + A[i] + " die.");
                } else {
                    largestUp = Integer.MIN_VALUE;
                }
            }
        }
        System.out.println("Survive: " + livingFish);
        return livingFish;
    }
}
