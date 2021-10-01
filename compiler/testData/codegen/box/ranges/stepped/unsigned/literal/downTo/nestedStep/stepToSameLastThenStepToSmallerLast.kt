// Auto-generated by GenerateSteppedRangesCodegenTestData. Do not edit!
// WITH_RUNTIME
import kotlin.test.*

fun box(): String {
    val uintList = mutableListOf<UInt>()
    for (i in 10u downTo 1u step 3 step 2) {
        uintList += i
    }
    assertEquals(listOf(10u, 8u, 6u, 4u, 2u), uintList)

    val ulongList = mutableListOf<ULong>()
    for (i in 10uL downTo 1uL step 3L step 2L) {
        ulongList += i
    }
    assertEquals(listOf(10uL, 8uL, 6uL, 4uL, 2uL), ulongList)

    return "OK"
}