import java.util.Scanner;

public class MyMain {
    
    public static int binaryToDecimal(String binary) {
        int krumsicle=Integer.parseInt(binary);
        String bucket=binary;
        int meerkat=0;
        for (int i=0; i<bucket.length(); i++){
            if (krumsicle%10==1){
                meerkat+=Math.pow(2,i);
            }
            else{
                meerkat+=0;
            }
            krumsicle/=10;
        }
        //meerkat meerkat krummy buckets but no? ugh why won't it push throughhhh
        return meerkat;
    }
    
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Gimme binary number: ");
        String binary=scan.nextLine();
        System.out.println("That is equivalent to: "+binaryToDecimal(binary));
    }
}
