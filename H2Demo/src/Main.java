import java.io.IOException;
import java.sql.SQLException;

class Main {
    public static void main(String[] args) throws IOException, SQLException {
        ProductManager pm = new ProductManager();
        pm.selectAll();

        // Finally let's insert some data
        // Will use stringBuilder or similar in video to build/map this
        // Main point for both: USE PLACEHOLDERS
        String insertQuery = "INSERT INTO employee " +
                "(uid, name)" +
                " VALUES (?, ?)";
        String[] itemp = {"2555", "The Doctor"};

        pm.insertProd(insertQuery, itemp);
        pm.selectAll();


        // And close our connection at end
        pm.closeCon();
    }
}
