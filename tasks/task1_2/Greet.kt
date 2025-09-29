fun greetingFor(target: String): String {
    val greeting = setOf("Hello", "Hi", "G'Day").random()
    return "$greeting $target!"
}