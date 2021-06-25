package com.example.back.demo.model.commondata;

import com.example.back.demo.dto.commondata.SearchSuggestionForThreeAttrDTO;
import com.example.back.demo.dto.commondata.SearchSuggestionForTwoAttrDTO;
import com.example.back.demo.entity.commondata.sql.categories.ApparelCategory;
import com.example.back.demo.entity.commondata.sql.categories.GenderCategory;
import com.example.back.demo.entity.commondata.sql.categories.ProductBrandCategory;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SearchSuggestionResponse implements Serializable {
    List<GenderCategory> genderKeywords;
    List<ProductBrandCategory> brandKeywords;
    List<ApparelCategory> apparelKeywords;
    List<SearchSuggestionForTwoAttrDTO> genderApparelKeywords;
    List<SearchSuggestionForTwoAttrDTO> genderBrandKeywords;
    List<SearchSuggestionForTwoAttrDTO> apparelBrandKeywords;
    List<SearchSuggestionForThreeAttrDTO> threeAttrKeywords;
    List<String> productKeywords;


}
