package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tmP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47243tmP {
    public static final C47243tmP EZpvd = new C47243tmP();

    private C47243tmP() {
    }

    public final void EZpvd(@NotNull Function0<java.lang.String> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        try {
            pUU.KWHzl("UserManager", function0.invoke());
        } catch (java.lang.Throwable unused) {
        }
    }
}
