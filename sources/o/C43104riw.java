package o;

import com.okinc.mln_ui.internal.MLNUpdateException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.riw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43104riw {
    public static /* synthetic */ void reportUpdateFailure$default(java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        EZpvd(str, th);
    }

    public static final void EZpvd(@NotNull java.lang.String str, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(str, "");
        C6777aVl.Companion.copydefault(new MLNUpdateException(str, th), null, null);
    }
}
