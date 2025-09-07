package viikko1;

public class PasswordAttempts {
    public static String login(String[] tries) {
        int attempts = Math.min(3, tries.length);
        for (int i = 0; i < attempts; i++) {
            if (tries[i].equals("java123")) {
                return "Tervetuloa!";
            }
        }
        return "Liian monta virheellistä yritystä.";
    }
}
