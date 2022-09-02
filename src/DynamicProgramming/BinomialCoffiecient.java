package DynamicProgramming;
//Given two integers n and r, find nCr. Since the answer may be very large, calculate the answer modulo 109+7.


public class BinomialCoffiecient {              // O(n*k) time and O(k) space

    public static int calculate(int n, int r){

        if(r > n)
            return 0;

        if(r==0)
            return 1;

        if(r==1)
            return n;

        if((n-r)<r)
            r=n-r;

        int[] aux = new int[r+1];
        aux[0]=1;
        int mod = (int)Math.pow(10,9)+7;

        for(int i=1; i<=n; i++){

            for(int j= Math.min(i,r); j>0; j--)
                aux[j] = (aux[j] + aux[j-1])%mod ;
        }

        return aux[r];
    }

    public static void main(String[] args) {
        int n=45 , r = 34;

        int ans = calculate(n,r);

        System.out.println(ans);

    }
}
