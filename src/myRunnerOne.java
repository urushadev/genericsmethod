public class myRunnerOne {
    public static void main(String[] args) {
        GMultipleDataType<String, Integer> mObj= new GMultipleDataType<>("Per Scholas",11025 );
        System.out.println(mObj.getValue());
        System.out.println(mObj.getValue1());

        GMultipleDataType<String, String> mobj2 =new GMultipleDataType<>("Per Scholas","Non-profit");
        System.out.println(mobj2.getValue());
        System.out.println(mobj2.getValue1());
    }
}
