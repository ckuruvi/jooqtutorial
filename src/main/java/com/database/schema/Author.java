package com.database.schema;

import org.jooq.Field;
import org.jooq.Record;
import org.jooq.Table;

import java.sql.Date;

import static org.jooq.impl.DSL.field;
import static org.jooq.impl.DSL.table;

public class Author {

    public static final Table<Record> TABLE = table("author");

    public static final Field<Long> ID = field("author.id", Long.class);
    public static final Field<String> FIRST_NAME = field("author.first_name", String.class);
    public static final Field<String> LAST_NAME = field("author.last_name", String.class);
    public static final Field<Date> DATE_OF_BIRTH = field("author.date_of_birth", Date.class);
    public static final Field<Integer> YEAR_OF_BIRTH = field("author.year_of_birth", Integer.class);
}





