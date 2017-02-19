package db.migration;

import java.sql.Connection;
import java.sql.Statement;

import org.flywaydb.core.api.migration.jdbc.JdbcMigration;

/**
 * @author kawasima
 */
public class V4__CreateSignatureAttribute implements JdbcMigration {
    @Override
    public void migrate(Connection connection) throws Exception {
        try (Statement stmt = connection.createStatement()) {
            stmt.executeUpdate("CREATE TABLE signature_attribute (" +
                    "signature_attribute_id INTEGER NOT NULL PRIMARY KEY," +
                    "campaign_id INTEGER NOT NULL," +
                    "name VARCHAR(30) NOT NULL," +
                    "type VARCHAR(30) NOT NULL" +
                    ")"
            );
        }
    }
}
