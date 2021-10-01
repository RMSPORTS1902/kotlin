// Auto-generated by GenerateSteppedRangesCodegenTestData. Do not edit!
// WITH_RUNTIME
import kotlin.test.*

fun box(): String {
    val uintList = mutableListOf<UInt>()
    val uintProgression = 5u downTo 1u
    for (i in uintProgression step 2 step 1) {
        uintList += i
    }
    assertEquals(listOf(5u, 4u, 3u, 2u, 1u), uintList)

    val ulongList = mutableListOf<ULong>()
    val ulongProgression = 5uL downTo 1uL
    for (i in ulongProgression step 2L step 1L) {
        ulongList += i
    }
    assertEquals(listOf(5uL, 4uL, 3uL, 2uL, 1uL), ulongList)

    return "OK"
}