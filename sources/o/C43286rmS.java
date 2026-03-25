package o;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rmS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43286rmS {
    public final java.util.List<Interceptor> OLrzqt = new java.util.ArrayList();
    public final java.util.List<Interceptor> EZpvd = new java.util.ArrayList();
    public final java.util.List<Interceptor> KWHzl = new java.util.ArrayList();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<Interceptor> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<Interceptor> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<Interceptor> copydefault() {
        return this.OLrzqt;
    }

    public final C43286rmS KWHzl(@NotNull Interceptor interceptor) {
        Intrinsics.checkNotNullParameter(interceptor, "");
        this.OLrzqt.add(interceptor);
        return this;
    }

    public final C43286rmS OLrzqt(@NotNull Interceptor interceptor) {
        Intrinsics.checkNotNullParameter(interceptor, "");
        this.KWHzl.add(interceptor);
        return this;
    }
}
