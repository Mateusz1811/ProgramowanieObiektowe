public class AuthenticationTest {
    public static void main(String[] args) {
        // Tworzymy obiekty UserAuthentication i AdminAuthentication
        Authentication userAuth = new UserAuthentication();
        Authentication adminAuth = new AdminAuthentication();

        // Testujemy logowanie dla użytkownika
        System.out.println("User login test:");
        System.out.println("Login successful: " + userAuth.login("user", "password123")); // Oczekiwane: true
        System.out.println("Login failed: " + userAuth.login("user", "wrongPassword")); // Oczekiwane: false

        // Testujemy logowanie dla administratora
        System.out.println("\nAdmin login test:");
        System.out.println("Login successful: " + adminAuth.login("admin", "admin123")); // Oczekiwane: true
        System.out.println("Login failed: " + adminAuth.login("admin", "wrongPassword")); // Oczekiwane: false

        // Testujemy resetowanie hasła dla użytkownika
        System.out.println("\nUser reset password test:");
        System.out.println("Reset successful: " + userAuth.resetPassword("user", "password123", "newPassword123")); // Oczekiwane: true
        System.out.println("Reset failed: " + userAuth.resetPassword("user", "wrongPassword", "newPassword123")); // Oczekiwane: false

        // Testujemy resetowanie hasła dla administratora
        System.out.println("\nAdmin reset password test:");
        System.out.println("Reset successful: " + adminAuth.resetPassword("admin", "admin123", "newAdminPassword123")); // Oczekiwane: true
        System.out.println("Reset failed: " + adminAuth.resetPassword("admin", "wrongPassword", "newAdminPassword123")); // Oczekiwane: false

        // Testujemy wylogowanie
        System.out.println("\nLogging out:");
        userAuth.logout(); // Oczekiwane: "User logged out."
        adminAuth.logout(); // Oczekiwane: "Admin logged out."
    }
}