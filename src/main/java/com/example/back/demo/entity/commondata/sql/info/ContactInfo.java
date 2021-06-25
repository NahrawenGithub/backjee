package com.example.back.demo.entity.commondata.sql.info;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class ContactInfo {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    private String email;

    private String office;

    private String mobile;

    private String other;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "contactInfo")
    @JsonIgnore
    private List<BankInfo> banks;

    public ContactInfo(String email, String office, String mobile, String other) {
        this.email = email;
        this.office = office;
        this.mobile = mobile;
        this.other = other;
    }
}
