package com.searchcriteria;

import com.database.schema.Language;
import lombok.Builder;
import lombok.Data;
import org.jooq.Condition;
import org.jooq.impl.DSL;
import org.jooq.tools.StringUtils;

@Data
@Builder
public class LanguageSearchCriteria {

    private Long id;
    private String cd;
    private String description;


 public Condition whereCondition() {
     Condition condition = DSL.trueCondition();  // 1 = 1

     if(!StringUtils.isEmpty(getDescription())) {
         condition = condition.and(Language.DESCRIPTION.equalIgnoreCase(getDescription()));

     }
     System.out.println(condition);
     return condition;

 }

}
