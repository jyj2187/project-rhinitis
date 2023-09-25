package com.rhinitis.projectrhinitis.dto;

import lombok.Getter;
import org.springframework.data.domain.Page;

import java.util.List;

@Getter
public class MultiResponseDto<T> {
    private List<T> data;
    //private PageInfo pageInfo;

    public MultiResponseDto(List<T> data) {
        this.data = data;
        //this.pageInfo = new PageInfo(page);
    }
}
