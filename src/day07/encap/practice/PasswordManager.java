package day07.encap.practice;

public class PasswordManager {
    private String password;

    PasswordManager(String password) {
        this.password = password;
    }

    /**
     *
     * @param oldPassword - 기존에 사용하던 비밀번호
     * @param newPassword - 새롭게 변경할 비밀번호
     * @return - 변경에 성공하면 true
     */
    public boolean changePassword(String oldPassword, String newPassword) {
        if(password.equals(oldPassword)) {
            this.password = newPassword;
            return true;
        } else {
            return false;
        }
    }
}
