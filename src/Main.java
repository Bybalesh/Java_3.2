public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int Myservice = service.myIndex(98,1.87);
        System.out.println(Myservice);
    }
}