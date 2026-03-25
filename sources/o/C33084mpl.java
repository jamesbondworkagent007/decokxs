package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mpl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C33084mpl {
    public static final <T> T OLrzqt(@NotNull java.lang.String str, T t) {
        Intrinsics.checkNotNullParameter(str, "");
        return !OLrzqt(str) ? t : (T) C33083mpk.KWHzl.KWHzl(str);
    }

    public static final <T> void AEQbTJ(@NotNull java.lang.String str, T t) {
        Intrinsics.checkNotNullParameter(str, "");
        C33083mpk.KWHzl.OLrzqt(str, t);
    }

    public static final boolean OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33083mpk.KWHzl.copydefault(str);
    }
}
