package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zun, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C60064zun {
    public static /* synthetic */ C59991ztT module$default(boolean z, boolean z2, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        return copydefault(z, z2, function1);
    }

    public static final C59991ztT copydefault(boolean z, boolean z2, @NotNull Function1<? super C59991ztT, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        C59991ztT c59991ztT = new C59991ztT(z);
        function1.invoke(c59991ztT);
        return c59991ztT;
    }

    public static /* synthetic */ C59991ztT module$default(boolean z, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return AEQbTJ(z, function1);
    }

    public static final C59991ztT AEQbTJ(boolean z, @NotNull Function1<? super C59991ztT, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        C59991ztT c59991ztT = new C59991ztT(z);
        function1.invoke(c59991ztT);
        return c59991ztT;
    }
}
