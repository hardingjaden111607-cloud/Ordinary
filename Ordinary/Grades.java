import java.util.Scanner;

public class Grades {

    static Scanner scnr = new Scanner(System.in);

    public static int[] readGrades() {
        int[] temp = new int[100];
        int count = 0;

        while (true) {
            System.out.println("Enter a grade : ");

            if (!scnr.hasNextInt()) {
                break;
            }

            int grade = scnr.nextInt();

            if (grade == -1) {
                break;
            }

            temp[count++] = grade;
        }

        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = temp[i];
        }

        return arr;
    }

    public static int sum(int[] arr) {
        int total = 0;
        for (int num : arr) total += num;
        return total;
    }

    // ✅ FIXED
    public static int sum(int[] arr, int firstIndex, int lastIndex) {
        if (arr == null || arr.length == 0 ||
            firstIndex < 0 || firstIndex >= arr.length ||
            lastIndex < 0 || lastIndex >= arr.length ||
            firstIndex > lastIndex) {
            return 0;
        }

        int total = 0;
        for (int i = firstIndex; i <= lastIndex; i++) {
            total += arr[i];
        }
        return total;
    }

    public static double average(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    public static int maxValue(int[] arr) {
        int max = arr[0];
        for (int num : arr) if (num > max) max = num;
        return max;
    }

    // ✅ FIXED
    public static int maxValue(int[] arr, int firstIndex, int lastIndex) {
        if (arr == null || arr.length == 0 ||
            firstIndex < 0 || firstIndex >= arr.length ||
            lastIndex < 0 || lastIndex >= arr.length ||
            firstIndex > lastIndex) {
            return Integer.MIN_VALUE;
        }

        int max = arr[firstIndex];
        for (int i = firstIndex; i <= lastIndex; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }

    public static int indexOfFirstMaxValue(int[] arr) {
        int max = arr[0], index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static int minValue(int[] arr) {
        int min = arr[0];
        for (int num : arr) if (num < min) min = num;
        return min;
    }

    // ✅ FIXED
    public static int minValue(int[] arr, int firstIndex, int lastIndex) {
        if (arr == null || arr.length == 0 ||
            firstIndex < 0 || firstIndex >= arr.length ||
            lastIndex < 0 || lastIndex >= arr.length ||
            firstIndex > lastIndex) {
            return Integer.MAX_VALUE;
        }

        int min = arr[firstIndex];
        for (int i = firstIndex; i <= lastIndex; i++) {
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }

    public static int indexOfFirstMinValue(int[] arr) {
        int min = arr[0], index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static int numberOfBelowAverageElements(int[] arr) {
        double avg = average(arr);
        int count = 0;
        for (int num : arr) if (num < avg) count++;
        return count;
    }

    public static int numberOfAboveAverageElements(int[] arr) {
        double avg = average(arr);
        int count = 0;
        for (int num : arr) if (num > avg) count++;
        return count;
    }

    public static void rotateElements(int[] arr) {
        int last = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
    }

    public static void rotateElements(int[] arr, int rotationCount) {
        for (int i = 0; i < rotationCount; i++) {
            rotateElements(arr);
        }
    }

    public static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        while (true) {
            int[] grades = readGrades();

            if (grades.length == 0) break;

            System.out.println("Number Of Grades = " + grades.length);
            System.out.println("Maximum Grade = " + maxValue(grades));
            System.out.println("Minimum Grade = " + minValue(grades));
            System.out.println();
        }
    }
}