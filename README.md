# Lumenfall (Fabric, Minecraft 1.21.1)

Étape 1 : Éclat (item), Minerai d'Éclat (deepslate, lumineux), Bloc d'Éclatite, onglet créatif.

## Lancer le mod
Prérequis : JDK 21.
1. Génère le wrapper Gradle une fois : `gradle wrapper --gradle-version 8.10.2`
   (ou copie `gradlew`, `gradlew.bat` et le dossier `gradle/` d'un projet généré sur https://fabricmc.net/develop/template).
2. `./gradlew runClient` pour tester en jeu, `./gradlew build` pour obtenir le .jar dans `build/libs/`.

Si une version est introuvable, mets à jour `gradle.properties` avec les valeurs de https://fabricmc.net/develop/.
