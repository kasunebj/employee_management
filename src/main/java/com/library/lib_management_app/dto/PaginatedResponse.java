package com.library.lib_management_app.dto;

import java.util.List;

public class PaginatedResponse<T> {
    private List<T> results;
    private int pageNumber;
    private int pageSize;
    private long totalItems;

    // Constructor
    public PaginatedResponse(List<T> results, int pageNumber, int pageSize, long totalItems) {
        this.results = results;
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.totalItems = totalItems;
    }

    // Getters and Setters
    public List<T> getResults() {
        return results;
    }

    public void setResults(List<T> results) {
        this.results = results;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(long totalItems) {
        this.totalItems = totalItems;
    }
}

