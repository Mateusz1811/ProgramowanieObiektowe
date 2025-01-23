public class UserAuthentication implements Authentication{

    private String storedUsername = "User";
    private String storedPassword = "Password";



    @Override
    public boolean login(String username, String password) {
        return storedUsername.equals(username) && storedPassword.equals(password);
    }

    @Override
    public void logout(){
        System.out.println("User logged out");
    }

    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword){
        if(storedUsername.equals(username) && storedPassword.equals(oldPassword)){
            storedPassword = newPassword;
            System.out.println("Password changed");
            return true;
        }
        System.out.println("Password change failed");
        return false;
    }

}
