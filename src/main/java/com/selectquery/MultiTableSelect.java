package com.selectquery;

import com.database.schema.Author;
import com.database.schema.Book;
import com.database.schema.Language;
import org.jooq.DSLContext;
import org.jooq.Record3;
import org.jooq.Result;

public class MultiTableSelect {

    public void runMultiTableSelectQuery(DSLContext context) {

        Result<Record3<String, String, String>> result = context
                .select(Author.FIRST_NAME.concat(" ").concat(Author.LAST_NAME), Book.TITLE, Language.DESCRIPTION)
                .from(Author.TABLE)
                .join(Book.TABLE).on(Book.AUTHOR_ID.eq(Author.ID))
                .join(Language.TABLE).on(Book.LANGUAGE_ID.eq(Language.ID))
                .fetch();

        System.out.println(result);
    }
}
