package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zsQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C59935zsQ {
    public static /* synthetic */ C60060zuj createScope$default(android.content.ComponentCallbacks componentCallbacks, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return EZpvd(componentCallbacks, obj);
    }

    public static final <T extends android.content.ComponentCallbacks> C60060zuj EZpvd(@NotNull T t, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(t, "");
        return C59932zsN.EZpvd(t).OLrzqt(C59973ztB.KWHzl(t), C59973ztB.OLrzqt(t), obj);
    }

    public static final <T extends android.content.ComponentCallbacks> C60060zuj copydefault(@NotNull T t) {
        Intrinsics.checkNotNullParameter(t, "");
        return C59932zsN.EZpvd(t).OLrzqt(C59973ztB.KWHzl(t));
    }
}
