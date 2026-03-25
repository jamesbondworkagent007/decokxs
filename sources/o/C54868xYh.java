package o;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xYh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54868xYh {
    public static final BigDecimal KWHzl(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return C54862xYb.divB$default(str, pTB.OLrzqt((java.lang.Object) "10").pow(i), 0, null, 6, null);
    }

    public static final BigDecimal EZpvd(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return C54862xYb.OLrzqt(str, pTB.OLrzqt((java.lang.Object) "10").pow(i));
    }
}
