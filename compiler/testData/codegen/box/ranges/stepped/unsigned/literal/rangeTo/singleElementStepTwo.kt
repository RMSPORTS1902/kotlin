// Auto-generated by GenerateSteppedRangesCodegenTestData. Do not edit!
// WITH_RUNTIME
import kotlin.test.*

fun box(): String {
    val uintList = mutableListOf<UInt>()
    for (i in 1u..1u step 2) {
        uintList += i
    }
    assertEquals(listOf(1u), uintList)

    val ulongList = mutableListOf<ULong>()
    for (i in 1uL..1uL step 2L) {
        ulongList += i
    }
    assertEquals(listOf(1uL), ulongList)

    return "OK"
}