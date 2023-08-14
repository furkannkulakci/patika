public class Main {
    static boolean isFindRepeatingEven(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws Exception {
        int[] list = {5, 7, 5, 8, 8, 5, 27, 19, 27, 25, 10, 10, 27, 17, 25, 1};
        int[] duplicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int k = 0; k < list.length; k++) {
                if ((i != k) && (list[i] == list[k])) {
                    if (list[i] % 2 == 0) {
                        if (!isFindRepeatingEven(duplicate, list[i])) {
                            duplicate[startIndex++] = list[i];
                        }
                        break;
                    }
                }
            }
        }
        for (int val : duplicate) {
            if (val != 0) {
                System.out.println(val);
            }
        }

    }
}