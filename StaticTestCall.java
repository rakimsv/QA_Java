class StaticTestCall{
    public static void main(String xyz[]){
        StaticTest Ref = new StaticTest();
        Ref.a = 15;
        StaticTest.Boom();
    }
}