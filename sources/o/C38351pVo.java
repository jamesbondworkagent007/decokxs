package o;

import java.net.UnknownHostException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.pVo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38351pVo {
    public static final C38351pVo AEQbTJ = new C38351pVo();

    private C38351pVo() {
    }

    public final java.lang.String OLrzqt(java.lang.Throwable th) {
        if (th == null) {
            return "";
        }
        for (java.lang.Throwable cause = th; cause != null; cause = cause.getCause()) {
            if (cause instanceof UnknownHostException) {
                return "";
            }
        }
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        java.io.PrintWriter printWriter = new java.io.PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        java.lang.String string = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }
}
