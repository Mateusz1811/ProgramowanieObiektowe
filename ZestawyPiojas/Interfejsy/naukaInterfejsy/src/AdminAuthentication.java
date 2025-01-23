public class AdminAuthentication implements Authentication {
    private String storedUsername = "admin";
    private String storedPassword = "admin123";

    @Override
    public boolean login(String username, String password) {
        return storedUsername.equals(username) && storedPassword.equals(password);
    }

    @Override
    public void logout() {
        System.out.println("Admin logged out.");
    }

    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword) {
        if (storedUsername.equals(username) && storedPassword.equals(oldPassword)) {
            storedPassword = newPassword;
            System.out.println("Password reset successful.");
            return true;
        }
        System.out.println("Password reset failed.");
        return false;
    }
}