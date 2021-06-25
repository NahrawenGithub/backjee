package com.example.back.demo.entity.commondata.sql.categories;

import com.example.back.demo.entity.commondata.sql.info.ProductInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class PriceRangeCategory implements Serializable {
    @Id
    private int id;

    private String type;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "priceRangeCategory")
    @JsonIgnore
    private List<ProductInfo> productInfos;

    public PriceRangeCategory(int id, String type) {
        this.id = id;
        this.type = type;
    }
}
