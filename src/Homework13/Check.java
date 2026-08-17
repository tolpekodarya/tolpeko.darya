package Homework13;
public class Check {
    public static boolean validate(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {

        if (login.length() >= 20) {
            throw new WrongLoginException("Login length must be less than 20 characters. Current length: " + login.length());
        }

        if (login.contains(" ")) {
            throw new WrongLoginException("Login must not contain spaces");
        }

        if (password.length() >= 20) {
            throw new WrongPasswordException("Password length must be less than 20 characters. Current length: " + password.length());
        }

        if (password.contains(" ")) {
            throw new WrongPasswordException("Password must not contain spaces");
        }

        if (!password.matches(".*\\d.*")) {
            throw new WrongPasswordException("Password must contain at least one digit");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password and confirmation password do not match");
        }

        return true;
    }
}
