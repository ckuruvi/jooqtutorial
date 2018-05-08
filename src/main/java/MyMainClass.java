import com.database.connect.H2Database;
import com.insertquery.SingleTableInsert;
import com.searchcriteria.LanguageSearchCriteria;
import com.selectquery.MultiQuerySelect;
import com.selectquery.MultiTableSelect;
import com.selectquery.SelectWithSearchCriteria;
import com.selectquery.SingleTableSelect;
import org.h2.jdbcx.JdbcConnectionPool;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import java.sql.Connection;
import java.sql.SQLException;

public class MyMainClass {

    public static void main(String[] args) {
        JdbcConnectionPool cp = JdbcConnectionPool.create("jdbc:h2:~/bookstore", "sa", "sa");  // creates a connection pool

        try {
            Connection conn = cp.getConnection();  // retrieves connection from the pool
            DSLContext context = DSL.using(conn, SQLDialect.H2);

//            databaseConnectionTest(context);
//            singleTableSelectTest(context);
//            multiQuerySelectTest(context);
//            multiTableJoinTest(context);
//            selectWithSearchConditionTest(context);
            insertQueryTest(context);

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void databaseConnectionTest(DSLContext context) {
        H2Database h2Database = new H2Database();
        h2Database.testConnection(context);

    }

    private static void singleTableSelectTest(DSLContext context) {
        SingleTableSelect singleTableSelect = new SingleTableSelect();
        singleTableSelect.runSingleTableSelectQuery(context);
    }

    private static void multiQuerySelectTest(DSLContext context) {
        MultiQuerySelect multiQuerySelect = new MultiQuerySelect();
        multiQuerySelect.runMultiQuerySelect(context);
    }

    private static void multiTableJoinTest(DSLContext context) {
        MultiTableSelect multiTableSelect = new MultiTableSelect();
        multiTableSelect.runMultiTableSelectQuery(context);

    }

    private static void selectWithSearchConditionTest(DSLContext context) {

        SelectWithSearchCriteria selectWithSearchCriteria = new SelectWithSearchCriteria();
        LanguageSearchCriteria criteria = LanguageSearchCriteria.builder()
                .id(1L)
                .cd("en")
                .description("English")
                .build();
        selectWithSearchCriteria.runQuery(context, criteria);

    }

    private static void insertQueryTest(DSLContext context) {
        SingleTableInsert singleTableInsert = new SingleTableInsert();
        singleTableInsert.runSingleTableInsertQuery(context);

    }










}
