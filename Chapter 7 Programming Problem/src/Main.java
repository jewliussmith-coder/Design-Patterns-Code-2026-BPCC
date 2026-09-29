public class Main {
    public static void main(String[] args) {
        LegacyFirewall legacyFirewall = new LegacyFirewall();
        SecurityLog firewall = new FirewallAdapter(legacyFirewall);

        firewall.logEvent("Unauthorized login attempt detected.");
        firewall.setSeverity(5);
    }
}