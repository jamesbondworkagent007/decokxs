package o;

import com.okinc.network.okg.response.OKServerException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lpk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31212lpk {
    public static final C31212lpk copydefault = new C31212lpk();

    public final boolean AEQbTJ(int i) {
        return i == 10056;
    }

    public final boolean AYXKKw(int i) {
        return i == 60009;
    }

    public final boolean EZpvd(int i) {
        return i == 10062;
    }

    public final boolean KWHzl(int i) {
        return i == 10098;
    }

    public final boolean OLrzqt(int i) {
        return i == 10100 || i == 10101;
    }

    public final boolean copydefault(int i) {
        return i == 10063;
    }

    public final boolean valueOf(int i) {
        return i == 100006;
    }

    private C31212lpk() {
    }

    public final boolean KWHzl(@NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        OKServerException oKServerException = th instanceof OKServerException ? (OKServerException) th : null;
        if (oKServerException != null) {
            return EZpvd(oKServerException.getCode());
        }
        return false;
    }

    public final boolean AEQbTJ(@NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        OKServerException oKServerException = th instanceof OKServerException ? (OKServerException) th : null;
        if (oKServerException != null) {
            return OLrzqt(oKServerException.getCode());
        }
        return false;
    }

    public final boolean OLrzqt(@NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        OKServerException oKServerException = th instanceof OKServerException ? (OKServerException) th : null;
        if (oKServerException != null) {
            return copydefault(oKServerException.getCode());
        }
        return false;
    }

    public final boolean EZpvd(@NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        OKServerException oKServerException = th instanceof OKServerException ? (OKServerException) th : null;
        if (oKServerException != null) {
            return KWHzl(oKServerException.getCode());
        }
        return false;
    }

    public final boolean djBIcL(@NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        OKServerException oKServerException = th instanceof OKServerException ? (OKServerException) th : null;
        if (oKServerException != null) {
            return AEQbTJ(oKServerException.getCode());
        }
        return false;
    }

    public final boolean valueOf(@NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        OKServerException oKServerException = th instanceof OKServerException ? (OKServerException) th : null;
        if (oKServerException != null) {
            return valueOf(oKServerException.getCode());
        }
        return false;
    }

    public final boolean copydefault(@NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        OKServerException oKServerException = th instanceof OKServerException ? (OKServerException) th : null;
        if (oKServerException != null) {
            return AYXKKw(oKServerException.getCode());
        }
        return false;
    }
}
