// KJS_WITH_FULL_RUNTIME
// Auto-generated by org.jetbrains.kotlin.generators.tests.GenerateRangesCodegenTestData. DO NOT EDIT!
// WITH_RUNTIME


val MaxUI = UInt.MAX_VALUE
val MaxUL = ULong.MAX_VALUE

fun box(): String {
    val list1 = ArrayList<UInt>()
    val range1 = (MaxUI - 2u)..MaxUI
    for (i in range1) {
        list1.add(i)
        if (list1.size > 23) break
    }
    if (list1 != listOf<UInt>(MaxUI - 2u, MaxUI - 1u, MaxUI)) {
        return "Wrong elements for (MaxUI - 2u)..MaxUI: $list1"
    }

    val list2 = ArrayList<ULong>()
    val range2 = (MaxUL - 2u)..MaxUL
    for (i in range2) {
        list2.add(i)
        if (list2.size > 23) break
    }
    if (list2 != listOf<ULong>(MaxUL - 2u, MaxUL - 1u, MaxUL)) {
        return "Wrong elements for (MaxUL - 2u)..MaxUL: $list2"
    }

    return "OK"
}
