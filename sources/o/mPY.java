package o;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class mPY {
    public static final mPY OLrzqt = new mPY();
    public static ConcurrentHashMap<java.lang.String, mPZ> copydefault = new ConcurrentHashMap<>();
    public static final int KWHzl = 8;

    private mPY() {
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        OLrzqt(str);
    }

    public final void OLrzqt(java.lang.String str) {
        if (copydefault.get(str) == null) {
            copydefault.put(str, new mPZ(str));
        }
    }

    public final mPZ copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (copydefault.get(str) == null) {
            copydefault.put(str, new mPZ(str));
        }
        mPZ mpz = copydefault.get(str);
        Intrinsics.copydefault(mpz);
        return mpz;
    }

    public final void KWHzl(java.lang.String str) {
        copydefault.remove(str);
    }

    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        KWHzl(str);
    }
}
