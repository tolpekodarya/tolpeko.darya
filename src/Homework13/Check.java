package Homework13;

public class Check {
        public static boolean validate(String login, String password, String confirmPassword) {
            try {
                if (login.length() >= 20 || login.contains(" ")) {
                    return false;
                }

                if (password.length() >= 20 || password.contains(" ") || !password.matches(".*\\d.*")) {
                    return false;
                }

                if (!password.equals(confirmPassword)) {
                    return false;
                }

                return true;

            } catch (Exception e) {
                return false;
            }
        }
    }
