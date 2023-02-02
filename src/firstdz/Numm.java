package firstdz;

public class Numm {
    public int n;
    public int sum = 0;
     public Numm(int n){
         setN(n);

     }
    public int getN() {
        return n;
    }
    public void setN(int n) {
        this.n = n;
    }
    public int intput(int n){
         int k = 1;
         for(int i = 1; i <= n; i++){
             sum += k;
             System.out.print(k + " ");
             k += 2;

         } return sum;
    }
}
