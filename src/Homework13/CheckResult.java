package Homework13;
public class CheckResult {
    public static void main(String[] args) {
        try {
            System.out.println("1: " + Check.validate("user",
                                                      "pass123",
                                                       "pass123"));
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("1: false - " + e.getMessage());
        }
        try {
            System.out.println("2: " + Check.validate("verylongloginmorethan20chars",
                    "pass123",
                    "pass123"));
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("2: false - " + e.getMessage());
        }
        try {
            System.out.println("3: " + Check.validate("username",
                    "pass123",
                    "pass123"));
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("3: false - " + e.getMessage());
        }
        try {
            System.out.println("4: " + Check.validate("u4ser34637", "password4634737", "password3754737"));
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("4: false - " + e.getMessage());
        }
        try {
            System.out.println("5: " + Check.validate("user", "pass123", "pass123"));
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("5: false - " + e.getMessage());
        }
        try {
            System.out.println("6: " + Check.validate("usdser35211", "pzdbzdass123", "pdsdgass456"));
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("6: false - " + e.getMessage());
        }
        try {
            System.out.println("7: " + Check.validate("user", "verylongpasswordmorethan20chars", "Password42352"));
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("7: false - " + e.getMessage());
        }
    }
}