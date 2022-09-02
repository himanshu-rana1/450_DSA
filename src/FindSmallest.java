import java.util.*;

public class FindSmallest {

    public static void main(String[] args) {

        int ans2 = solution(998);

        System.out.println(ans2);
    }

    public static int solution(int N) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        while(N>0){
            int temp = N%10;
            list.add(0,temp);
            N=N/10;
        }

        ans.add(0, list.get(0));

        for(int i=1; i<list.size(); i++){

            int temp = list.get(i);
            int put =temp+1;
            if(i!=1)
                put =0;



                while(ans.contains(put))
                    put++;

                if(put<10)
                    ans.add(put);

                else{
                    put= put %10;

                    int carry =1;
                    int j = ans.size()-1;

                    while(carry==1){
                        if(j!=0){
                            int aux = ans.get(j)+1;
                            ans.set(j, aux);
                            carry=0;
                            if(aux>=10){
                                aux = aux%10;
                                carry=1;
                                ans.set(j, aux);
                            }
                        }
                        else{
                            int aux = ans.get(j)+1;
                            carry=0;
                            if(aux>=10){
                                ans.set(0,aux%10);
                                ans.add(0,1);
                            }
                            else
                                ans.set(j, aux);
                        }
                    }

                    if(ans.contains(put)){
                        while(ans.contains(put))
                            put++;

                        ans.add(put);
                    }
                }
            }
        int res=0;

        for(int i= 0; i<ans.size(); i++){
            res = res*10 + ans.get(i);
        }



        return res;
    }

}
