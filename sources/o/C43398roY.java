package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.roY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43398roY {
    public static boolean EZpvd;
    public static Function1<? super OkHttpClient.Builder, Unit> KWHzl;
    public static final C43398roY copydefault = new C43398roY();
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z, Function1<? super OkHttpClient.Builder, Unit> function1) {
        EZpvd = z;
        KWHzl = function1;
    }

    private C43398roY() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.roY */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void init$default(C43398roY c43398roY, boolean z, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        c43398roY.AEQbTJ(z, function1);
    }

    public final OkHttpClient.Builder AEQbTJ(@NotNull OkHttpClient.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "");
        Function1<? super OkHttpClient.Builder, Unit> function1 = KWHzl;
        if (function1 != null) {
            function1.invoke(builder);
        }
        return builder;
    }
}
