package com.spring.samplespringproject.models.request;

import java.util.List;

import com.spring.samplespringproject.models.DatatableColumn;
import com.spring.samplespringproject.models.DatatableOrder;
import com.spring.samplespringproject.models.DatatableSearch;

public class ReqDatatableParam {

    private int draw;
    private List<DatatableColumn> columns;
    private List<DatatableOrder> order;
    private int start;
    private int length;
    private DatatableSearch search;

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public List<DatatableColumn> getColumns() {
        return columns;
    }

    public void setColumns(List<DatatableColumn> columns) {
        this.columns = columns;
    }

    public List<DatatableOrder> getOrder() {
        return order;
    }

    public void setOrder(List<DatatableOrder> order) {
        this.order = order;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public DatatableSearch getSearch() {
        return search;
    }

    public void setSearch(DatatableSearch search) {
        this.search = search;
    }

}
