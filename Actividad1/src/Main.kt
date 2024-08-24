fun main() {
    val processor = PrimeNumberProcessor(1..50)
    val result = processor.processNumbers()

    result.printAllResults()
}
