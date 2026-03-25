package o;

import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tRt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C46368tRt {
    public static /* synthetic */ int getRateColor$default(java.lang.Number number, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = C52761wXj.Activity.fdOvFl;
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        return EZpvd(number, i, z);
    }

    public static final int EZpvd(@NotNull java.lang.Number number, @androidx.annotation.ColorRes int i, boolean z) {
        Intrinsics.checkNotNullParameter(number, "");
        return C46369tRu.OLrzqt(C46369tRu.AEQbTJ(), C33129mqd.EZpvd(number), i, z);
    }

    public static /* synthetic */ int getPercentColor$default(float f, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = C52761wXj.Activity.fdOvFl;
        }
        return OLrzqt(f, i);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.tRu.getRateColor$default(android.content.Context, java.math.BigDecimal, int, boolean, int, java.lang.Object):int */
    public static final int OLrzqt(float f, @androidx.annotation.ColorRes int i) {
        BigDecimal scale = C33129mqd.EZpvd(java.lang.Float.valueOf(f)).multiply(BigDecimal.valueOf(100L)).setScale(2, RoundingMode.DOWN);
        android.content.Context contextAEQbTJ = C46369tRu.AEQbTJ();
        Intrinsics.copydefault(scale);
        return C46369tRu.getRateColor$default(contextAEQbTJ, scale, i, false, 4, null);
    }

    public static /* synthetic */ int getPnlTextColor$default(java.lang.String str, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = C52761wXj.Activity.DeEinT;
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        return KWHzl(str, i, z);
    }

    public static final int KWHzl(@NotNull java.lang.String str, @androidx.annotation.ColorRes int i, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return C46369tRu.OLrzqt(C46369tRu.AEQbTJ(), C33129mqd.EZpvd(StringsKt__StringsKt.EZpvd(str, (java.lang.CharSequence) "%")), i, z);
    }
}
