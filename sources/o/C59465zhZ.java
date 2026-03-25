package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zhZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59465zhZ {
    public static java.util.concurrent.TimeUnit AEQbTJ(@NotNull DurationUnit durationUnit) {
        Intrinsics.checkNotNullParameter(durationUnit, "");
        return durationUnit.getTimeUnit$kotlin_stdlib();
    }

    public static final double AEQbTJ(double d, @NotNull DurationUnit durationUnit, @NotNull DurationUnit durationUnit2) {
        Intrinsics.checkNotNullParameter(durationUnit, "");
        Intrinsics.checkNotNullParameter(durationUnit2, "");
        long jConvert = durationUnit2.getTimeUnit$kotlin_stdlib().convert(1L, durationUnit.getTimeUnit$kotlin_stdlib());
        return jConvert > 0 ? d * jConvert : d / durationUnit.getTimeUnit$kotlin_stdlib().convert(1L, durationUnit2.getTimeUnit$kotlin_stdlib());
    }

    public static final long OLrzqt(long j, @NotNull DurationUnit durationUnit, @NotNull DurationUnit durationUnit2) {
        Intrinsics.checkNotNullParameter(durationUnit, "");
        Intrinsics.checkNotNullParameter(durationUnit2, "");
        return durationUnit2.getTimeUnit$kotlin_stdlib().convert(j, durationUnit.getTimeUnit$kotlin_stdlib());
    }

    public static final long AEQbTJ(long j, @NotNull DurationUnit durationUnit, @NotNull DurationUnit durationUnit2) {
        Intrinsics.checkNotNullParameter(durationUnit, "");
        Intrinsics.checkNotNullParameter(durationUnit2, "");
        return durationUnit2.getTimeUnit$kotlin_stdlib().convert(j, durationUnit.getTimeUnit$kotlin_stdlib());
    }
}
