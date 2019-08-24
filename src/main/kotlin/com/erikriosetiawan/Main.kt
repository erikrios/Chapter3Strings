package com.erikriosetiawan

fun main() {
    var str1 = "Hello, World!"
    var str2 = "Hello," + " World!"
    println(str1 == str2)

    str1 = """
        |Hello, World!
    """.trimMargin()

    str2 = """
        #Hello, World!
    """.trimMargin("#")

    val str3 = str1

    println(str1 == str2)
    println(str1 === str2)
    println(str1 === str3)
}