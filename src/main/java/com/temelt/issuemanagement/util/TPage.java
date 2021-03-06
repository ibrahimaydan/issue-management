package com.temelt.issuemanagement.util;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import java.util.List;

public class TPage <I>{
    private int number;
    private int size;
    private Sort sort;
    private int totalPages;
    private Long totalElements;
    private List<I> content;

    public void setStat(Page page,List<I> list){
        this.number=page.getNumber();
        this.size=page.getSize();
        this.sort=page.getSort();
        this.totalPages=page.getTotalPages();
        this.totalElements= page.getTotalElements();
        this.content=list;
    }
}
