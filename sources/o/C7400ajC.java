package o;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: renamed from: o.ajC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C7400ajC {
    public static final OkHttpClient.Builder AEQbTJ;
    public static final C7400ajC EZpvd = new C7400ajC();
    public static final int OLrzqt;
    public static final Retrofit copydefault;

    private C7400ajC() {
    }

    static {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        builder.readTimeout(20L, timeUnit);
        builder.connectTimeout(20L, timeUnit);
        builder.addInterceptor(C6851aXF.EZpvd);
        AEQbTJ = builder;
        copydefault = new Retrofit.Builder().baseUrl(C43292rmY.OLrzqt.fJNWhG()).client(builder.build()).addConverterFactory(GsonConverterFactory.create()).addCallAdapterFactory(RxJava2CallAdapterFactory.create()).build();
        OLrzqt = 8;
    }

    public final InterfaceC7448ajy EZpvd() {
        java.lang.Object objCreate = copydefault.create(InterfaceC7448ajy.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "");
        return (InterfaceC7448ajy) objCreate;
    }
}
