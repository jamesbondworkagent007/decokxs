package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.thR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46980thR implements Interceptor {
    @Override // okhttp3.Interceptor
    public Response intercept(@NotNull Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "");
        C46979thQ c46979thQ = C46979thQ.copydefault;
        return chain.proceed(OLrzqt(chain.request().newBuilder().header("tmx-session-id", c46979thQ.OLrzqt().AhwBna().EZpvd()).header("tmx-session-status", java.lang.String.valueOf(c46979thQ.OLrzqt().AhwBna().copydefault().ordinal())).build()));
    }

    public final Request OLrzqt(@NotNull Request request) throws java.security.NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(request, "");
        return request.newBuilder().header("headers-order-string-hash", C47137tkP.KWHzl.AEQbTJ(CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt___CollectionsKt.EZpvd(request.headers().names(), new ActionBar()), "", null, null, 0, null, null, 62, null))).build();
    }

    /* JADX INFO: renamed from: o.thR$ActionBar */
    public static final class ActionBar<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            java.util.Locale locale = java.util.Locale.ROOT;
            java.lang.String lowerCase = ((java.lang.String) t).toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            java.lang.String lowerCase2 = ((java.lang.String) t2).toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            return yET.KWHzl(lowerCase, lowerCase2);
        }
    }
}
