package userMethods;
class User {
        String name;
        String password;
        int idUser;
        boolean isAdmin;

        public User(String name, String password, int idUser, boolean isAdmin) {
            this.name = name;
            this.password = password;
            this.idUser = idUser;
            this.isAdmin = isAdmin;
        }

        @Override
        public String toString() {
            return name + " (ID: " + idUser + ", Admin: " + isAdmin + ")";
        }
    }
public class CreateUser {
    public static void main(String[] args) {
        // User user1 = new User("Alice", "Saturno2", 1, true);
    }
}
