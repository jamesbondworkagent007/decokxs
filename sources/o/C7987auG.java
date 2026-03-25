package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.auG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C7987auG {
    public static final C7986auF KWHzl(int i) {
        return C7986auF.Companion.KWHzl(i);
    }

    public static /* synthetic */ C7986auF toBigInteger$default(java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 10;
        }
        return OLrzqt(str, i);
    }

    public static final C7986auF OLrzqt(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return C7986auF.Companion.EZpvd(str, i);
    }
}
