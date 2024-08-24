data class EvaluationResult(
    val primes: List<PrimeNumber>,
    val odds: List<OddNumber>,
    val evens: List<EvenNumber>
) {
    fun printAllResults() {
        primes.forEach { it.printValue() }
        odds.forEach { it.printValue() }
        evens.forEach { it.printValue() }
    }
}
