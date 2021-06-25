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
public class ApparelCategory implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    private String type;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "apparelCategory")
    @JsonIgnore
    private List<ProductInfo> productInfos;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "apparelCategory")
    @JsonIgnore
    private List<ApparelImages> apparelImages;

    public ApparelCategory(String type) {
        this.type = type;
    }
}
