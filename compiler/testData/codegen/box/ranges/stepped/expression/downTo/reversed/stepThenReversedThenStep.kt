// Auto-generated by GenerateSteppedRangesCodegenTestData. Do not edit!
// WITH_RUNTIME
import kotlin.test.*

fun box(): String {
    val intList = mutableListOf<Int>()
    val intProgression = 10 downTo 1
    for (i in (intProgression step 2).reversed() step 3) {
        intList += i
    }
    assertEquals(listOf(2, 5, 8), intList)

    val longList = mutableListOf<Long>()
    val longProgression = 10L downTo 1L
    for (i in (longProgression step 2L).reversed() step 3L) {
        longList += i
    }
    assertEquals(listOf(2L, 5L, 8L), longList)

    val charList = mutableListOf<Char>()
    val charProgression = 'j' downTo 'a'
    for (i in (charProgression step 2).reversed() step 3) {
        charList += i
    }
    assertEquals(listOf('b', 'e', 'h'), charList)

    return "OK"
}