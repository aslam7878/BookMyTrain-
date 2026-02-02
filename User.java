public class User {
    private String username;
    private String password;
    private  String fullName;
  //  private  String Email;

    private String contact ;

    public User(String username, String password, String fullName,String contact ) {
        this.username =username;
        this.fullName = fullName;
       // this.Email = email;
        this.password = password;
        this.contact = contact;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName (String fullName) {
        this.fullName = fullName;
    }

  /*  public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }
*/
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getcontact() {
        return contact;
    }

    public void setcontact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "User{" +
                "username =" +username  +
                ", name='" + fullName + '\'' +
             //   ", Email='" + Email + '\'' +
                ", password='" + password + '\'' +
                ", contact=" + contact +
                '}';
    }
}
