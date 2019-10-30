package uni.kiel;

public class QuickSort {
    public static void sort(Comparable[] a){
        sort(a,0,a.length-1);
    }
    private static void sort(Comparable[]a,int low, int high){
        if (high<=low)return;
        int j = partition(a, low, high);
        sort(a,low,j-1);
        sort(a,j+1,high);
    }

    private static int partition(Comparable[] a, int low, int high) {
        int i = low;
        int j = high+1;
        Comparable pivot = a[low];

        while (true){
            while (less(a[++i], pivot)) if(i==high) break;
            while (less(pivot,a[--j])) if(j==low) break;
            if(i>=j) break;
            swap(a,i,j);

        }
        swap(a,low,j);
        return j;
    }

    private static boolean less(Comparable u, Comparable v){
        return u.compareTo(v) < 0;
    }

    private static void swap(Comparable[] a, int i, int j){
        Comparable temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }


}
