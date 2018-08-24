import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.mysql.cj.jdbc.Driver;

public class MySQLAdsDao implements Ads {

    private Connection connection;

    public MySQLAdsDao(Config config) {


        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(config.getUrl(), config.getUser(), config.getPassword());
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    @Override
    public List<Ad> all() {

        List<Ad> output = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery("SELECT * FROM adlister_db.ads");

            while (rs.next()) {

                output.add(new Ad(rs.getLong("id"),rs.getLong("user_id") ,rs.getString("title"),rs.getString("description") ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return output;
    }

    @Override
    public Long insert(Ad ad) {

        try {
            Statement statement = connection.createStatement();

            statement.executeUpdate("INSERT INTO adlister_db.ads(user_id, title, description) VALUES (1, '" + ad.getTitle() + "', '" + ad.getDescription() + "')");

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
