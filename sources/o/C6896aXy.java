package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aXy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6896aXy implements Interceptor {
    public static final StateListAnimator Companion = new StateListAnimator(null);

    /* JADX INFO: renamed from: o.aXy$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aXy.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @Override // okhttp3.Interceptor
    public Response intercept(@NotNull Interceptor.Chain chain) {
        Response responseOLrzqt;
        Intrinsics.checkNotNullParameter(chain, "");
        try {
            responseOLrzqt = C43277rmJ.EZpvd.OLrzqt(chain);
        } catch (java.lang.Throwable th) {
            pUU.copydefault("RuleEngineInterceptor", chain.request().url() + " " + th);
            responseOLrzqt = null;
        }
        return responseOLrzqt == null ? chain.proceed(chain.request()) : responseOLrzqt;
    }
}
