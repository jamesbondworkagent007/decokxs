package o;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.izg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25595izg {
    public static final C25595izg AEQbTJ = new C25595izg();
    public static ConcurrentHashMap<java.lang.String, C25594izf> copydefault = new ConcurrentHashMap<>();
    public static final int OLrzqt = 8;

    private C25595izg() {
    }

    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (copydefault.get(str) == null) {
            copydefault.put(str, new C25594izf());
        }
    }

    public final C25594izf AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (copydefault.get(str) == null) {
            copydefault.put(str, new C25594izf());
        }
        C25594izf c25594izf = copydefault.get(str);
        Intrinsics.copydefault(c25594izf);
        return c25594izf;
    }

    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        copydefault.remove(str);
    }
}
