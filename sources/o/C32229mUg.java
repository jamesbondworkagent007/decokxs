package o;

import com.github.mikephil.charting.formatter.ValueFormatter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mUg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C32229mUg extends ValueFormatter {
    public final float AEQbTJ;
    public final java.util.Map<java.lang.Float, java.lang.String> copydefault;

    public C32229mUg(@NotNull java.util.Map<java.lang.Float, java.lang.String> map, float f) {
        Intrinsics.checkNotNullParameter(map, "");
        this.copydefault = map;
        this.AEQbTJ = f;
    }

    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public java.lang.String getFormattedValue(float f) {
        return f > C33129mqd.djBIcL(java.lang.Float.valueOf(this.AEQbTJ)) ? "" : EZpvd(java.lang.Integer.valueOf(C33129mqd.AhwBna(this.copydefault.get(java.lang.Float.valueOf(f)))));
    }

    public final java.lang.String EZpvd(java.lang.Integer num) {
        kotlin.ranges.IntRange intRange = new kotlin.ranges.IntRange(0, 9);
        if (num != null && intRange.AEQbTJ(num.intValue())) {
            return "0" + num + ":00";
        }
        return num + ":00";
    }
}
