// Auto-generated by GenerateSteppedRangesCodegenTestData. Do not edit!
// WITH_RUNTIME
// KT-34166: Translation of loop over literal completely removes the validation of step
// DONT_TARGET_EXACT_BACKEND: JS
import kotlin.test.*

fun box(): String {
    assertFailsWith<IllegalArgumentException> {
        for (i in 1 until 8 step -1) {
        }
    }

    assertFailsWith<IllegalArgumentException> {
        for (i in 1L until 8L step -1L) {
        }
    }

    assertFailsWith<IllegalArgumentException> {
        for (i in 'a' until 'h' step -1) {
        }
    }

    return "OK"
}