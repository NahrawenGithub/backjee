package com.example.back.demo.model.commondata;

import com.example.back.demo.dto.commondata.BrandsAndApparelsDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class HomeTabsDataResponse implements Serializable {

    private BrandsAndApparelsDTO men;
    private BrandsAndApparelsDTO women;
    private BrandsAndApparelsDTO boys;
    private BrandsAndApparelsDTO girls;
    private BrandsAndApparelsDTO essentials;
    private BrandsAndApparelsDTO homeAndLiving;
}