package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.roP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43389roP implements Interceptor {
    public static final Activity Companion = new Activity(null);

    /* JADX INFO: renamed from: o.roP$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.roP.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    @Override // okhttp3.Interceptor
    public Response intercept(@NotNull Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "");
        Request request = chain.request();
        java.util.Map<java.lang.String, java.lang.String> mapAEQbTJ = C43386roM.EZpvd.AEQbTJ();
        if (!mapAEQbTJ.isEmpty()) {
            Request.Builder builderNewBuilder = request.newBuilder();
            for (java.lang.String str : mapAEQbTJ.keySet()) {
                java.lang.String str2 = mapAEQbTJ.get(str);
                if (str2 == null) {
                    str2 = "";
                }
                builderNewBuilder.addHeader(str, str2);
                pUU.EZpvd("XCdnHeaderInterceptor", "add header: " + str + ", " + ((java.lang.Object) mapAEQbTJ.get(str)));
            }
            request = builderNewBuilder.build();
        }
        return chain.proceed(request);
    }
}
