public class App {
    public static void main(String[] args) {
       System.out.printf("Total cost %d; quantity is %d\n", 5, 200);
       System.out.printf("Total cost %10d; quantity is %d\n", 5, 200);
       System.out.printf("Total cost %-10d; quantity is %d\n", 5, 200);
       
       for(int i = 0; i < 20; i++) {
    	   System.out.printf("%2d: some text here\n", i);
       }
    }
}
