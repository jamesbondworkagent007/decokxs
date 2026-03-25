package o;

import java.net.UnknownHostException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rlx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC43264rlx extends InterfaceC43216rlB {
    public static final StateListAnimator Companion = StateListAnimator.copydefault;

    int AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    int EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    int EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Throwable th);

    java.lang.String EZpvd(java.lang.Throwable th);

    int KWHzl(int i, @NotNull java.lang.String str, @NotNull java.lang.String str2);

    int KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    int KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Throwable th);

    void KWHzl(boolean z);

    int OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    int OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Throwable th);

    int copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    /* JADX INFO: renamed from: o.rlx$StateListAnimator */
    public static final class StateListAnimator {
        public static final /* synthetic */ StateListAnimator copydefault = new StateListAnimator();

        private StateListAnimator() {
        }
    }

    /* JADX INFO: renamed from: o.rlx$Activity */
    public static final class Activity {
        public static int AEQbTJ(@NotNull InterfaceC43264rlx interfaceC43264rlx, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return interfaceC43264rlx.KWHzl(2, str, str2);
        }

        public static int EZpvd(@NotNull InterfaceC43264rlx interfaceC43264rlx, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return interfaceC43264rlx.KWHzl(3, str, str2);
        }

        public static int OLrzqt(@NotNull InterfaceC43264rlx interfaceC43264rlx, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return interfaceC43264rlx.KWHzl(3, str, C59442zhC.fJNWhG("\n     " + str2 + "\n     " + interfaceC43264rlx.EZpvd(th) + "\n     "));
        }

        public static int copydefault(@NotNull InterfaceC43264rlx interfaceC43264rlx, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return interfaceC43264rlx.KWHzl(4, str, str2);
        }

        public static int OLrzqt(@NotNull InterfaceC43264rlx interfaceC43264rlx, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return interfaceC43264rlx.KWHzl(5, str, str2);
        }

        public static int AEQbTJ(@NotNull InterfaceC43264rlx interfaceC43264rlx, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return interfaceC43264rlx.KWHzl(5, str, C59442zhC.fJNWhG("\n     " + str2 + "\n     " + interfaceC43264rlx.EZpvd(th) + "\n     "));
        }

        public static int KWHzl(@NotNull InterfaceC43264rlx interfaceC43264rlx, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return interfaceC43264rlx.KWHzl(6, str, str2);
        }

        public static int KWHzl(@NotNull InterfaceC43264rlx interfaceC43264rlx, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return interfaceC43264rlx.KWHzl(6, str, C59442zhC.fJNWhG("\n     " + str2 + "\n     " + interfaceC43264rlx.EZpvd(th) + "\n     "));
        }

        public static java.lang.String EZpvd(@NotNull InterfaceC43264rlx interfaceC43264rlx, java.lang.Throwable th) {
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
}
