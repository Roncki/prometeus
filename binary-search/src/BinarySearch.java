
public class BinarySearch {

    public static void main(String[] args) {
        int data[] = { 3, 6, 7, 10, 34, 56, 60 };
        int numberToFind = 10;

        int length = data.length;
        int first = 0;
        int last = length - 1;
        int position;
        int item = numberToFind;

        position = (first + last) / 2;
        while ((data[position] != item) && (first <= last)) {
            if (data[position] > item) {
                last = position - 1;
            } else {
                first = position + 1;
            }
            position = (first + last) / 2;
        }
        if (first <= last) {
            System.out.println(position);
        } else {
            System.out.println(-1);
        }
    }
}
