package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aXB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6847aXB implements Interceptor {
    public final InterfaceC56387yDm<InterfaceC47278tmy> AEQbTJ;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.yDm<? extends o.tmy> */
    /* JADX WARN: Multi-variable type inference failed */
    public C6847aXB(@NotNull InterfaceC56387yDm<? extends InterfaceC47278tmy> interfaceC56387yDm) {
        Intrinsics.checkNotNullParameter(interfaceC56387yDm, "");
        this.AEQbTJ = interfaceC56387yDm;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(@NotNull Interceptor.Chain chain) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(chain, "");
        Request request = chain.request();
        Response responseProceed = chain.proceed(request);
        java.lang.String strHeader = responseProceed.header("x-ok-token", null);
        java.lang.String strHeader2 = request.header("x-simulated-trading");
        if (strHeader != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strHeader) && strHeader2 != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strHeader2)) {
            this.AEQbTJ.getValue().AEQbTJ(strHeader, strHeader2);
        }
        return responseProceed;
    }
}
