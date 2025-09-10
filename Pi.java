public class Pi {
    public static void main(String[] args){
        double n_out = 0;
        double n_in = 0;
        for (int i = 0;i<100000000;i++){
            double x = Math.random();
            double y = Math.random();
            if((Math.sqrt(x*x+y*y))>1){
                n_out++;
            }
            else{
                n_in++;
            }
        }
        System.out.println(n_in/(n_in+n_out)*4);
    }    
}
