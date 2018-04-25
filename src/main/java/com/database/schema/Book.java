package com.database.schema;

import org.jooq.Field;
import org.jooq.Record;
import org.jooq.Table;

import static org.jooq.impl.DSL.field;
import static org.jooq.impl.DSL.table;

public class Book {

    public static final Table<Record> TABLE = table("book");

    public static final Field<Long> ID = field("book.id", Long.class);
    public static final Field<Long> AUTHOR_ID = field("book.author_id", Long.class);
    public static final Field<Long> LANGUAGE_ID = field("book.language_id", Long.class);
    public static final Field<Integer> PUBLISHED_IN = field("book.published_in", Integer.class);
    public static final Field<String> TITLE = field("book.title", String.class);
}


