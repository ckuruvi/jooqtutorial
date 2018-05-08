package com.selectquery;

import com.database.schema.Author;
import com.database.schema.Book;
import com.database.schema.Language;
import com.searchcriteria.LanguageSearchCriteria;
import org.jooq.DSLContext;
import org.jooq.Record3;
import org.jooq.Result;

public class SelectWithSearchCriteria {

    public void runQuery(DSLContext context, LanguageSearchCriteria criteria) {

        Result<Record3<String, String, String>> result = context
                .select(Author.FIRST_NAME.concat(" ").concat(Author.LAST_NAME), Book.TITLE, Language.DESCRIPTION)
                .from(Author.TABLE)
                .join(Book.TABLE).on(Book.AUTHOR_ID.eq(Author.ID))
                .join(Language.TABLE).on(Book.LANGUAGE_ID.eq(Language.ID))
                .where(criteria.whereCondition())
                .fetch();

        System.out.println(result);
    }
}
