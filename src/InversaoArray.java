public class InversaoArray {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'd', 'e'};

        System.out.println("Array original:");
        for (char c : array) {
            System.out.print(c + " ");
        }
        System.out.println();

        inverterArray(array);

        System.out.println("Array invertido:");
        for (char c : array) {
            System.out.print(c + " ");
        }
    }

    public static void inverterArray(char[] array) {
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            char temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }
    }
}