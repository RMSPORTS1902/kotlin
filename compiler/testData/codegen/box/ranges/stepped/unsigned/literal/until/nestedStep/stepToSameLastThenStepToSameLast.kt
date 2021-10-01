// Auto-generated by GenerateSteppedRangesCodegenTestData. Do not edit!
// WITH_RUNTIME
import kotlin.test.*

fun box(): String {
    val uintList = mutableListOf<UInt>()
    for (i in 1u until 8u step 3 step 2) {
        uintList += i
    }
    assertEquals(listOf(1u, 3u, 5u, 7u), uintList)

    val ulongList = mutableListOf<ULong>()
    for (i in 1uL until 8uL step 3L step 2L) {
        ulongList += i
    }
    assertEquals(listOf(1uL, 3uL, 5uL, 7uL), ulongList)

    return "OK"
}