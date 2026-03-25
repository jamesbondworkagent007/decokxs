package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.Interceptor;
import okhttp3.Response;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rnO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43335rnO implements Interceptor {
    public final int KWHzl;
    public final Function1<java.lang.String, java.lang.Boolean> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C43335rnO() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    public C43335rnO(int i, Function1<? super java.lang.String, java.lang.Boolean> function1) {
        this.KWHzl = i;
        this.copydefault = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (2 int) : (r2v0 int))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r3v0 kotlin.jvm.functions.Function1))
 A[MD:(int, kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.Boolean>):void (m)] (LINE:14) call: o.rnO.<init>(int, kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C43335rnO(int i, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 2 : i, (i2 & 2) != 0 ? null : function1);
    }

    @Override // okhttp3.Interceptor
    public Response intercept(@NotNull Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "");
        return KWHzl(chain, 0);
    }

    public final Response KWHzl(Interceptor.Chain chain, int i) throws java.io.IOException {
        if (this.KWHzl <= i) {
            return chain.proceed(chain.request());
        }
        try {
            return chain.proceed(chain.request());
        } catch (java.io.IOException e) {
            Function1<java.lang.String, java.lang.Boolean> function1 = this.copydefault;
            boolean zBooleanValue = function1 != null ? function1.invoke(chain.request().url().host()).booleanValue() : true;
            pUU.valueOf("OKDohErrorRetryInterceptor", "error: " + e + ", retryCount: " + i + ", url: " + chain.request().url());
            if (zBooleanValue) {
                java.lang.String simpleName = e.getClass().getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName, "");
                if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) simpleName, (java.lang.CharSequence) SSLSocketFactory.SSL, false, 2, (java.lang.Object) null)) {
                    return KWHzl(chain, i + 1);
                }
            }
            throw e;
        }
    }
}
