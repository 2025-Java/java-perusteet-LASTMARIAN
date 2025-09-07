package viikko1;

public class PasswordAttempts {
    public static String login(String[] tries) {
        for (int i = 0; i < 3; i++) {
            if (tries[i].equals("java123")) {
                return "Tervetuloa!";
            }
        }
        return "Liian monta virheellistä yritystä.";
    }
}
