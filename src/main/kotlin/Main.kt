package ru.netology

fun main() {

    agoToText(12345)

}

fun agoToText(timeSeconds: Int) {

    when (timeSeconds) {
        in 0..60 -> println("был(а) только что")

        in 61..(60 * 60) -> timeMinutes(timeSeconds)

        in (60 * 60) + 1..24 * (60 * 60) -> timeHours(timeSeconds)

        in 24 * (60 * 60) + 1..48 * (60 * 60) -> println("был(а) вчера")

        in 48 * (60 * 60) + 1..72 * (60 * 60) -> println("был(а) позавчера")

        else -> println("был(а) давно")

    }
}


fun timeMinutes(timeSeconds: Int): Int {
    val timeMinutes = timeSeconds / 60
    when (timeMinutes) {
        1, 21, 31, 41, 51 -> println("был(а) $timeMinutes минуту назад")
        2, 22, 32, 42, 52, 3, 23, 33, 43, 53, 4, 24, 34, 44, 54 -> println("был(а) $timeMinutes минуты назад")
        else -> println("был(а) $timeMinutes минут назад")

    }
    return timeMinutes

}

fun timeHours(timeSeconds: Int): Int {
    val timeHours = (timeSeconds / 60) / 60
    when (timeHours) {
        1, 21 -> println("был(а) $timeHours час назад")
        2, 3, 4, 22, 23, 24 -> println("был(а) $timeHours часа назад")
        else -> println("был(а) $timeHours часов назад")
    }
    return timeHours
}


