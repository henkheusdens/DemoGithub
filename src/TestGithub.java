public class TestGithub {

    public static void main(String[] args) {
        System.out.println("Test met Github");
    }
    public static void doStuff(){
        System.out.println("methode doStuff called by featureY ");
    }
    private static void featureY() {
        doStuff();
    }

}
