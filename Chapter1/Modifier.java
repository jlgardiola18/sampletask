package Chapter1;

public class Modifier {
    private String admin = "admin";
    private String password = "*****";
    private String email = "admin@admin.com";
    public static void main(String[] args) {
      Modifier myObj = new Modifier();
      System.out.println("Name: " + myObj.admin);
      System.out.println("Email: " + myObj.email);
      System.out.println("Password: " + myObj.password);
    }
  }
  