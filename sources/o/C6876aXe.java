package o;

import com.okinc.okuser.data.Token;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aXe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6876aXe implements Interceptor {
    private static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final Function0<Token> KWHzl;
    public java.lang.String OLrzqt;

    public C6876aXe(@NotNull Function0<Token> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.KWHzl = function0;
        this.OLrzqt = "";
    }

    @Override // okhttp3.Interceptor
    public Response intercept(@NotNull Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "");
        if (C43466rpn.OLrzqt.AEQbTJ(chain)) {
            return chain.proceed(chain.request());
        }
        Request request = chain.request();
        Request.Builder builderNewBuilder = request.newBuilder();
        if (request.header("Authorization") != null) {
            pUU.KWHzl("AuthorizationInterceptor", "custom auth already present, path: " + request.url().encodedPath());
        } else {
            Token tokenInvoke = this.KWHzl.invoke();
            if (tokenInvoke != null) {
                if (!Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) tokenInvoke.getValue())) {
                    this.OLrzqt = tokenInvoke.getValue();
                    pUU.KWHzl("AuthorizationInterceptor", "token header added, path : " + request.url().encodedPath());
                }
                builderNewBuilder.header("Authorization", tokenInvoke.getValue());
                java.lang.String str = request.headers().get("x-simulated-trading");
                if (str == null || str.length() == 0) {
                    builderNewBuilder.header("x-simulated-trading", java.lang.String.valueOf(tokenInvoke.getType().getHeaderValue()));
                }
            } else {
                if (!Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) "")) {
                    this.OLrzqt = "";
                    pUU.KWHzl("AuthorizationInterceptor", "token header removed; path: " + request.url().encodedPath());
                }
                builderNewBuilder.removeHeader("Authorization");
            }
        }
        return chain.proceed(builderNewBuilder.build());
    }

    /* JADX INFO: renamed from: o.aXe$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aXe.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
