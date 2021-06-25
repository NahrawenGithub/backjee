package com.example.back.demo.service.commondata.interfaces;

import com.example.back.demo.dto.commondata.ProductInfoDTO;
import com.example.back.demo.entity.commondata.sql.info.ProductInfo;
import com.example.back.demo.model.commondata.FilterAttributesResponse;
import com.example.back.demo.model.commondata.HomeTabsDataResponse;
import com.example.back.demo.model.commondata.MainScreenResponse;
import com.example.back.demo.model.commondata.SearchSuggestionResponse;

import java.util.HashMap;
import java.util.List;

public interface CommonDataService {

    MainScreenResponse getHomeScreenData(String apiName);

    FilterAttributesResponse getFilterAttributesByProducts(String queryParams);

    ProductInfoDTO getProductsByCategories(String queryParams);

    HashMap<Integer, ProductInfo> getProductsById(String queryParams);

    HomeTabsDataResponse getBrandsAndApparelsByGender(String apiName);

    SearchSuggestionResponse getSearchSuggestionList();
}

