public class TestGithub {

    public static void main(String[] args) {
        System.out.println("Test met Github");
    }
    public static void doStuff(){
        System.out.println("method doStuff called by methods featureY and featureZ ");
    }
  private static void featureY() {
        doStuff();
    }
        private static void featureZ() {
   doStuff();
    }
}
