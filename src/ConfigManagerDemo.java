public class ConfigManagerDemo {
    public static void main(String[] args) {
        ConfigurationManager configManager = ConfigurationManager.getInstance();
        System.out.println("Максимальное число игроков: " + configManager.getConfig("maxPlayers"));
        configManager.printAllConfigs();
    }
}
