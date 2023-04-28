package com.fullcycle.admin.catalogo.domain.pagination;

public record Searchquery(
        int page,
        int perPage,
        String terms,
        String sort,
        String direction
) {
}
