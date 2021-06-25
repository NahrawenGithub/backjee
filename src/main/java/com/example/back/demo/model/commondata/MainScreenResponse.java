package com.example.back.demo.model.commondata;

import com.example.back.demo.dto.commondata.ApparelImagesDTO;
import com.example.back.demo.dto.commondata.BrandImagesDTO;

import com.example.back.demo.entity.commondata.sql.images.CarouselImages;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class MainScreenResponse implements Serializable {

    private List<BrandImagesDTO> brands;
    private List<ApparelImagesDTO> apparels;
    private List<CarouselImages> carousels;

    public MainScreenResponse(List<BrandImagesDTO> brands,
                              List<ApparelImagesDTO> apparels,
                              List<CarouselImages> carousels) {
        this.brands = brands;
        this.apparels = apparels;
        this.carousels = carousels;
    }
}
