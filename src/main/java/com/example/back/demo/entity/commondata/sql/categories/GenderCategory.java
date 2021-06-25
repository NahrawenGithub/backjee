package com.example.back.demo.entity.commondata.sql.categories;

import com.example.back.demo.entity.commondata.sql.images.ApparelImages;
import com.example.back.demo.entity.commondata.sql.info.ProductInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class GenderCategory implements Serializable {
    @Id
    private int id;

    private String type;

    @OneToMany(mappedBy = "genderCategory")
    @JsonIgnore
    private List<ProductInfo> productInfos;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "genderCategory")
    @JsonIgnore
    private List<ApparelImages> apparelImages;

    public GenderCategory(int id, String type) {
        this.id = id;
        this.type = type;
    }
}
