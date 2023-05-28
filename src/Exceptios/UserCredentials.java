package Exceptios;

public class UserCredentials {

    public static boolean checkUserCredentials(String login, String password, String confirmPassword) {


        public static void checkLogin () throws WrongLoginException {
            if (login.length() >= 20 && login.contains(" ")) {
                throw new WrongLoginException();
            }
        }

        public static void checkPassword () throws WrongPasswordException {
            if (password.length() >= 20 || password.contains(" ") ||
        !password.contains("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
        }
    }
}
