package com.example.back.demo.dto.commondata;

import com.example.back.demo.entity.commondata.sql.info.ProductInfo;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProductInfoDTO implements Serializable {

    private Long totalCount;
    private List<ProductInfo> products;
}