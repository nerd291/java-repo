public class ThisDemo {
    int a;
    int b;

    public void setData(int a, int b){
        //this is used because the compiler gets confused with the local and public a and b
        this.a = a;
        this.b = b;
    }

    public void showData(){
        System.out.println("Value of A = "+a);
        System.out.println("Value of B = "+b);
    }

    public static void main(String[] args){
        ThisDemo obj = new ThisDemo();
        obj.setData(2,3);
        obj.showData();
    }
}
