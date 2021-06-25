package com.example.back.demo.entity.commondata.sql.info;

import com.example.back.demo.entity.commondata.sql.categories.ApparelCategory;
import com.example.back.demo.entity.commondata.sql.categories.GenderCategory;
import com.example.back.demo.entity.commondata.sql.categories.PriceRangeCategory;
import com.example.back.demo.entity.commondata.sql.categories.ProductBrandCategory;
import com.fasterxml.jackson.annotation.*;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(indexes = {@Index(columnList = "gender_id, apparel_id, brand_id, price")})
public class ProductInfo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int sellerId;

    private String name;

    @Temporal(TemporalType.DATE)
    private Date publicationDate;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private ProductBrandCategory productBrandCategory;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "gender_id")
    @JsonIgnore
    private GenderCategory genderCategory;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "apparel_id")
    @JsonIgnore
    private ApparelCategory apparelCategory;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "price_id")
    @JsonIgnore
    private PriceRangeCategory priceRangeCategory;

    private double price;

    private int availableQuantity;

    private float ratings;

    private boolean verificationStatus;

    private String imageLocalPath;

    @OneToMany(mappedBy = "orderInfo")
    @JsonIgnore
    private List<OrderInfo> orders;

    private String imageURL;

    public ProductInfo(int sellerId, String name, Date publicationDate, ProductBrandCategory productBrandCategory,
                       GenderCategory genderCategory, ApparelCategory apparelCategory,
                       PriceRangeCategory priceRangeCategory,
                       double price, int availableQuantity, int deliveryTime, float ratings,
                       boolean verificationStatus, String imageLocalPath, String imageURL) {
        this.sellerId = sellerId;
        this.name = name;
        this.publicationDate = publicationDate;
        this.productBrandCategory = productBrandCategory;
        this.genderCategory = genderCategory;
        this.apparelCategory = apparelCategory;
        this.priceRangeCategory = priceRangeCategory;
        this.price = price;
        this.availableQuantity = availableQuantity;
        this.ratings = ratings;
        this.verificationStatus = verificationStatus;
        this.imageLocalPath = imageLocalPath;
        this.imageURL = imageURL;
    }
}
