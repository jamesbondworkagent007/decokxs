package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ugO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49003ugO {
    public static final C49003ugO AEQbTJ = new C49003ugO();
    public static final androidx.collection.LruCache<java.lang.String, java.lang.String> KWHzl = new androidx.collection.LruCache<>(50);
    public static final int EZpvd = 8;

    private C49003ugO() {
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        java.lang.String strCopydefault = copydefault(str, str2);
        synchronized (this) {
            KWHzl.put(strCopydefault, str3);
        }
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        java.lang.String str3;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String strCopydefault = copydefault(str, str2);
        synchronized (this) {
            str3 = KWHzl.get(strCopydefault);
        }
        return str3;
    }

    public final java.lang.String copydefault(java.lang.String str, java.lang.String str2) {
        return str + "@" + str2;
    }
}
