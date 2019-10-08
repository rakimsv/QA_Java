class FriendApp{
    public static void main(String[]args){
        Greeting g = new Greeting();
        Person friend = new Friend();
        Person enemy = new Enemy();
        g.greeting(friend);
    }
}