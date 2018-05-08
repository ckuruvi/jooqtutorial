package com.selectquery;

import com.database.schema.Language;
import com.dto.LanguageDTO;
import org.jooq.DSLContext;

import java.util.List;


public class SingleTableSelect {

    public void runSingleTableSelectQuery(DSLContext context) {

        List<LanguageDTO> result = context.select(
                Language.ID.as("id"),
                Language.CD.as("cd"),
                Language.DESCRIPTION.as("description"))
                .from(Language.TABLE)
                .fetch()
                .into(LanguageDTO.class);
         // SELECT id, cd, description FROM LANGUAGE
        System.out.println(result);

    }
}
