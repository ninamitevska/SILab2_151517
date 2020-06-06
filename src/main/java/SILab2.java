import java.util.List;

class User {
    String username;
    String password;
    String email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}

public class SILab2 {

    public static boolean function (User user, List<String> allUsers) {
        //1
        String specialCharacters="!#$%&'()*+,-./:;<=>?@[]^_`{|}";
        if (user!=null) { //2
            if (user.getUsername()!=null && user.getPassword()!=null) {   //3
                //4
                String password = user.getPassword();
                String passwordLower = password.toLowerCase();

                if (!passwordLower.contains(user.getUsername().toLowerCase()) && password.length()>=8) { //5
                    //6
                    boolean digit = false, upper = false, special = false;
                    for (int i=0;i<password.length();i++) { //7
                        if (Character.isDigit(password.charAt(i))) // 8
                            digit = true;//9
                        if (Character.isUpperCase(password.charAt(i))) //10
                            upper = true; //11
                        if (specialCharacters.contains(String.valueOf(password.charAt(i)))) //12
                            special = true; //13
                    }
                    if (digit && upper && special) //14
                        return true; //15
                }
            }
        }
        return false; //16
    }
}