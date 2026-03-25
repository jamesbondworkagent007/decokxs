package o;

import com.okinc.network.okg.error.CustomServerErrorException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.roa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43400roa implements Interceptor {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public final ConcurrentHashMap<java.lang.String, StateListAnimator> copydefault = new ConcurrentHashMap<>();

    public final int OLrzqt(int i) {
        if (i == 0) {
            return 0;
        }
        if (i != 1) {
            return i != 2 ? 30 : 10;
        }
        return 5;
    }

    /* JADX INFO: renamed from: o.roa$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.roa.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final boolean AEQbTJ(@NotNull Request request) {
            Intrinsics.checkNotNullParameter(request, "");
            java.lang.String strHeader = request.header("ok-error-retry");
            return strHeader != null && Intrinsics.EZpvd((java.lang.Object) strHeader, (java.lang.Object) "1");
        }
    }

    @Override // okhttp3.Interceptor
    public Response intercept(@NotNull Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "");
        if (!Intrinsics.EZpvd((java.lang.Object) chain.request().method(), (java.lang.Object) "GET")) {
            return chain.proceed(chain.request());
        }
        if (Companion.AEQbTJ(chain.request())) {
            return AEQbTJ(chain);
        }
        java.lang.String string = chain.request().url().toString();
        StateListAnimator stateListAnimator = this.copydefault.get(string);
        if (stateListAnimator == null || stateListAnimator.EZpvd()) {
            return KWHzl(chain, string);
        }
        return EZpvd(chain, stateListAnimator);
    }

    public final Response AEQbTJ(@NotNull Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "");
        return chain.proceed(chain.request().newBuilder().removeHeader("ok-error-retry").build());
    }

    public final Response KWHzl(@NotNull Interceptor.Chain chain, @NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(chain, "");
        Intrinsics.checkNotNullParameter(str, "");
        return KWHzl(chain, new Function2() { // from class: o.rnY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C43400roa.AEQbTJ(this.copydefault, str, (Response) obj, ((java.lang.Integer) obj2).intValue());
            }
        });
    }

    public static final Response AEQbTJ(C43400roa c43400roa, java.lang.String str, Response response, int i) {
        Intrinsics.checkNotNullParameter(response, "");
        if (c43400roa.EZpvd(response) && i == 0) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.EZpvd(c43400roa.AEQbTJ());
            c43400roa.copydefault.put(str, stateListAnimator);
        }
        return response;
    }

    public final Response EZpvd(@NotNull Interceptor.Chain chain, @NotNull final StateListAnimator stateListAnimator) throws CustomServerErrorException {
        Intrinsics.checkNotNullParameter(chain, "");
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        int iCopydefault = stateListAnimator.copydefault();
        if (C33129mqd.AhwBna(java.lang.Long.valueOf((AEQbTJ() - stateListAnimator.KWHzl()) / ((long) 1000))) < OLrzqt(iCopydefault)) {
            throw new CustomServerErrorException(java.lang.String.valueOf(iCopydefault));
        }
        return KWHzl(chain, new Function2() { // from class: o.rnX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C43400roa.EZpvd(this.copydefault, stateListAnimator, (Response) obj, ((java.lang.Integer) obj2).intValue());
            }
        });
    }

    public static final Response EZpvd(C43400roa c43400roa, StateListAnimator stateListAnimator, Response response, int i) {
        Intrinsics.checkNotNullParameter(response, "");
        if (c43400roa.EZpvd(response) && i == 0) {
            stateListAnimator.EZpvd(c43400roa.AEQbTJ());
        } else if (!c43400roa.EZpvd(response)) {
            stateListAnimator.OLrzqt();
        }
        return response;
    }

    public final Response KWHzl(@NotNull Interceptor.Chain chain, @NotNull Function2<? super Response, ? super java.lang.Integer, Response> function2) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(chain, "");
        Intrinsics.checkNotNullParameter(function2, "");
        int i = 2;
        while (true) {
            Request request = chain.request();
            if (i != 2) {
                C43466rpn.OLrzqt.OLrzqt(request);
            }
            Response responseProceed = chain.proceed(request);
            i--;
            if (!EZpvd(responseProceed)) {
                return function2.invoke(responseProceed, java.lang.Integer.valueOf(i));
            }
            if (i > 0) {
                Util.closeQuietly(responseProceed);
            } else {
                return function2.invoke(responseProceed, java.lang.Integer.valueOf(i));
            }
        }
    }

    public final boolean EZpvd(@NotNull Response response) {
        Intrinsics.checkNotNullParameter(response, "");
        int iCode = response.code();
        return (400 > iCode || iCode >= 600 || response.code() == 401 || response.code() == 403 || response.code() == 429) ? false : true;
    }

    public final long AEQbTJ() {
        return java.lang.System.nanoTime() / 1000000;
    }

    /* JADX INFO: renamed from: o.roa$StateListAnimator */
    public static final class StateListAnimator {
        public long AEQbTJ;
        public int OLrzqt;

        /* JADX WARN: Removed duplicated region for block: B:9:0x000f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean EZpvd() {
            boolean z;
            synchronized (this) {
                if (this.OLrzqt == 0) {
                    z = this.AEQbTJ == 0;
                }
            }
            return z;
        }

        public final void OLrzqt() {
            synchronized (this) {
                this.OLrzqt = 0;
                this.AEQbTJ = 0L;
            }
        }

        public final void EZpvd(long j) {
            synchronized (this) {
                this.OLrzqt++;
                this.AEQbTJ = j;
            }
        }

        public final int copydefault() {
            int i;
            synchronized (this) {
                i = this.OLrzqt;
            }
            return i;
        }

        public final long KWHzl() {
            long j;
            synchronized (this) {
                j = this.AEQbTJ;
            }
            return j;
        }
    }
}
