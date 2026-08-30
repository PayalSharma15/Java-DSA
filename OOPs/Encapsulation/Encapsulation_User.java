package Encapsulation;

public class Encapsulation_User {

    private int userId;
    private String username;
    private String password;

    // Getter and Setter for userId
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    // Getter and Setter for username
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Setter for password
    public void setPassword(String password) {
        if (password != null && password.length() >= 8) {
            this.password = password;
            System.out.println("Password set successfully");
        } else {
            System.out.println("Password must contain at least 8 characters");
        }
    }

    // Password ko directly return nahi kar rahe
    public boolean checkPassword(String password) {
        return this.password != null && this.password.equals(password);
    }

    // Display user details
    public void displayDetails() {
        System.out.println("User ID: " + userId);
        System.out.println("Username: " + username);
        System.out.println("Password: ********");
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {

        Encapsulation_User user1 =
                new Encapsulation_User();

        user1.setUserId(101);
        user1.setUsername("Payal");

        user1.setPassword("java1234");

        user1.displayDetails();

        // Checking password
        if (user1.checkPassword("java1234")) {
            System.out.println("Password is correct");
        } else {
            System.out.println("Password is incorrect");
        }

        // Testing invalid password
        user1.setPassword("123");
    }
}