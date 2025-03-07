README: Singleton & Adapter Patterns

Project Description

This project demonstrates two design patterns:
Singleton – Ensures that only one instance of the configuration manager exists in the system.
Adapter – Allows an outdated chat service to be used in new code without modification.

Project Files

ConfigurationManager.java – Singleton class managing global settings.
ConfigManagerDemo.java – Demonstrates the Singleton in action.
LegacyChatService.java – Legacy chat service.
ChatService.java – Interface for the new chat service.
ChatServiceAdapter.java – Adapter that connects the new and old chat service.
ChatAdapterDemo.java – Demonstrates the Adapter pattern.

Expected Output

ConfigManagerDemo (Singleton)
Maximum number of players: 100
maxPlayers -> 100
defaultLanguage -> en
gameDifficulty -> medium
Shows that ConfigurationManager stores and correctly retrieves settings.
ChatAdapterDemo (Adapter)
Legacy Chat: Hello, world!
Demonstrates that the adapter successfully converts calls to the legacy chat service.

Conclusion
This project illustrates essential architectural solutions:
Singleton ensures that the configuration manager is created only once.
Adapter allows integration with outdated code without modifying it.
