package o;

import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class GX {
    public static final void AEQbTJ(@NotNull GU gu, @NotNull java.lang.Throwable th, boolean z) {
        Intrinsics.checkNotNullParameter(gu, "");
        Intrinsics.checkNotNullParameter(th, "");
        java.lang.String strGEmmrt = C56524yIo.AEQbTJ(th.getClass()).gEmmrt();
        if (strGEmmrt == null) {
            strGEmmrt = C56524yIo.AEQbTJ(th.getClass()).valueOf();
        }
        OLrzqt(gu, Constants.IPC_BUNDLE_KEY_SEND_ERROR, java.lang.Boolean.TRUE);
        java.lang.String message = th.getMessage();
        if (message != null) {
            OLrzqt(gu, "exception.message", message);
        }
        if (strGEmmrt != null) {
            OLrzqt(gu, "exception.type", strGEmmrt);
        }
        OLrzqt(gu, "exception.stacktrace", C56379yDe.AEQbTJ(th));
        java.lang.Throwable cause = th.getCause();
        if (cause != null) {
            OLrzqt(gu, "exception.cause", cause.toString());
        }
        OLrzqt(gu, "exception.escaped", java.lang.Boolean.valueOf(z));
    }

    public static final <T> void OLrzqt(@NotNull GU gu, @NotNull java.lang.String str, @NotNull T t) {
        Intrinsics.checkNotNullParameter(gu, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(t, "");
        gu.copydefault(new C57737yo<>(str), t);
    }
}
