package o;

import com.google.common.net.HttpHeaders;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aXw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6894aXw implements Interceptor {
    public static final TaskDescription Companion = new TaskDescription(null);

    @Override // okhttp3.Interceptor
    public Response intercept(@NotNull Interceptor.Chain chain) {
        java.lang.String strSubstringBefore$default = "";
        Intrinsics.checkNotNullParameter(chain, "");
        Request.Builder builderNewBuilder = chain.request().newBuilder();
        try {
            java.net.URI uri = new java.net.URI(chain.request().url().toString());
            strSubstringBefore$default = uri.getScheme() + "://" + uri.getHost() + uri.getRawPath();
        } catch (java.lang.Exception unused) {
        }
        if (strSubstringBefore$default.length() == 0) {
            strSubstringBefore$default = StringsKt__StringsKt.substringBefore$default(chain.request().url().toString(), "?", (java.lang.String) null, 2, (java.lang.Object) null);
        }
        builderNewBuilder.header(HttpHeaders.REFERER, strSubstringBefore$default);
        return chain.proceed(builderNewBuilder.build());
    }

    /* JADX INFO: renamed from: o.aXw$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aXw.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
