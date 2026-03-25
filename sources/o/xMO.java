package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class xMO {
    public static final xMO KWHzl = new xMO();

    private xMO() {
    }

    public final java.lang.String AEQbTJ(java.lang.Object obj, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (obj != null ? obj.toString() : null) + " " + str;
    }
}
