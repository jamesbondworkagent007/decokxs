package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hey, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C22420hey {
    public static final boolean KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "1") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "2") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "3") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "4") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "5") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "7")) ? false : true;
    }

    public static final boolean OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return KWHzl(str) | ((Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "2") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "3")) ? false : true);
    }
}
