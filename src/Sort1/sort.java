package Sort1;

public class sort {
    public static void main(String arges[]) {
        int a[] = {10, 4, 1, 3, 2, 5, 7, 9, 8}, i, j;
        for (i = 0; i <= 8; i++) {
            for (j = 0; j < 8-i; j++) {
                if (a[j] > a[j+1]) {
                   int temp = a[j];
                   a[j] = a[j+1];
                   a[j+1] = temp;
                }
            }


       }

        for (i = 0; i <= 8; i++) {
            System.out.print(a[i]);
        }
    }
}
