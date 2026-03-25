package o;

import com.okinc.okuser.data.Token;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tmx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47277tmx implements Interceptor {
    public final InterfaceC47278tmy OLrzqt;

    public C47277tmx(@NotNull InterfaceC47278tmy interfaceC47278tmy) {
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        this.OLrzqt = interfaceC47278tmy;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(@NotNull Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "");
        Request request = chain.request();
        Token tokenDjBIcL = this.OLrzqt.djBIcL();
        java.lang.String value = tokenDjBIcL != null ? tokenDjBIcL.getValue() : null;
        if (value == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) value)) {
            return chain.proceed(request);
        }
        pUU.KWHzl("UserManager", "set temp token to request Authorization header");
        return chain.proceed(request.newBuilder().header("Authorization", value).build());
    }
}
