package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseFailedException;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bwP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10857bwP {
    public static final java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        if ((th instanceof ResponseFailedException) || (th instanceof OKServerException)) {
            java.lang.String message = th.getMessage();
            return message == null ? C33070mpX.AYXKKw(C13754dXa.FragmentManager.Dfm) : message;
        }
        java.lang.String message2 = th.getMessage();
        pUU.AEQbTJ(str, message2 != null ? message2 : "", th);
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.Dfm);
    }

    public static final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        if ((th instanceof ResponseFailedException) || (th instanceof OKServerException)) {
            java.lang.String message = th.getMessage();
            if (message != null) {
                C55326xho.toastWithFailedIcon$default(message, 0, 1, (java.lang.Object) null);
                return;
            }
            return;
        }
        java.lang.String message2 = th.getMessage();
        pUU.AEQbTJ(str, message2 != null ? message2 : "", th);
        C55326xho.toastWithFailedIcon$default(C13754dXa.FragmentManager.Dfm, 0, 1, (java.lang.Object) null);
    }

    public static final java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        pUU.copydefault(str, str2);
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.Dfm);
    }
}
