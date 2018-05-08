package com.insertquery;

import com.database.schema.Book;
import org.jooq.DSLContext;

import static org.jooq.impl.DSL.field;

public class SingleTableInsert {

    public void runSingleTableInsertQuery(DSLContext context) {

       context.insertInto(Book.TABLE, field("id"), Book.AUTHOR_ID, Book.LANGUAGE_ID, Book.PUBLISHED_IN, Book.TITLE)
               .values(5L, 2L, 1L, 1990, "Alchemist")
               .execute();

        System.out.println(context.select().from(Book.TABLE).fetch());
    }
}
