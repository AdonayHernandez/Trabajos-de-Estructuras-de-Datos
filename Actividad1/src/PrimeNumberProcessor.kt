class PrimeNumberProcessor(private val range: IntRange) {

    fun processNumbers(): EvaluationResult {
        val primes = mutableListOf<PrimeNumber>()
        val odds = mutableListOf<OddNumber>()
        val evens = mutableListOf<EvenNumber>()

        for (number in range) {
            when (validateNumber(number)) {
                NumberType.PRIME -> primes.add(PrimeNumber(number))
                NumberType.EVEN -> evens.add(EvenNumber(number))
                NumberType.ODD -> odds.add(OddNumber(number))
            }
        }

        return EvaluationResult(primes, odds, evens)
    }

    private fun validateNumber(number: Int): NumberType {
        if (number < 2) return NumberType.ODD // Por definición, los números menores a 2 no son primos

        // Verificar si el número es par
        if (number % 2 == 0) return NumberType.EVEN

        // Verificar si el número es primo
        for (i in 2..number / 2) {
            if (number % i == 0) return NumberType.ODD
        }
        return NumberType.PRIME
    }
}
