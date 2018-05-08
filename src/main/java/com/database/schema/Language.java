package com.database.schema;

import org.jooq.Field;
import org.jooq.Record;
import org.jooq.Table;

import static org.jooq.impl.DSL.field;
import static org.jooq.impl.DSL.table;

public class Language {

    public static final Table<Record> TABLE = table("language");

    public static final Field<Long> ID = field("language.id", Long.class);
    public static final Field<String> CD = field("language.cd", String.class);
    public static final Field<String> DESCRIPTION = field("language.description", String.class);

}
