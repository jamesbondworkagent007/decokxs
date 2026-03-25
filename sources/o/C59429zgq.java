package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zgq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59429zgq {
    public static final java.lang.RuntimeException AEQbTJ(@NotNull java.lang.Throwable th) throws java.lang.Throwable {
        Intrinsics.checkNotNullParameter(th, "");
        throw th;
    }

    public static final boolean copydefault(@NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        java.lang.Class<?> superclass = th.getClass();
        while (!Intrinsics.EZpvd((java.lang.Object) superclass.getCanonicalName(), (java.lang.Object) "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }
}
