package dev.hojin.domain.entity

data class Product(val name: String, var price: Double, var onSale: Boolean = false)
