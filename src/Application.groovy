class Application {
    static void main(String[] args) {
        capitalizeStephan("stephan")
    }

    def static capitalizeStephan(String value1) {
        println(value1)
        println(value1)
        println("1: $value1")
        println("2: ${value1}")
        println("3: $value1".capitalize()) // schöne kleine Stolperfalle
        println("4: ${value1.capitalize()}")
    }
}