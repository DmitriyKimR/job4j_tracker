package ru.job4j.exceptions;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User user = null;
        for (User find : users) {
            if (user == null) {
                throw new UserNotFoundException("User not found");
            }
            if (login.equals(find.getUsername())) {
                user = find;
                break;
            }
        }
        return user;
    }

    public static boolean validate(User user) throws UserInvalidException {
        boolean val = false;
        if (user == null || user.getUsername().length() < 3) {
            throw new UserInvalidException("User not valid");
        }
        if (user != null && user.getUsername().length() > 3) {
            val = true;
        }
        return val;
    }

    public static void main(String[] args) {
        User[] users = {new User("Petr Arsentev", true)};
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (
                UserInvalidException ui) {
            ui.printStackTrace();
        } catch (
                UserNotFoundException ue) {
            ue.printStackTrace();
        }
    }
}
