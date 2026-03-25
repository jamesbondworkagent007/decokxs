package o;

import com.okinc.network.okg.response.OKServerException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uyZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49968uyZ {
    public static final java.lang.String OLrzqt(@NotNull java.lang.Throwable th, @NotNull java.lang.String str) {
        java.lang.String message;
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(str, "");
        return (!(th instanceof OKServerException) || (message = th.getMessage()) == null) ? str : message;
    }
}
