package dev.hojin.domain.service

import dev.hojin.domain.entity.Product

class ProductService {
    fun nameOfProductsOnSale(productList: List<Product>): String {
        return productList.filter { it.onSale }
            .map { it.name }
            .joinToString(separator = ", ")
            .ifEmpty { "none" }
    }
}
