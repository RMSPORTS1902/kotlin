// Auto-generated by GenerateSteppedRangesCodegenTestData. Do not edit!
// WITH_RUNTIME
import kotlin.test.*

fun box(): String {
    assertFailsWith<IllegalArgumentException> {
        for (i in 1u until 8u step 0 step 2) {
        }
    }

    assertFailsWith<IllegalArgumentException> {
        for (i in 1uL until 8uL step 0L step 2L) {
        }
    }

    return "OK"
}