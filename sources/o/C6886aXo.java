package o;

import com.okinc.network.okg.log.NetRequestExtraInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aXo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6886aXo implements Interceptor {
    public static final StateListAnimator Companion = new StateListAnimator(null);

    @Override // okhttp3.Interceptor
    public Response intercept(@NotNull Interceptor.Chain chain) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(chain, "");
        Response responseProceed = chain.proceed(chain.request().newBuilder().tag(NetRequestExtraInfo.class, new NetRequestExtraInfo()).build());
        ResponseBody responseBodyBody = responseProceed.body();
        if (responseBodyBody != null) {
            try {
                responseBodyBody.source().request(Long.MAX_VALUE);
                long size = responseBodyBody.source().getBuffer().size();
                NetRequestExtraInfo netRequestExtraInfo = (NetRequestExtraInfo) responseProceed.request().tag(NetRequestExtraInfo.class);
                if (netRequestExtraInfo != null) {
                    netRequestExtraInfo.setDecompressedResponseSize(java.lang.Long.valueOf(size));
                    netRequestExtraInfo.setRealUrl(responseProceed.request().url());
                }
                return responseProceed;
            } catch (java.lang.OutOfMemoryError e) {
                pUU.copydefault("ReportMonitorExtraInfoInterceptor", "host: " + responseProceed.request().url() + ", OOM encountered while calculating response size: " + e.getMessage());
            }
        }
        return responseProceed;
    }

    /* JADX INFO: renamed from: o.aXo$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aXo.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
