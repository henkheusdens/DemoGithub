public class TestGithub {

    public static void main(String[] args) {
        System.out.println("Test met Github");
    }
    public static void doStuff(){
        System.out.println("method doStuff called by method featureZ ");
    }
    private static void featureZ() {
        doStuff();
    }

}
