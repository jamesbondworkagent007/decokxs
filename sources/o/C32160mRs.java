package o;

import com.okinc.dexkline.market.di.DataSerializerModule;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.network.okg.tag.RequestTagEnum;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import retrofit2.Converter;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: renamed from: o.mRs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C32160mRs extends C43280rmM {
    public static final C32160mRs KWHzl = new C32160mRs();

    private C32160mRs() {
        super(null, 1, 0 == true ? 1 : 0);
    }

    @Override // o.C43395roV
    public java.util.List<Converter.Factory> getConvertFactories() {
        return yDY.gEmmrt(C8059avb.KWHzl(DataSerializerModule.copydefault.EZpvd(), C43284rmQ.copydefault()), GsonConverterFactory.create());
    }

    @Override // o.C43280rmM
    public RequestTagEnum getRequestHeaderTag() {
        return RequestTagEnum.WEB3;
    }

    @Override // o.C43280rmM
    public java.util.List<Interceptor> buildPreCustomInterceptors() {
        return C56402yEa.EZpvd(TaskDescription.AEQbTJ);
    }

    @Override // o.C43280rmM
    public OkHttpClient.Builder initClientBuilder() {
        OkHttpClient.Builder builderInitClientBuilder = super.initClientBuilder();
        builderInitClientBuilder.addInterceptor(ActionBar.OLrzqt);
        builderInitClientBuilder.addInterceptor(new C6892aXu(null));
        return builderInitClientBuilder;
    }

    /* JADX INFO: renamed from: o.mRs$ActionBar */
    public static final class ActionBar implements Interceptor {
        public static final ActionBar OLrzqt = new ActionBar();

        private ActionBar() {
        }

        @Override // okhttp3.Interceptor
        public Response intercept(@NotNull Interceptor.Chain chain) {
            Intrinsics.checkNotNullParameter(chain, "");
            Request.Builder builderNewBuilder = chain.request().newBuilder();
            for (Map.Entry<java.lang.String, java.lang.String> entry : mPY.OLrzqt.copydefault("default_trade").AEQbTJ().AEQbTJ().entrySet()) {
                builderNewBuilder.header(entry.getKey(), entry.getValue());
            }
            if (!chain.request().headers().names().contains("Encrypt-Strategy")) {
                builderNewBuilder.header("OK-VERIFY-TOKEN", "");
            }
            return chain.proceed(builderNewBuilder.build());
        }
    }

    /* JADX INFO: renamed from: o.mRs$TaskDescription */
    public static final class TaskDescription implements Interceptor {
        public static final TaskDescription AEQbTJ = new TaskDescription();

        private TaskDescription() {
        }

        @Override // okhttp3.Interceptor
        public Response intercept(@NotNull Interceptor.Chain chain) {
            Intrinsics.checkNotNullParameter(chain, "");
            return chain.proceed(chain.request().newBuilder().addHeader("Subdomain-Strategy", SubdomainStrategy.Global.INSTANCE.toString()).build());
        }
    }
}
