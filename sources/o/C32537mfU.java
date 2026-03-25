package o;

import com.okinc.network.okg.config.NetworkStringEnum;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mfU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32537mfU implements InterfaceC4346Bbq {
    public final java.lang.String AEQbTJ = "OKCoreHttpRequestFactory";
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.mfT
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C32537mfU.copydefault();
        }
    });

    public final OkHttpClient KWHzl() {
        return (OkHttpClient) this.KWHzl.getValue();
    }

    public static final OkHttpClient copydefault() {
        OkHttpClient.Builder builderInitClientBuilder = C43280rmM.Companion.copydefault().initClientBuilder();
        builderInitClientBuilder.addInterceptor(new C43340rnT(new C43342rnV()));
        builderInitClientBuilder.addInterceptor(new C43380roG());
        return builderInitClientBuilder.build();
    }

    @Override // o.InterfaceC4346Bbq
    public InterfaceC4267BaQ copydefault(@NotNull C4343Bbn c4343Bbn) {
        Intrinsics.checkNotNullParameter(c4343Bbn, "");
        return new C32535mfS(c4343Bbn, KWHzl());
    }

    @Override // o.InterfaceC4346Bbq
    public java.lang.String EZpvd() {
        java.lang.String strInvoke;
        pUU.KWHzl(this.AEQbTJ, "got network error msg from unifiedErrorMessage");
        Function1<NetworkStringEnum, java.lang.String> function1ZsXlph = C43292rmY.OLrzqt.zsXlph();
        return (function1ZsXlph == null || (strInvoke = function1ZsXlph.invoke(NetworkStringEnum.NETWORK_ERROR)) == null) ? "Network error" : strInvoke;
    }
}
