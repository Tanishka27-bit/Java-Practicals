# Experiment 3: JDBC
Run `database.sql` in MySQL Workbench. Download MySQL Connector/J, place the JAR in `lib`, add it to VS Code Referenced Libraries, and change PASSWORD in JdbcDemo.java.
PowerShell example (replace JAR version): `javac -cp "lib\mysql-connector-j-<version>.jar" -d out src\JdbcDemo.java` then `java -cp "out;lib\mysql-connector-j-<version>.jar" JdbcDemo`. Never commit real passwords.
