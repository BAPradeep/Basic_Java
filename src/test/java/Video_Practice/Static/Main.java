package Video_Practice.SUBclass.Static;

public class Main {
    public static void main(String[] args) {
        
        // Static = modifier. A single copy of a variable/ method is created and shared.
        //          the class "Owns" the static member

        Friend f1 = new Friend("First");
        Friend f2 = new Friend("Second");
        Friend f3 = new Friend("Third");
        Friend f4 = new Friend("Five");
        Friend f5 = new Friend("Six");
        Friend f6 = new Friend("Seven");

        Friend.displayFriends();
        // both above(16 line) to below(18 line) same output
         System.out.println("You have " +Friend.numberOfFriends+ " Friends");
    }
}
