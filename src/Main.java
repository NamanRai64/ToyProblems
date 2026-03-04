public class Main {
    
    public static int power(int n, int m){
        if(m == 0){
            return 1;
        }
        else{
            return n*power(n, m-1);
        }
    }
    
    public static void main(String[] args) {
        int a = 2;
        System.out.println(power(a,5));
    }
}