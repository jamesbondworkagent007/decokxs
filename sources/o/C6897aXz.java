package o;

import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aXz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6897aXz implements Interceptor {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final long AEQbTJ;
    public final ConcurrentHashMap<java.lang.String, CompletableFuture<C6846aXA>> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C6897aXz() {
        this(0L, 1, null);
    }

    public C6897aXz(long j) {
        this.AEQbTJ = j;
        this.KWHzl = new ConcurrentHashMap<>();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (20 long) : (r1v0 long))
 A[MD:(long):void (m)] (LINE:30) call: o.aXz.<init>(long):void type: THIS */
    public /* synthetic */ C6897aXz(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 20L : j);
    }

    /* JADX INFO: renamed from: o.aXz$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aXz.Activity.<init>():void type: THIS */
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
        if (!EZpvd(request)) {
            return chain.proceed(request);
        }
        java.lang.String strOLrzqt = OLrzqt(request);
        CompletableFuture<C6846aXA> completableFuture = new CompletableFuture<>();
        CompletableFuture<C6846aXA> completableFuturePutIfAbsent = this.KWHzl.putIfAbsent(strOLrzqt, completableFuture);
        if (completableFuturePutIfAbsent != null) {
            pUU.KWHzl("SingleFlight", "Waiting for flight request, path=" + C43466rpn.OLrzqt.KWHzl(request));
            return AEQbTJ(completableFuturePutIfAbsent, chain, request);
        }
        pUU.EZpvd("SingleFlight", "Initiating new request, path=" + C43466rpn.OLrzqt.KWHzl(request));
        return AEQbTJ(chain, request, strOLrzqt, completableFuture);
    }

    public final boolean EZpvd(@NotNull Request request) {
        Intrinsics.checkNotNullParameter(request, "");
        return Intrinsics.EZpvd((java.lang.Object) request.method(), (java.lang.Object) "GET");
    }

    public final java.lang.String OLrzqt(@NotNull Request request) {
        Intrinsics.checkNotNullParameter(request, "");
        java.lang.String strAEQbTJ = C43273rmF.AEQbTJ(request);
        Intrinsics.checkNotNullExpressionValue(strAEQbTJ, "");
        return strAEQbTJ;
    }

    public final Response AEQbTJ(Interceptor.Chain chain, Request request, java.lang.String str, CompletableFuture<C6846aXA> completableFuture) {
        try {
            try {
                C6846aXA c6846aXAKWHzl = KWHzl(chain.proceed(request));
                pUU.EZpvd("SingleFlight", "Request completed successfully, path=" + C43466rpn.OLrzqt.KWHzl(request));
                completableFuture.complete(c6846aXAKWHzl);
                return c6846aXAKWHzl.KWHzl();
            } catch (java.lang.Exception e) {
                C43466rpn c43466rpn = C43466rpn.OLrzqt;
                if (c43466rpn.OLrzqt(chain)) {
                    completableFuture.cancel(true);
                } else {
                    pUU.KWHzl("SingleFlight", "Request failed with exception, path=" + c43466rpn.KWHzl(request) + ", error=" + c43466rpn.EZpvd(e));
                    completableFuture.completeExceptionally(e);
                }
                throw e;
            }
        } finally {
            this.KWHzl.remove(str);
        }
    }

    public final C6846aXA KWHzl(@NotNull Response response) {
        Intrinsics.checkNotNullParameter(response, "");
        ResponseBody responseBodyBody = response.body();
        return new C6846aXA(response, responseBodyBody != null ? responseBodyBody.bytes() : null);
    }

    public final Response AEQbTJ(@NotNull CompletableFuture<C6846aXA> completableFuture, @NotNull Interceptor.Chain chain, @NotNull Request request) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(completableFuture, "");
        Intrinsics.checkNotNullParameter(chain, "");
        Intrinsics.checkNotNullParameter(request, "");
        try {
            C6846aXA c6846aXA = completableFuture.get(this.AEQbTJ, java.util.concurrent.TimeUnit.SECONDS);
            pUU.KWHzl("SingleFlight", "Got response from flight request, path=" + C43466rpn.OLrzqt.KWHzl(request));
            return c6846aXA.KWHzl();
        } catch (java.lang.InterruptedException e) {
            java.lang.Thread.currentThread().interrupt();
            throw new java.io.IOException("Request was interrupted", e);
        } catch (CancellationException unused) {
            pUU.KWHzl("SingleFlight", "Request was cancelled, initiating new request, path=" + C43466rpn.OLrzqt.KWHzl(request));
            return chain.proceed(request);
        } catch (ExecutionException e2) {
            java.lang.Throwable cause = e2.getCause();
            C43466rpn c43466rpn = C43466rpn.OLrzqt;
            pUU.KWHzl("SingleFlight", "Got exception from flight request, initiating new request, path=" + c43466rpn.KWHzl(request) + ", error=" + (cause == null ? "null cause" : c43466rpn.EZpvd(cause)));
            return chain.proceed(request);
        } catch (TimeoutException unused2) {
            pUU.valueOf("SingleFlight", "Request timeout, initiating new request, path=" + C43466rpn.OLrzqt.KWHzl(request));
            return chain.proceed(request);
        } catch (java.lang.Exception e3) {
            C43466rpn c43466rpn2 = C43466rpn.OLrzqt;
            pUU.valueOf("SingleFlight", "Unexpected exception while waiting for response, initiating new request, path=" + c43466rpn2.KWHzl(request) + ", cancel:" + c43466rpn2.OLrzqt(chain) + ", error=" + c43466rpn2.EZpvd(e3));
            return chain.proceed(request);
        }
    }
}
