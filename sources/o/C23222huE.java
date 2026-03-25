package o;

import com.okinc.business.market.di.DataSerializerModule;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.network.okg.tag.RequestTagEnum;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C23222huE;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import retrofit2.Converter;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: renamed from: o.huE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23222huE extends C43280rmM {
    public static final C23222huE AEQbTJ = new C23222huE();

    private C23222huE() {
        super(null, 1, 0 == true ? 1 : 0);
    }

    @Override // o.C43395roV
    public java.util.List<Converter.Factory> getConvertFactories() {
        return yDY.gEmmrt(C8059avb.KWHzl(DataSerializerModule.EZpvd.KWHzl(), C43284rmQ.copydefault()), GsonConverterFactory.create());
    }

    @Override // o.C43280rmM
    public RequestTagEnum getRequestHeaderTag() {
        return RequestTagEnum.WEB3;
    }

    @Override // o.C43280rmM
    public java.util.List<Interceptor> buildPreCustomInterceptors() {
        return C56402yEa.EZpvd(ActionBar.KWHzl);
    }

    @Override // o.C43280rmM
    public OkHttpClient.Builder initClientBuilder() {
        OkHttpClient.Builder builderInitClientBuilder = super.initClientBuilder();
        builderInitClientBuilder.addInterceptor(StateListAnimator.KWHzl);
        builderInitClientBuilder.addInterceptor(new C6892aXu(null));
        builderInitClientBuilder.addInterceptor(Activity.copydefault);
        return builderInitClientBuilder;
    }

    /* JADX INFO: renamed from: o.huE$StateListAnimator */
    public static final class StateListAnimator implements Interceptor {
        public static final StateListAnimator KWHzl = new StateListAnimator();
        public static final java.util.Set<java.lang.String> OLrzqt = yEE.AhwBna("/priapi/v6/dx/trade/multi/broadcast", "/priapi/v6/dx/trade/multi/marketQuoteAndCalldata", "/priapi/v6/dx/trade/multi/calldata", "/priapi/v6/dx/trade/multi/quote", "/priapi/v6/dx/trade/multi/signAndBroadcast");
        public static final int copydefault = 8;

        private StateListAnimator() {
        }

        @Override // okhttp3.Interceptor
        public Response intercept(@NotNull Interceptor.Chain chain) {
            Intrinsics.checkNotNullParameter(chain, "");
            Request.Builder builderNewBuilder = chain.request().newBuilder();
            for (Map.Entry<java.lang.String, java.lang.String> entry : C22380heK.OLrzqt.copydefault("default_trade").fARcdN().gEmmrt().entrySet()) {
                builderNewBuilder.header(entry.getKey(), entry.getValue());
            }
            if (!chain.request().headers().names().contains("Encrypt-Strategy")) {
                builderNewBuilder.header("OK-VERIFY-TOKEN", "");
            }
            if (OLrzqt.contains(chain.request().url().encodedPath())) {
                builderNewBuilder.removeHeader("tee-sa-status");
            }
            return chain.proceed(builderNewBuilder.build());
        }
    }

    /* JADX INFO: renamed from: o.huE$ActionBar */
    public static final class ActionBar implements Interceptor {
        public static final ActionBar KWHzl = new ActionBar();

        private ActionBar() {
        }

        @Override // okhttp3.Interceptor
        public Response intercept(@NotNull Interceptor.Chain chain) {
            Intrinsics.checkNotNullParameter(chain, "");
            return chain.proceed(chain.request().newBuilder().addHeader("Subdomain-Strategy", SubdomainStrategy.Global.INSTANCE.toString()).build());
        }
    }

    /* JADX INFO: renamed from: o.huE$Activity */
    public static final class Activity implements Interceptor {
        public static final Activity copydefault = new Activity();
        public static final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.huD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C23222huE.Activity.EZpvd();
            }
        });
        public static final int AEQbTJ = 8;

        private Activity() {
        }

        public final Interceptor OLrzqt() {
            return (Interceptor) KWHzl.getValue();
        }

        public static final Interceptor EZpvd() {
            return ((InterfaceC9858bdX) C43251rlk.copydefault(InterfaceC9858bdX.class)).AEQbTJ();
        }

        @Override // okhttp3.Interceptor
        public Response intercept(@NotNull Interceptor.Chain chain) {
            Intrinsics.checkNotNullParameter(chain, "");
            return OLrzqt().intercept(chain);
        }
    }
}
