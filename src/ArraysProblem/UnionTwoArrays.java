package ArraysProblem;

//Arrays may contain duplicate elements and return count for elements of union of two arrays

import java.util.Arrays;

public class UnionTwoArrays {

    public static void main(String[] args) {
        int n = 6, m=5;
        int[]a = new int[] {1,3,2,2,3,1};
        int[]b = new int[] {8,9,7,6,5};

        int count = doUnion(a,n, b, m);
        System.out.println(count);
    }

    public static int doUnion(int a[], int n, int b[], int m)
    {
        Arrays.sort(a);
        Arrays.sort(b);

        int count=0,i=0,j=0;

        for(i=0,j=0; i<n&&j<m;){

            if(i!=0 && a[i]==a[i-1]){
                i++;
                continue;
            }
            if(j!=0 && b[j]==b[j-1]){
                j++;
                continue;
            }

            if(a[i]<b[j]){
                count++;
                i++;
            }
            else if(b[j]<a[i]){
                count++;
                j++;
            }
            else{
                i++;
                j++;
                count++;
            }
        }

        if(i<n){
            for(int k=i; k<n; k++){
                if(k!=0 && a[k]==a[k-1])
                    continue;
                else
                    count++;
            }
        }
        else{
            for(int k=j; k<m; k++){
                if(k!=0 && b[k]==b[k-1])
                    continue;
                else
                    count++;
            }
        }

        return count;
    }
}
