package com.example.back.demo.entity.commondata.sql.info;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class OrderInfo implements Serializable  {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    private int customerId;

    private String timestamp;

    private String deliveryStatus;

    private String trackPackageLink;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private AddressInfo addressInfo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private OrderInfo orderInfo;

    public OrderInfo(int customerId, String timestamp, String deliveryStatus, String trackPackageLink, OrderInfo orderInfo) {
        this.customerId = customerId;
        this.timestamp = timestamp;
        this.deliveryStatus = deliveryStatus;
        this.trackPackageLink = trackPackageLink;
        this.orderInfo = orderInfo;
    }
}
