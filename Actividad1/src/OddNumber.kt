class OddNumber(override val value: Int) : IBaseNumber {
    val divisors: List<Int> = calculateDivisors()

    private fun calculateDivisors(): List<Int> {
        val divisors = mutableListOf<Int>()
        for (i in 1..value) {
            if (value % i == 0) divisors.add(i)
        }
        return divisors
    }

    override fun printValue() {
        println("Odd Number: $value, Divisors: $divisors")
    }
}
