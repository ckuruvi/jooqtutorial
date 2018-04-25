import com.database.connect.H2Database;
import org.h2.jdbcx.JdbcConnectionPool;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import java.sql.Connection;
import java.sql.SQLException;

public class MyMainClass {

    public static void main(String[] args) {
        JdbcConnectionPool cp = JdbcConnectionPool.create("jdbc:h2:~/bookstore", "sa", "sa");

        try {
            Connection conn = cp.getConnection();
            DSLContext context = DSL.using(conn, SQLDialect.H2);

            databaseConnectionTest(context);
//            singleTableSelectTest(context);
//            multiQuerySelectTest(context);
//            multiTableJoinTest(context);
//            selectWithSearchConditionTest(context);
//            insertQueryTest(context);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void databaseConnectionTest(DSLContext context) {
        H2Database h2Database = new H2Database();
        h2Database.testConnection(context);

    }

    private static void singleTableSelectTest(DSLContext context) {

    }

    private static void multiQuerySelectTest(DSLContext context) {

    }

    private static void multiTableJoinTest(DSLContext context) {

    }

    private static void selectWithSearchConditionTest(DSLContext context) {

    }

    private static void insertQueryTest(DSLContext context) {

    }










}
