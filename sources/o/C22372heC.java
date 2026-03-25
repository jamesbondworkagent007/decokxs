package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.heC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C22372heC {
    public static final boolean EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return !AEQbTJ(str);
    }

    public static final boolean copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return AEQbTJ(str);
    }

    public static final boolean AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "default_trade");
    }

    public static final boolean KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "default_trade");
    }
}
