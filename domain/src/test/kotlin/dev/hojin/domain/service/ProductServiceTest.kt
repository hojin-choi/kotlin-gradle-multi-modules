package dev.hojin.domain.service

import dev.hojin.domain.entity.Product
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class ProductServiceTest {

    private val product1 = Product("product1", 10_000.0)
    private val product2 = Product("product2", 20_000.0)
    private val product3 = Product("product3", 30_000.0, true)

    private val service = ProductService()

    @Test
    fun `on sale 상품이 존재할 경우`() {
        val productList = listOf(product1, product2, product3)

        val result = service.nameOfProductsOnSale(productList)
        val expectedResult = product3.name
        assertThat(result, `is`(expectedResult))
    }

    @Test
    fun `on sale 상품이 존재하지 않은 경우`() {
        val productList = listOf(product1, product2)

        val result = service.nameOfProductsOnSale(productList)
        val expectedResult = "none"
        assertThat(result, `is`(expectedResult))
    }
}
