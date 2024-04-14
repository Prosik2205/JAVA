public class App {
    void cocktailSort(int a[]) {
        boolean swapped = true;
        int start = 0;
        int end = a.length;

        while (swapped == true) {
            swapped = false;

            for (int i = start; i < end - 1; ++i) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    swapped = true;
                }
            }

            if (swapped == false)
                break;

            swapped = false;

            end = end - 1;

            for (int i = end - 1; i >= start; i--) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    swapped = true;
                }
            }

            start = start + 1;
        }
    }
    public static void main(String[] args) throws Exception {
        App cs = new App();
        int a[] = {5, 1, 4, 2, 8, 0, 2};
        cs.cocktailSort(a);
        System.out.println("Sorted array:");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }
    }

