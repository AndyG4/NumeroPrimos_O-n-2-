
public class Mains
{
	public static void main(String[] args) {
	    long time1 = System.nanoTime();
	    
		for (int i = 1;i<1000 ;i++ ){
		    int divisores = 0;
		    for(int j = 1; j<1000;j++){
		        if(i%j==0){
		            divisores++;
		        }
		    }
		    if(divisores==2){
		            System.out.print(i+" ");
		        }
		}
		long time2 = System.nanoTime();
		double seconds = (time2-time1)/1000000000.0;
		System.out.println();
		System.out.println("seconds: "+seconds);
	}
}
