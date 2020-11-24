public class BinarySearch {
    static int[] list = {1, 5, 10, 22, 44, 45, 60, 100};

    static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (high - low) / 2;
            if (key < list[mid]) {
                high = mid - 1;
            } else if (key == list[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        System.out.println(binarySearch(list, 1));
        System.out.println(binarySearch(list, 2));
        System.out.println(binarySearch(list, 22));
        System.out.println(binarySearch(list, 60));
        System.out.println(binarySearch(list, 44));

    }
}
