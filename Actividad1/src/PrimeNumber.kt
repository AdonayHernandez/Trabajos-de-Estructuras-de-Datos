class PrimeNumber(override val value: Int) : IBaseNumber {
    override fun printValue() {
        println("Prime Number: $value")
    }
}
