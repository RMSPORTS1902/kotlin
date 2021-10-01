// Auto-generated by GenerateSteppedRangesCodegenTestData. Do not edit!
// WITH_RUNTIME
import kotlin.test.*

fun box(): String {
    val uintList = mutableListOf<UInt>()
    val uintProgression = 8u downTo 1u
    for (i in uintProgression step 2 step 3) {
        uintList += i
    }
    assertEquals(listOf(8u, 5u, 2u), uintList)

    val ulongList = mutableListOf<ULong>()
    val ulongProgression = 8uL downTo 1uL
    for (i in ulongProgression step 2L step 3L) {
        ulongList += i
    }
    assertEquals(listOf(8uL, 5uL, 2uL), ulongList)

    return "OK"
}