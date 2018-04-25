package com.database.connect;

import org.jooq.DSLContext;

public class H2Database {

    public void testConnection(DSLContext context) {

        System.out.println(context.selectOne().fetch());   // SELECT 1 FROM DUAL
    }
}
