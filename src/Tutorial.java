public class Tutorial {
    public static void main(String[] args) {
      Contact.contacts.add(new Contact("panashe@gmail.com","1234567"));
      Contact.contacts.add(new Contact("munashe@gmail.com","1234567"));
      Contact.contacts.add(new Contact("tinashe@gmail.com","1234567"));
      Contact.contacts.add(new Contact("anash@gmail.com@gmail.com","1234567"));
      System.out.print("..Welcome to my contact Manager...");
        System.out.print("You have" + Contact.contacts.size()+"contacts is your list...");

    }
}
