package o;

import com.okinc.network.okg.response.OKServerException;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tRK {
    public static final java.lang.String EZpvd(@NotNull java.lang.Throwable th) {
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(th, "");
        if (th instanceof OKServerException) {
            strAYXKKw = th.getMessage();
            if (strAYXKKw == null || strAYXKKw.length() == 0) {
                strAYXKKw = null;
            }
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C47501trL.Fragment.DbNXlk);
        }
        return strAYXKKw == null ? C33070mpX.AYXKKw(C47501trL.Fragment.DbNXlk) : strAYXKKw;
    }

    public static final java.lang.String AEQbTJ(@NotNull java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        if (exc instanceof OKServerException) {
            java.lang.Throwable origin = ((OKServerException) exc).getOrigin();
            return C33129mqd.gEmmrt(origin != null ? origin.getMessage() : null);
        }
        return C33129mqd.gEmmrt(exc.getMessage());
    }
}
