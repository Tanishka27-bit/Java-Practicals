import java.sql.*;

public class JdbcDemo {
    static final String URL = "jdbc:mysql://localhost:3306/college", USER = "root", PASSWORD = "CHANGE_ME";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection c = DriverManager.getConnection(URL, USER, PASSWORD)) {
                System.out.println("Database connected");
                try (PreparedStatement p = c.prepareStatement("INSERT INTO student(id,name,branch) VALUES(?,?,?)")) {
                    p.setInt(1, 101);
                    p.setString(2, "Rahul");
                    p.setString(3, "CSE");
                    try {
                        p.executeUpdate();
                        System.out.println("Inserted");
                    } catch (SQLIntegrityConstraintViolationException e) {
                        System.out.println("ID 101 already exists; skipping insert");
                    }
                }
                try (Statement s = c.createStatement();
                        ResultSet r = s.executeQuery("SELECT id,name,branch FROM student ORDER BY id")) {
                    while (r.next())
                        System.out.printf("%d | %s | %s%n", r.getInt(1), r.getString(2), r.getString(3));
                }
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Add MySQL Connector/J JAR to classpath");
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
