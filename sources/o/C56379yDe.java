package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yDe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C56379yDe {
    public static java.lang.String AEQbTJ(@NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        java.io.PrintWriter printWriter = new java.io.PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        java.lang.String string = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static void EZpvd(@NotNull java.lang.Throwable th, @NotNull java.lang.Throwable th2) {
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(th2, "");
        if (th != th2) {
            C56452yFx.OLrzqt.EZpvd(th, th2);
        }
    }

    public static java.util.List<java.lang.Throwable> KWHzl(@NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return C56452yFx.OLrzqt.copydefault(th);
    }
}
