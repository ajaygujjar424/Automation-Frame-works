# Automation-Frame-works
steps to create a Maven project in Eclipse in a concise format:

1. **Install Eclipse**: Download and install Eclipse IDE.

2. **Install Maven Integration**: Install "Maven Integration for Eclipse" plugin from Eclipse Marketplace.

3. **Create Project**:
   - Go to `File` > `New` > `Other...`.
   - Choose `Maven` > `Maven Project`.
   - Uncheck "Create a simple project" and click `Next`.
   - Select archetype and click `Next`.
   - Enter `Group ID` and `Artifact ID`, click `Next`.
   - Set project name and location, click `Finish`.

4. **Project Structure**: Eclipse sets up Maven project structure.

5. **Edit `pom.xml`**: Add dependencies in `<dependencies>` section.

6. **Build and Run**:
   - Right-click on project > `Run As` > `Maven build...`.
