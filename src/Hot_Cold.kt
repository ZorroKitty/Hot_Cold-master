

fun main(args: Array<String>) {

    val rand = java.util.Random()
    val n = 1 + rand.nextInt(100)
    var guess = 0
    var numberOfTries = 0

    println("Коть загадал число от 1 до 100. Отгадай его!\n")

    do {
        try {
            guess = readLine()!!.toInt()
            var x = Math.abs(n - guess)
            numberOfTries++

            when (x) {
                in 1..3 -> println("А-а-а! Обжигает!")
                in 4..7 -> println("Горячо!")
                in 8..15 -> println("Тепло")
                in 16..31 -> println("Прохладно!")
                in 32..63 -> println("Холодно")
                in 64..99 -> println("Космический холод!")
                in 100..Int.MAX_VALUE -> println("Вводи числа от 1 до 100! Не балуйся!")
            }

        } catch (e: NumberFormatException) {
            println("Не ломай мою программку!")
        }

        } while (guess != n)

    println("Ура! Аннушка победила отгадала число за $numberOfTries попыток!")
}