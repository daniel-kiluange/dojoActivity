package service

import data.Product
import usecase.DiscountCalculatorUseCase
import java.math.BigDecimal

class DiscountCalculatorCalculator : DiscountCalculatorUseCase {
    override suspend fun applyDiscount(product: Product): BigDecimal {
        TODO()
    }
}