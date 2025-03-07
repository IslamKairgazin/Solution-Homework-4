import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private Map<String, String> config;

    private ConfigurationManager() {
        config = new HashMap<>();
        config.put("maxPlayers", "150");
        config.put("defaultLanguage", "en");
        config.put("gameDifficulty", "medium");
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public String getConfig(String key) {
        return config.getOrDefault(key, "Не найдено");
    }

    public void printAllConfigs() {
        for (String key : config.keySet()) {
            System.out.println(key + " -> " + config.get(key));
        }
    }
}
