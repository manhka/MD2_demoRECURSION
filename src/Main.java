public class Main {
    public void sayHI( int n){
        if (n==0){
            System.out.println("DONE!");
        }else {
            System.out.println("hello WUYNH");
            n--;
            sayHI(n);
        }
    }

    public static void main(String[] args) {
      Main main=new Main();
      main.sayHI(5);
    }

}
