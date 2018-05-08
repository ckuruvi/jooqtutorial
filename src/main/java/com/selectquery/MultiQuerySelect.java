package com.selectquery;

import com.database.schema.Book;
import com.database.schema.Language;
import org.jooq.DSLContext;
import org.jooq.Field;
import org.jooq.Record;
import org.jooq.Result;

import static org.jooq.impl.DSL.select;

public class MultiQuerySelect {

    private static Field<Long> LANGUAGE_ID = select(Language.ID)
            .from(Language.TABLE)
            .where(Language.DESCRIPTION.equalIgnoreCase("English"))
            .asField();

    public void runMultiQuerySelect(DSLContext context) {

        Result<Record> result = context.select()
                .from(Book.TABLE)
                .where(Book.LANGUAGE_ID.eq(LANGUAGE_ID))
                .fetch();

        System.out.println(result);

    }
}
