package ArraysProblem;

public class RearrangeNegative {

    public static void main(String[] args) {
        int[] arr = new int[] {-12, 11, -13, -5, 6, -7, 5, -3, -6};

        if(arr.length>1) {
            doWork(arr);
        }

        for(int i=0; i<arr.length; i++)
            System.out.println(arr[i]);
    }

    public static void doWork(int[]a){

        int j=0;
        while(true){
            if(a[j]<0)
                j++;
            else
                break;
        }

        for(int i=j+1; i<a.length; i++){
            if(a[i]<0){
                int temp = a[j];
                a[j]=a[i];
                a[i]=temp;
                j++;
            }
        }
    }
}
